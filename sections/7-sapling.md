<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Sapling

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note:

**Time Elapsed:** `21:30`.

---

## Features that Sapling promises

<ul>
    <li class="fragment fade-in-then-semi-out">designed to be scalable & user-friendly</li>
    <li class="fragment fade-in-then-semi-out">native pull requests</li>
    <li class="fragment fade-in-then-semi-out">integrates with Git and GitHub</li>
    <li class="fragment fade-in-then-semi-out">"always on-line" approach</li>
</ul>

<a href="https://sapling-scm.com/">sapling-scm.com</a>

note:

* again, distributed

---

## Quick facts

<ul>
    <li class="fragment fade-in-then-semi-out">developed and used at Meta</li>
    <li class="fragment fade-in-then-semi-out">started in 2013, open-sourced in 2022</li>
    <li class="fragment fade-in-then-semi-out">able to handle very large repos</li>
    <li class="fragment fade-in-then-semi-out">local branches are optional</li>
    <li class="fragment fade-in-then-semi-out">commands generally do one thing</li>
</ul>

![Sapling logo](https://sapling-scm.com/img/Sapling_logo-white.svg) <!-- .element: class="no-background" width="30%" -->

note:

**developed and used at Meta**
Started 10 years ago as an effort to make Meta’s monorepo scale, because existing VCS's couldn't manage the monorepo efficiently. 
Along the way Meta saw opportunities to also improve UX, so that their new engineers could understand their repos faster.

**able to handle very large repos**
Meta uses monorepo's (or should I say 'monorepo'?) - 10’s of millions of files/commits/branches according to the Sapling docs. 
Caveat: to really make use of this you also need the virtual file system and Sapling server which haven't been open sourced yet.

**local branches are optional**
You can create 'stacks' of commits, but you don't have to add a label to it.
Of course you can, but it's not mandatory.

**commands do one thing**
Git has commands like `checkout`, `reset` that can do different things based on how you use them.
Sapling commands generally do a single thing.

---

## Quick demo

TODO

note:

**Time Elapsed:** `23:30`.

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