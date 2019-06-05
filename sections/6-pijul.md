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

* Up and running
* Recording patches
* Ignore
* Removing patches
* Patch dependencies
* Branches
  * (but maybe we don't need them)
* Resolving Conflicts
* Nest demo - <https://nest.pijul.com/pijul_org/pijul>

note:
<!-- TODO: oefen de demo 
En gebruik daarbij doitlive of demo-magic -->

Inhoud van de demo:
* Schrijf een klasse die een random nummer genereert.
* Eerste implementatie: gooi een dobbelsteen.
* Tweede implementatie: (int) Math.random() * 6
  * deze implementatie moet een conflict veroorzaken.
* Derde implementatie: java.util.Random.nextInt(7).
  * deze implementatie moet een conflict veroorzaken.

Zie `misc/MyRandom.java` voor als je de details vergeet.

---

## Pijul for Git users

<https://nest.pijul.com/tae/pijul-for-git-users>
