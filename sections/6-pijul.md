<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Pijul

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 13 min.

Time to dive into Pijul.

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

<https://www.pijul.com> <!-- element: class="attribution" -->

note:
Darcs is a version control system from 2003 that is also patch-based.
However it didn't gain much popularity due to the fact that it was very slow.
It was also in the VCS popularity graph that I showed you earlier.

---

## Quick facts

<ul>
    <li class="fragment fade-in-then-semi-out">written in Rust
    <li class="fragment fade-in-then-semi-out">free code hosting at 
    <a href="https://nest.pijul.com">https://nest.pijul.com</a> 
</ul>

note:
Rust is one of the faster languages around, because it is a low-level language.
Its performance is comparable to that of C++.

Hosting is available on the Pijul Nest.

---

## Patch-oriented design


<ul>
    <li class="fragment fade-in-then-semi-out">A patch is an intuitive atomic unit of work.</li>
    <li class="fragment fade-in-then-semi-out">It focuses on <em>changes</em>, instead of <em>differences between snapshots</em> (i.e. Git commits).</li>
    <li class="fragment fade-in-then-semi-out">Applying or unapplying a patch <em>doesn't change</em> its identity.</li>
    <li class="fragment fade-in-then-semi-out">The end result of applying several patches is always the same, regardless of the order in which they were applied.</li>
    <li class="fragment fade-in-then-semi-out">Pijul keeps track of 'dependent patches'</li>
    <li class="fragment fade-in-then-semi-out">Rebase and merge don't exist, applying a patch (and its dependencies) is like <code>git cherry-pick</code>.</li>
</ul>

note:
Let's zoom in on this "patch-oriented design".

[walk through the bullet list]

[on **identity**]
By contrast, Git doesn't store any patches.
It stores snapshots of files and computes the differences when they are needed.
In Git each snapshot has its own identity. 

[on **order**]
Changes in Pijul can be applied in any order. This is great for cherry-picking: Pijul knows the changes that need to come along, and maintains the identity of the change after the cherry-pick. No need to manually find the commits to revert or pick.

[on **rebase** and **merges**]
Conflicts in Pijul are modeled as normal states of collaboration.
Conflicts are resolved by regular changes, which are valid for the same conflicts in any other context.
Patches can even be applied to a conflicting repository, leaving the conflict resolution for later.

---

## If commits were bank transactions

<table>
        <tr>
            <th/>
            <th>snapshot</th>
            <th>patch</th>
        </tr>
        <tr class="fragment">
            <th align="right">initial balance</th>
            <td align="right"><code>100</code></td>
            <td align="right"><code>+100</code></td>
        </tr>  
        <tr class="fragment">
            <th align="right">salary</th>
            <td align="right"><code>400</code></td>
            <td align="right"><code>+300</code></td>
        </tr>
        <tr class="fragment">
            <th align="right">heating</th>
            <td align="right"><code>0</code></td>
            <td align="right"><code>-400</code></td>
        </tr>
</table>


note:

Snapshots store account balance, patches store deltas.
Which means patch order doesn't matter for the final result.

---

## Quick demo

* Up and running
* Recording patches
* Reordering patches

note:

### Up and running

See Trello card [Demo's "Successor of Git"](https://trello.com/c/gfvXNMKg/96-demos-successor-of-git)


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

    -- FINAL PART IS OPTIONAL --

    pijul unrecord --reset <hash> (movie)
    pijul unrecord --reset <hash> (another movie)

---

## Pijul's current status

<ul>
    <li>v1.0-beta</li>
    <small><a href="https://pijul.org/posts/2022-01-08-beta">https://pijul.org/posts/2022-01-08-beta</a></small>
</ul>

note:

Pijul is now feature-complete and it will be backwards-compatible from now on.
However, it is still in beta.

Overall, I think Pijul is quite promising, but it needs some work in its current beta phase.
So some of its popularity will be depending on how they will get stable versions later this year.
