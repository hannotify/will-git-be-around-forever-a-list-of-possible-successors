<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Pijul

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 36 min.

---

<!-- .slide: data-background="img/background/pijul.jpg" data-background-color="black" data-background-opacity="0.8"-->
## pi · jul <!-- .element: class="stroke" -->

<blockquote class="explanation">
    or <em>crotophaga sulcirostris</em>, a bird known to do collaborative nest building.
</blockquote>

<https://commons.wikimedia.org/wiki/File:Museo_de_la_Naturaleza_de_Cantabria_(208).jpg> <!-- .element: class="attribution" -->

---

## Features that Pijul promises

* distributed version control <!-- .element: class="fragment fade-in-then-semi-out" -->
* simple, because of its basis on a sound theory of patches <!-- .element: class="fragment fade-in-then-semi-out" -->
* fast, because it aims to fix the Darcs performance issues <!-- .element: class="fragment fade-in-then-semi-out" -->
* interactive recording <!-- .element: class="fragment fade-in-then-semi-out" -->

<https://www.pijul.com> <!-- element: class="attribution" -->

note:
Darcs is a version control system from 2003 that is also patch-based.
However it didn't gain much popularity due to the fact that it was very slow.
It was also in the VCS popularity graph that I showed you earlier.

---

## Quick facts

<ul>
    <li class="fragment fade-in-then-semi-out">written in Rust
    <li class="fragment fade-in-then-semi-out">bootstrapped since April 2017
    <li class="fragment fade-in-then-semi-out">free code hosting at 
    <a href="https://nest.pijul.com">https://nest.pijul.com</a> 
</ul>

note:
Rust is one of the faster languages around, because it is a low-level language.
Its performance is comparable to that of C++.

Bootstrapped means that it is used for its own development.

And the Pijul Nest can be a good alternative to GitHub if you're fed up with them for wanting to own everything anyone has ever done.

---

![fed-up-with-github](img/fed-up-with-github.png "Fed up with Github!")
![how-about-pijul-nest](img/how-about-pijul-nest.png "How about Pijul Nest?") <!-- .element class="fragment" -->

---

## Patch-oriented design

<ul>
    <li class="fade-in-then-semi-out">A patch is an intuitive atomic unit of work.</li>
    <li class="fragment fade-in-then-semi-out">It focuses on <em>changes</em>, instead of <em>differences between snapshots</em> (i.e. Git commits).</li>
    <li class="fragment fade-in-then-semi-out">Applying or unapplying a patch <em>doesn't change</em> its identity.</li>
    <li class="fragment fade-in-then-semi-out">The end result of applying several patches is always the same, regardless of the order in which they were applied.</li>
    <li class="fragment fade-in-then-semi-out">Pijul keeps track of 'dependent patches'</li>
    <li class="fragment fade-in-then-semi-out">No merges or rebases; applying a patch is like <code>git cherry-pick</code>.</li>
</ul>

note:
By contrast, Git doesn't store any patches.
It stores snapshots of files and computes the differences when they are needed.

---

<!-- .slide: data-background="img/snapshot-vs-patch.png" data-background-color="#ccc" data-background-size="contain"-->

<https://www.katacoda.com/ysndr/scenarios/pijul/assets/comparison.png> <!-- .element class="attribution" -->

---

## Quick demo

* Up and running
* Recording patches

note:

!! put the ThreadLocalRandom implementation in the clipboard before starting the demo !!

`return java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 7);`

### Up and running

    pijul init demo
    touch Sample.java
    pijul status
    pijul add Sample.java
    mkdir directory
    pijul add directory
    pijul status
    pijul record

(Here `y` means yes, `n` means no, `k` means undo and remake last decision, `a` means include this and all remaining patches, `d` means include neither this patch nor the remaining patches and `i` means ignore this file locally (i.e. it is added to .pijul/local/ignore).)

### Generating random numbers

**!!! Roll the die on stage !!!**

    public class Sample { 
        public static void main(String... args) {
            System.out.println(random());
        }
        private static int random() {
            // Chosen by fair dice roll; guaranteed to be random.
            return 4;
        }
    }

    pijul add Sample.java
    pijul record
    private static int random() {
        return 1 + new java.util.Random().nextInt(6);
    }
    pijul add Sample.java
    pijul record
    private static int random() {
        return java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 7);
    }
    pijul add Sample.java
    pijul record
    pijul unrecord // unrecord all patches and squash them into one
    pijul add Sample.java
    pijul record

Zie `misc/MyRandom.java` voor als je de details vergeet.

---

## The Bad

<ul>
    <span class="fragment">
        <li>Usability needs some work</li>
        <small><a href="https://mivehind.net/2017/04/09/pijul-first-thoughts">https://mivehind.net/2017/04/09/pijul-first-thoughts</a></small>
    </span>
    <span class="fragment">
        <li>Complete rewrite in progress for v1.0</li>
        <small><a href="https://pijul.org/posts/2020-11-07-towards-1.0">https://pijul.org/posts/2020-11-07-towards-1.0</a></small>
    </span>    
</ul>

note:

So in the demo I used Pijul 0.12, which was clearly labeled as a preview version for research purposes.
So not production-ready in the slightest.

Now what would you do if you're building a version control system and a bug has to be fixed?
This turns out to be quite a challenge.
Version control systems that use itself for its versioning (bootstrapping) are famously hard when dealing with bugs.
If you're building a compiler, for example, bootstrapping can be done one step at a time, and previous versions are always available to compile your current one.
But a version control system has the additional problem that the previous versions might not always be easily accessible if there is a bug.

So this is exactly what happened to Pijul.
A few months after the release of Pijul 0.12, a user reported a defect regarding the unrecording of patches that were previously involved in a conflict.
After some time a solution was found, but it meant that a new patch format was needed, along with a few new algorithms.
So, Pijul had to be rewritten from scratch to make it all work, which obviously resulted in a lot of breaking changes.

---

## Pijul towards v1.0

* New change format; 'patches' are now called 'changes' <!-- .element: class="fade-in-then-semi-out" -->
* 'Branches' are now called 'channels' <!-- .element: class="fragment fade-in-then-semi-out" -->
* Better support for large files and repositories by compressing changes <!-- .element: class="fragment fade-in-then-semi-out" -->
* Interactive recording is replaced by a 'change draft screen' <!-- .element: class="fragment fade-in-then-semi-out" -->
* Version identifiers that don't depend on any order <!-- .element: class="fragment fade-in-then-semi-out" -->
* Documentation is lagging a bit <!-- .element: class="fragment fade-in-then-semi-out" -->

note:

So this is what the Pijul maintainers are doing to make Pijul production-ready.

* change draft screen

Which looks a bit like the interactive rebase screen in Git.

* documentation is lagging

I've used the Pijul v1.0-alpha for a bit in preparation for this talk and I found that the documentation is lagging a bit.
It used to be better in v0.12.
Which is no surprise, because the rewrite is not done yet.
Moreover, the Pijul maintainers had to deal with the setbacks that were caused by a fire in their data center.

---

<!-- .slide: data-background="img/background/ovh-fire.jpeg" data-background-color="black" data-background-opacity="1.0"-->

<https://www.reuters.com/article/us-france-ovh-fire-idUSKBN2B20NU> <!-- .element class="attribution" -->

note:

Maybe you've heard about it; it was a fire in the OVHcloud data center in Paris, France, that happened in March.

Overall, I think Pijul is quite promising, but it needs some work in its current alpha phase.
So some of its popularity will be depending on how they will get to beta and stable versions later this year.
