<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Fossil

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 30 min.

---

## Features that Fossil promises

* **distributed** version control
* **integrated bug tracking**, wiki, forum and technotes
* built-in **web interface**
* **autosync** mode
* show **descendants** of a checkin
* supports operations on multiple repositories (`fossil all`)

<https://www.fossil-scm.org> <!-- element: class="attribution" -->

note:
FIXME: uitbreiden

* **autosync mode** - push automatically after each check-in

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

note:
FIXME:
The difference is that Git stores its objects as individual files in the ".git" folder or compressed into bespoke "pack-files", whereas Fossil stores its objects in a relational (SQLite) database file. To put it another way, Git uses an ad-hoc pile-of-files key/value database whereas Fossil uses a proven, general-purpose SQL database. This difference is more than an implementation detail. It has important consequences.

With Git, one can easily locate the ancestors of a particular check-in by following the pointers embedded in the check-in object, but it is difficult to go the other direction and locate the descendants of a check-in. It is so difficult, in fact, that neither native Git nor GitHub provide this capability. With Git, if you are looking at some historical check-in then you cannot ask "what came next" or "what are the children of this check-in".

Fossil, on the other hand, parses essential information about check-ins (parents, children, committers, comments, files changed, etc.) into a relational database that can be easily queried using concise SQL statements to find both ancestors and descendents of a check-in.

---

## 'Github in a box'

* repository UI
* wiki, ticketing &amp; bug tracking
* embedded documentation
* technical notes
* forum

note:
FIXME: 
So there's no need to use 3rd party products; after cloning a repo you have a fully-featured developer website available.

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

<https://www.omiyagames.com/blog/2014/02/15/farewell-fossil-version-control> <!-- .element: class="attribution" -->

note:
Because Fossil repositories are stored in a single file.

---

## Fossil for Git users

<https://www.fossil-scm.org/home/doc/trunk/www/fossil-v-git.wiki> 
