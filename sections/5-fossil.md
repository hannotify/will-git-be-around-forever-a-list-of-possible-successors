<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Fossil

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 35 min.

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
So any hosting space provider would do the job.

---

## Uses a relational database

note:
FIXME:
The difference is that Git stores its objects as individual files in the ".git" folder or compressed into bespoke "pack-files", whereas Fossil stores its objects in a relational (SQLite) database file. To put it another way, Git uses an ad-hoc pile-of-files key/value database whereas Fossil uses a proven, general-purpose SQL database. This difference is more than an implementation detail. It has important consequences.

With Git, one can easily locate the ancestors of a particular check-in by following the pointers embedded in the check-in object, but it is difficult to go the other direction and locate the descendants of a check-in. It is so difficult, in fact, that neither native Git nor GitHub provide this capability. With Git, if you are looking at some historical check-in then you cannot ask "what came next" or "what are the children of this check-in".

Fossil, on the other hand, parses essential information about check-ins (parents, children, committers, comments, files changed, etc.) into a relational database that can be easily queried using concise SQL statements to find both ancestors and descendents of a check-in.

---

## Cathedral vs. Bazaar

note:
FIXME:
Fossil and Git promote different development styles. Git promotes a "bazaar" development style in which numerous anonymous developers make small and sometimes haphazard contributions. Fossil promotes a "cathedral" development model in which the project is closely supervised by an highly engaged architect and implemented by a clique of developers.

Nota Bene: This is not to say that Git cannot be used for cathedral-style development or that Fossil cannot be used for bazaar-style development. They can be. But those modes are not their design intent nor their low-friction path.

Git encourages a style in which individual developers work in relative isolation, maintaining their own branches and occasionally rebasing and pushing selected changes up to the main repository. Developers using Git often have their own private branches that nobody else ever sees. Work becomes siloed. This is exactly what one wants when doing bazaar-style development.

Fossil, in contrast, strives to keep all changes from all contributors mirrored in the main repository (in separate branches) at all times. Work in progress from one developer is readily visible to all other developers and to the project leader, well before the code is ready to integrate. Fossil places a lot of emphasis on reporting the state of the project, and the changes underway by all developers, so that all developers and especially the project leader can maintain a better mental picture of what is happening, and better situational awareness.

---

## Quick demo

* Up and running
* Using the web interface (`fossil ui`)
* Retrieving descendants of a checkin
* Resolving conflicts

note:

### Up and running

<!-- TODO: oefen de demo 
En gebruik daarbij doitlive of demo-magic -->

### Using the web interface

### Retrieving descendants of a checkin

Inhoud van de demo:
* Schrijf een klasse die een random nummer genereert.
* Eerste implementatie: gooi een dobbelsteen.
* Tweede implementatie: (int) Math.random() * 6
  * deze implementatie moet een conflict veroorzaken.

---

## Fossil for Git users

<https://www.fossil-scm.org/home/doc/trunk/www/fossil-v-git.wiki>
