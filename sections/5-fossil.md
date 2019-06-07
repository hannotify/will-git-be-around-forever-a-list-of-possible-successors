<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Fossil

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 24 min.

Now we get to the more serious contenders!
And first up is Fossil.

---

## Features that Fossil promises

* **distributed** version control
* **integrated bug tracking**, wiki, forum and technotes
* built-in **web interface**
* **autosync** mode
* show **descendants** of a check-in
* supports operations on multiple repositories (`fossil all`)

<https://www.fossil-scm.org> <!-- element: class="attribution" -->

note:
* **autosync mode** - pushes automatically after each check-in

---

## Quick facts

* Written in C and SQL
* Is the VCS of choice for the SQLite project
* 'Github in a box'
* Free code hosting at:
  * Chisel - <http://chiselapp.com/>
  * SourceForge - <http://fossilrepos.sourceforge.net> 

note:
Though the SourceForge implementation is a bit unorthodox.
Because Fossil needs just an SQLite database to generate static HTML.
So any hosting space provider could do the job.

---

## Uses a relational database

* a repository is stored in a single SQLite database file
* contains relations between check-ins to be able to produce both ancestors and descendants of a check-in 

![Fossil logo](img/logos/fossil.png) <!-- .element: class="no-background" width="12%" -->

note:
In Git a single commit knows only who its ancestor is.
So producing a list of all descendants of a commit is nearly impossible.
Both native Git and GitHub don't provide this capability.

---

## 'Github in a box'

* repository UI (`fossil ui`)
* wiki, ticketing &amp; bug tracking
* embedded documentation
* technical notes
* forum

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
* Resolving conflicts

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
Because Fossil repositories are stored in a single file.

---

## Fossil for Git users

<https://www.fossil-scm.org/home/doc/trunk/www/fossil-v-git.wiki> 
