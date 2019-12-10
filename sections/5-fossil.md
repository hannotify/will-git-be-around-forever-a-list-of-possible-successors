<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Fossil

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 24 min.

Now we get to the more serious contenders!
And first up is Fossil.

---

## Features that Fossil promises

<ul>
    <li class="fragment fade-in-then-semi-out">distributed version control</li>
    <li class="fragment fade-in-then-semi-out">integrated bug tracking, wiki, forum and technotes</li>
    <li class="fragment fade-in-then-semi-out">built-in web interface</li>
    <li class="fragment fade-in-then-semi-out">autosync mode</li>
    <li class="fragment fade-in-then-semi-out">show descendants of a check-in</li>
    <li class="fragment fade-in-then-semi-out">supports operations on multiple repositories (<code>fossil all</code>)</li>
</ul>

<a href="https://www.fossil-scm.org" class="attribution">https://www.fossil-scm.org</a>

note:
* **autosync mode** - pushes automatically after each check-in

---

## Quick facts

* Written in C and SQL <!-- .element: class="fragment fade-in-then-semi-out" -->
* Is the VCS of choice for the SQLite project <!-- .element: class="fragment fade-in-then-semi-out" -->
* 'Github in a box' <!-- .element: class="fragment fade-in-then-semi-out" -->
* Free code hosting at: <!-- .element: class="fragment fade-in-then-semi-out" -->
  * Chisel - <http://chiselapp.com/>
  * SourceForge - <http://fossilrepos.sourceforge.net> 

note:
Though the SourceForge implementation is a bit unorthodox.
Because Fossil needs just an SQLite database to generate static HTML.
So any hosting space provider could do the job.

---

## Uses a relational database

* a repository is stored in a single SQLite database file <!-- .element: class="fragment fade-in-then-semi-out" -->
* contains relations between check-ins to be able to produce both ancestors and descendants of a check-in <!-- .element: class="fragment fade-in-then-semi-out" -->

![Fossil logo](img/logos/fossil.png) <!-- .element: class="no-background" width="12%" -->

note:
In Git a single commit knows only who its ancestor is.
So producing a list of all descendants of a commit is nearly impossible.
Both native Git and GitHub don't provide this capability.

---

## 'Github in a box'

<ul>
    <li class="fragment fade-in-then-semi-out">repository UI (<code>fossil ui</code>)</li>
    <li class="fragment fade-in-then-semi-out">wiki, ticketing &amp; bug tracking</li>
    <li class="fragment fade-in-then-semi-out">embedded documentation</li>
    <li class="fragment fade-in-then-semi-out">technical notes</li>
    <li class="fragment fade-in-then-semi-out">forum</li>
</ul>

note:
And, speaking of Github, Fossil is actually some sort of 'Github in a box'.
A feature-rich web interface is available through the command `fossil ui`.
So there's no need to use any 3rd party products; after cloning a repo you have a fully-featured developer website available.

This makes Fossil:
* Well-suited for startups and small-scale projects ('SQLite-style')
* But not really for large-scale open-source development ('Linux-style')

---

## Quick demo

* Up and running
* Using the web interface (`fossil ui`)
* Retrieving descendants of a checkin

note:

### Up and running

    cd ~/development/fossil
    mkdir demo
    fossil new demo.repo
    cd demo
    fossil open ../demo.repo
    touch Sample.java
    fossil changes
    fossil add .
    fossil commit -m "message"

### Using the web interface

    fossil ui

### Retrieving descendants of a checkin

    fossil descendants [hash]

### Close

    fossil close

---

## The Bad

* Dealing with large files 
* Dealing with large commits

<https://www.omiyagames.com/blog/2014/02/15/farewell-fossil-version-control>

note:
The problem occurs because Fossil puts every revision into a single file, and when you have a ton of files to pack into a single file, it exceeds the computer memory. So maybe Fossil's garbage collect is not yet as sophisticated as the one currently present in Git.

---

## Fossil for Git users

<https://www.fossil-scm.org/home/doc/trunk/www/fossil-v-git.wiki> 
