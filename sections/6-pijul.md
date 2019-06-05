<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Pijul

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 42 min.

---

<!-- .slide: data-background="img/background/pijul.jpg" data-background-color="black" data-background-opacity="0.8"-->
## pi · jul <!-- .element: class="stroke" -->

<blockquote class="explanation">
    or <em>crotophaga sulcirostris</em>, a bird known to do collaborative nest building.
</blockquote>

<https://commons.wikimedia.org/wiki/File:Museo_de_la_Naturaleza_de_Cantabria_(208).jpg> <!-- .element: class="attribution" -->

---

## Features that Pijul promises

* **distributed** version control
* **simple**, because of its basis on a *sound theory of patches*
* **fast**, because it aims to fix the Darcs performance issues
* **interactive** recording

<https://www.pijul.com> <!-- element: class="attribution" -->

note:
Darcs is a version control system from 2003 that is also patch-based.
However it didn't gain much popularity due to the fact that it was very slow.

---

## Quick facts

* written in Rust
* *bootstrapped* since April 2017
* free code hosting at <https://nest.pijul.com>

note:

Rust is one of the faster languages around, because it is a low-level language.
Its performance is comparable to that of C++.

Bootstrapped means that it is used for its own development.

---

## Patch-oriented design

* A patch is an intuitive atomic unit of work.
* It focuses on *changes*, instead of *differences between snapshots* (i.e. Git commits).
* Applying or unapplying a patch *doesn't change* its identity.
* The end result of applying several patches is always the same, regardless of the order in which they were applied.

note:
FIXME: toelichting schrijven

---

## Quick demo

<!-- FIXME: dit gaan we niet allemaal demonstreren, zie de notes --->

* Up and running
* Recording patches
* Branches
  * (but maybe we don't need them - https://nest.pijul.com/tae/pijul-for-git-users)
* Resolving Conflicts
* Nest demo - <https://nest.pijul.com/pijul_org/pijul>

note:

### Up and running

    pijul init demo
    touch Sample.java
    pijul status
    pijul add Sample.java
    mkdir directory
    pijul add directory
    pijul status
    pijul record 

    (Here y means yes, n means no, k means undo and remake last decision, a means include this and all remaining patches, d means include neither this patch nor the remaining patches and i means ignore this file locally (i.e. it is added to .pijul/local/ignore).)

### Generating random numbers

!!! Throw the dice on stage !!!

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

### Handling conflicts

    pijul fork use-math-random
    pijul checkout use-math-random

    private static int random() {
        return (int)(Math.random() * 6);
    }

    pijul add Sample.java
    pijul record

    pijul checkout master
    pijul fork use-random-class
    pijul checkout use-random-class

    private static int random() {
        return new java.util.Random().nextInt(7);
    }

    pijul add Sample.java
    pijul record

    pijul checkout use-math-random
    pijul apply [hash]
    pijul add Sample.java
    pijul record

Zie `misc/MyRandom.java` voor als je de details vergeet.

### Nest Demo

<https://nest.pijul.com/pijul_org/pijul>

---

## The Bad

* Usability needs to improve 
* FIXME: verzin er nog een

<https://mivehind.net/2017/04/09/pijul-first-thoughts> <!-- .element: class="attribution" -->

---

## Pijul for Git users

<https://nest.pijul.com/tae/pijul-for-git-users>


FIXME: verwerk dit nog ergens (bron: https://news.ycombinator.com/item?id=19090514)

I've not used Pijul, but I used Darcs — which Pijul is essentially an improved clone of — for half a decade, and I assume it's roughly the same.
The patch model is incredible. Think of "git cherry-pick". Imagine you could use that instead of "git merge" or "git rebase" for all your work. Imagine that every time you cherry-picked, it would tell you which additional commits you'd need, and then pick them for you. And that when you merged your heavily cherry-picked branch back into the mainline, it just worked. That's Pijul/Darcs.

One doesn't have to understand the "theory of patches" to use Pijul/Darcs. As a user, you just work with changes, just like Git. But the UX is much simpler than Git — in a good way.

I remember switching from Darcs to Git back in 2008 or so. It was like switching out a sleek spaceship [] for an old rusty, clanking pickup truck. Git has gotten better over the years, but ultimately, I think Github was the killer app, not Git. Going back technical merits alone, Darcs and Mercurial "should" have won that battle.