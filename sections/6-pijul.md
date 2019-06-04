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

note:
FIXME: link over Pijul toevoegen:
* https://www.pijul.com/

---

## Features that Pijul promises

* **distributed** version control
* **simple**, because of its basis on a *sound theory of patches*
* **fast**, because it aims to fix the Darcs performance issues

---

## Quick facts

* written in Rust
* *bootstrapped* since April 2017
* comes with a hosting platform called 'The Nest'

note:

Rust is one of the faster languages around, because it is a low-level language.
Its performance is comparable to that of C++.

Bootstrapped means that it is used for its own development.

---

## Patch-oriented design

<!-- TODO: werking uitleggen -->

---

## Quick demo

* Recording patches
* Ignore
* Removing patches
* Patch dependencies
* Branches
  * (but maybe we don't need them)
* Resolving Conflicts

note:
TODO: demo voorbereiden

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
