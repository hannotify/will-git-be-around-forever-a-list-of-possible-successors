<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Pijul

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 27 min.

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
Like IntelliJ, they 'eat their own dog food'.

Hosting is available on the Pijul Nest.

---

## Patch-oriented design

<ul>
    <li class="fragment fade-in-then-semi-out">A patch is an intuitive atomic unit of work.</li>
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

<!-- .slide: data-background="img/snapshot-vs-patch.png" data-background-color="#555" data-background-size="contain"-->

<https://www.katacoda.com/ysndr/scenarios/pijul/assets/comparison.png> <!-- .element class="attribution" -->

---

## Quick demo

* Up and running
* Recording patches
* Reordering patches

note:

### Up and running

    pijul init demo

### Recording patches

    vi README.md
    > This repo contains beers and movies that are important to me.
    pijul add Readme.md
    pijul record -m "Initial patch"

    #Identities
    pijul key generate hanno

    mkdir directory
    pijul add directory
    pijul record

### Reordering patches

    pijul init beers-and-movies
    cd beers-and-movies
    touch README.md
    pijul add README.md
    pijul record -m "Initial patch"
    pijul fork next-week
    pijul channel
    pijul channel switch next-week
    pijul channel switch main
    vi movies.txt
    pijul add movies.txt
    pijul record -m "Watched a movie"
    vi beers.txt
    pijul add beers.txt
    pijul record -m "Drank a beer"
    vi movies.txt
    pijul add * 
    pijul record -m "Watched another movie"
    pijul log
    // copy the hashes somewhere, or duplicate the terminal tab
    pijul channel switch next-week
    pijul apply <hash> (beer)
    ls
    pijul log
    pijul apply <hash> (another movie)
    // notice the dependent patch!
    ls
    pijul log

    pijul unrecord --reset <hash> (movie)
    pijul unrecord --reset <hash> (another movie)

---

## Pijul's current status

<ul>
    <li>v1.0-beta</li>
    <small><a href="https://pijul.org/posts/2022-01-08-beta">https://pijul.org/posts/2022-01-08-beta</a></small>
</ul>

note:

Previous version of the talk I used v0.12, which was clearly labeled as a preview version for research purposes.
v1.0 uses a complete rewrite of the patch format, amongst other things.

A few months after the release of Pijul 0.12, a user reported a defect regarding the unrecording of patches that were previously involved in a conflict.
After some time a solution was found, but it meant that a new patch format was needed, along with a few new algorithms.
So, Pijul had to be rewritten from scratch to make it all work, which obviously resulted in a lot of breaking changes.

It is now feature-complete and it will be backwards-compatible from now on.
However, it is still in beta.

Overall, I think Pijul is quite promising, but it needs some work in its current beta phase.
So some of its popularity will be depending on how they will get stable versions later this year.
