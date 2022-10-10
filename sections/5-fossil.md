<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Fossil

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 4 min.

Let's talk about Fossil first.

---

## Features that Fossil promises

<ul>
    <li class="fragment fade-in-then-semi-out">distributed version control</li>
    <li class="fragment fade-in-then-semi-out">integrated bug tracking, wiki, forum and technotes</li>
    <li class="fragment fade-in-then-semi-out">built-in web interface</li>
    <li class="fragment fade-in-then-semi-out">both autosync and manual merge mode</li>
    <li class="fragment fade-in-then-semi-out">show descendants of a check-in</li>
    <li class="fragment fade-in-then-semi-out">supports operations on multiple repositories (<code>fossil all</code>)</li>
    <li class="fragment fade-in-then-semi-out">a 'preserve all history' philosophy</li>
</ul>

<a href="https://www.fossil-scm.org" class="attribution">https://www.fossil-scm.org</a>

note:
* integrated project management (bug tracking, wiki, forum and technotes) - 
  * 'Github in a box'
  * A feature-rich web interface is available through the command `fossil ui`.
  * So there's no need to use any 3rd party products; after cloning a repo you have a fully-featured developer website available.
* built-in web interface - the Fossil website actually runs on the same web interface
* **autosync mode** - performs an automatic push after each commit
* **manual merge mode** - like Git and Hg
* **preserve all history** - there is no rebase in Fossil. Also: why would it be called 'Fossil'?

---

## Quick facts

* Written in C and SQL <!-- .element: class="fragment fade-in-then-semi-out" -->
* Is the VCS of choice for the SQLite project <!-- .element: class="fragment fade-in-then-semi-out" -->
* Free code hosting at: <!-- .element: class="fragment fade-in-then-semi-out" -->
  * Chisel - <http://chiselapp.com/>
* Or simply host it yourself using an SQLite database and a web server <!-- .element: class="fragment fade-in-then-semi-out" -->

note:

It was even written specifically to support development of SQLite.

Fossil needs just an SQLite database to generate static HTML.
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

## Quick demo

* Up and running
* Using the web interface (`fossil ui`)
* Retrieving descendants of a checkin

note:

See Trello card [Demo's "Successor of Git"](https://trello.com/c/gfvXNMKg/96-demos-successor-of-git)

---

## Git vs. Fossil

<table style="font-size: 100%">
    <thead>
        <tr>
            <th/>
            <th>Git</th>
            <th>Fossil</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><strong>Sample project</strong></td>
            <td>Linux kernel</td>
            <td>SQLite</td>
        </tr>
        <tr>
            <td><strong>Contributors</strong></td>
            <td>5,000+</td>
            <td>4</td>
        </tr>                
        <tr>
            <td><strong>Engagement</strong></td>
            <td>Global</td>
            <td>Personal</td>
        </tr>
        <tr>
            <td><strong>Workflow</strong></td>
            <td>Hierarchy</td>
            <td>Trust</td>
        </tr>
    </tbody>
</table>

<https://www.fossil-scm.org/home/doc/trunk/www/fossil-v-git.wiki> <!-- .element class="attribution" -->

note:

* Really makes you think about 'the right tool for the job'
* Fossil seems more suitable for small-scale, closed-source projects than Git

So why are we all using Git, a version control system that was designed to support a globally-developed open-source project like the Linux kernel?
Are all projects like that?
Is your project like the Linux kernel?
Or does it look more like SQLite?
Surely something to think about.
