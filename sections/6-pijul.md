<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Pijul

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 33 min.

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
* Pijul keeps track of 'dependent patches'
* No merges or rebases; applying a patch is like `git cherry-pick`.

note:
In contrast, Git doesn't store any patches.
It stores snapshots.

---

## Quick demo

* Up and running
* Recording patches
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

!!! Roll the die on stage !!!

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
        return (int)(Math.random() * 6);
    }

    pijul add Sample.java
    pijul record

    private static int random() {
        return new java.util.Random().nextInt(7);
    }

    pijul add Sample.java
    pijul record

Zie `misc/MyRandom.java` voor als je de details vergeet.

### Nest Demo

<https://nest.pijul.com/pijul_org/pijul>

---

## The Bad

* Usability needs to improve 

<https://mivehind.net/2017/04/09/pijul-first-thoughts>

---

## Pijul for Git users

<https://nest.pijul.com/tae/pijul-for-git-users>
