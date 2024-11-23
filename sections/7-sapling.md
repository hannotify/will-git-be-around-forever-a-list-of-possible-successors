<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Sapling <!-- .element class="stroke" -->

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note:

**Time Elapsed:** `32:00`.

---

## Features that Sapling promises

<ul>
    <li class="fragment fade-in-then-semi-out">able to scale to 10M+ commits/files/branches</li>
    <li class="fragment fade-in-then-semi-out">user-friendly commands</li>
    <li class="fragment fade-in-then-semi-out">native pull requests</li>
    <li class="fragment fade-in-then-semi-out">integrates with Git and GitHub</li>
</ul>

<a href="https://sapling-scm.com/">sapling-scm.com</a>

![Sapling logo](https://sapling-scm.com/img/Sapling_logo-white.svg) <!-- .element: class="no-background" width="30%" -->

note:

* again, distributed

---

## Quick facts

<ul>
    <li class="fragment fade-in-then-semi-out">developed and used at Meta</li>
    <li class="fragment fade-in-then-semi-out">started in 2013, open-sourced in 2022</li>
    <li class="fragment fade-in-then-semi-out">able to handle very large repos</li>
    <li class="fragment fade-in-then-semi-out">local branches are optional</li>
    <li class="fragment fade-in-then-semi-out">commands generally do a single thing</li>
    <li class="fragment fade-in-then-semi-out">geared towards corporate, always-online, rebase-instead-of-merge, monorepo environments</li>
</ul>

note:

**developed and used at Meta**
Started 10 years ago as an effort to make Meta’s monorepo scale, because existing VCS's couldn't manage the monorepo efficiently. 
Along the way Meta saw opportunities to also improve UX, so that their new engineers could understand their repos faster.

**able to handle very large repos**
Meta uses monorepo's (or should I say 'monorepo'?) - 10’s of millions of files/commits/branches according to the Sapling docs. 
Caveat: to really make use of this you also need the virtual file system and Sapling server which haven't been open sourced yet.

**local branches are optional**
You can create 'stacks' of commits, but you don't have to add a label to it.
You can, but it's not mandatory.

**commands do a single thing**
Git has commands like `checkout`, `reset` that can do different things based on how you use them.
Sapling commands generally do a single thing.

**geared towards ...**
So it's geared to the situation at Meta

---

## Quick demo

* Up and running
* Creating commits
* Web UI
* Submitting PRs

note:

**Time Elapsed:** `35:00`.

---

## Git vs. Sapling

<table style="font-size: 100%">
    <thead>
        <tr>
            <th/>
            <th>Git</th>
            <th>Sapling</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><strong>Local branches</strong></td>
            <td>Mandatory</td>
            <td>Optional</td>
        </tr>
        <tr>
            <td><strong>Staging area</strong></td>
            <td>Yes</td>
            <td>Not for changes <small>(but can be simulated)</small></td>
        </tr>                
        <tr>
            <td><strong>Pull behaviour from remote</strong></td>
            <td>All branches</td>
            <td>Main branches only</td>
        </tr>
    </tbody>
</table>