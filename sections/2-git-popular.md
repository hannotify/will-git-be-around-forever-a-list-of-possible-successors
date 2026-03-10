<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.2" data-auto-animate -->

# Yay,

# Git!

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note:
**Time Elapsed:** `7:00`.

Quick show of hands - who of you is currently using Git?
Anyone uses a different version control system?

Well, that's understandable!
Because there's a lot to like about Git:

* easy branching
* distributed nature (open-source development, work offline)
* fast
* popular, so a lot of help is available if you're struggling
* and, in contrast to BitKeeper: free to use!

---

## But do we like everything about it?

note:

But do we like everything about it?
Do we like... for example...

* amending commits? (or changing the message)
* committing to the wrong branch and having to fix it?
* running a diff when nothing happens? (`--staged`)
* conflicts when merging or rebasing?
* getting the same conflicts over and over again when we need long-lived branches?
* having to do a fresh clone because the repo is too messed up to repair?
* heated team debates on rebase vs. merge?

Well... not particularly!

---

<!-- .slide: data-background="img/background/git-clunky-interface-tweet.png" data-background-color="black" data-background-size="80%" -->

---

<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.2" data-auto-animate -->

# Yay,

# Git!

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

---

<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.2" data-auto-animate -->

# Dang it,

# Git!

<div class="fragment">
<a href="https://dangitgit.com">dangitgit.com</a><br/><small>(by Katie Sylor-Miller)</small>
</div>

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note:
Some days it's more like "Dang it, Git!" instead of "Yay, Git!"
There's a website for that, by the way. (slide)

---

## What I don't always like about Git

* features we often need can be buried in some obscure command-line argument <!-- .element class="fragment fade-in-then-semi-out" -->
* its snapshot-based approach when changes travel <!-- .element class="fragment fade-in-then-semi-out" -->
* its many (many!) internal operations that are available to every user <!-- .element class="fragment fade-in-then-semi-out" -->

<p>
  <div class="fragment">
    <a href="https://git-man-page-generator.lokaltog.net/">git-man-page-generator.lokaltog.net</a><br/><small>(by Kim Silkebækken)</small>
  </div>
</p>

note:

**features we often need can be buried in some obscure command-line argument**

* `git clean -fdxn`
* `git branch -m master main`

**its snapshot-based approach when changes travel**

* rebasing or cherry-picking changes commit identities
* there's no way to fix a conflict once and for all (`git rerere` comes close, 'reuse recording resolution')

**its many (many!) internal operations that are available to every user**

* (slide) The Git Manpage Generator illustrates this point nicely :-)

---

## And what about sustainability?

<ul>
    <li class="fragment fade-in-then-semi-out">bandwidth usage by <code>clone</code>, <code>push</code> and <code>pull</code></li>
    <li class="fragment fade-in-then-semi-out">search engine emissions</li>
</ul>

<p>
  <div class="fragment">
    <a href="https://www.janavirgin.com/CO2/">CO2GLE</a><br/><small>(by Joana Moll)</small>
  </div>
</p>

note:

**bandwidth usage**

* repository size
* a VCS should be able to restore every point in time, so don't expect much difference between vendors

**search engine emissions**

* a lot of obscure options in a VCS result in many search engine queries.
* estimates for emissions of a single search query range between 0.2 and 10 grams of carbon.
* CO2GLE is a simulation of Google's emissions per second, based on 2015 data (47K requests / second).

---

## Use your tool in a more sustainable way

* Use local documentation whenever you can <!-- .element class="fragment fade-in-then-semi-out" -->
* Build an intricate set of bookmarks <!-- .element class="fragment fade-in-then-semi-out" -->
* Use a sustainable search engine <!-- .element class="fragment fade-in-then-semi-out" --> like [ecosia.com](https://ecosia.com) or [oceanhero.today](https://oceanhero.today/). 

---

<!-- .slide: data-background="img/background/tools.jpg" data-background-color="black" data-background-opacity="0.4" --->

## Master Your Tools <!-- .element: class="stroke" -->

<blockquote class="explanation">
    Use your tools long enough to <em>really</em> get to know them.
</blockquote>

<https://pxhere.com/en/photo/704019> <!-- .element: class="attribution" -->

note:
And master your tools.
To use Git in a more sustainable way, you need to get to know this tool inside and out.
So you don't need as many carbon-emitting search sessions.

OK, so we've seen some pros and cons about Git, and how to mitigate the cons that have to do with sustainability.
Let's switch gears now and talk about how Git became popular in the first place.
Because we can use that knowledge to predict how successful competing version control system will be.

---

<!-- .slide: data-background-color="#f9f9f9" data-background="img/background/vcs-popularity-graph.png" data-background-size="60%" --->

<https://blog.gitprime.com/git-didnt-beat-svn-github-did> <!-- .element: class="attribution" -->

---

## Reasons for Git's popularity

* Killer features
* Hosting platform support
* Open-source community support

notes:

**Killer features**

(features that distinguish it from its competitors)

* Free to use (not like BitKeeper)
* Fast; everyday operations take less than a second (unlike Darcs or Subversion)
* Easy branching (unlike CVS)

**Hosting platform support**

* As of 2024, there are 19 websites that offer public Git repositories. (wikipedia)

**Open-source community support**

* Git has been the driving force behind global open-source development; with contributors spread across the globe

---

## Prediction variables

<ul>
    <li>Killer features
    <li>Hosting platform support
    <li>Open-source community support
    <li class="fragment">IDE support
    <li class="fragment">The handicap of the head start
</ul>

notes:

We can use these Git features as 'prediction variables': factors that will influence our prediction.
And I would like to add two more: (slide)

**IDE support**

* I love Git's integration into IDE's like IntelliJ IDEA or VSCode.
* So a successor must have a certain amount of support in this area to be able to rise to fame.

(slide)

**The handicap of the head start**

* Meaning: the top product will have the hardest time staying on top.
* Just think about what happened to Subversion.
* Or what happened to Internet Explorer.
* Or your favourite football team, for that matter.

---

## Putting the graph data into a table

<table>
    <thead>
        <tr>
            <th/>
            <th>2010</th>
            <th>today</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Subversion</th>
            <td align="right">44%</td>
            <td align="right">8%</td>
        </tr>
        <tr>
            <th align="right">Git</th>
            <td align="right">25%</td>
            <td align="right">74%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">19%</td>
            <td align="right">12%</td>
        </tr>  
        <tr>
            <th align="right">TFVC</th>
            <td align="right">7%</td>
            <td align="right">6%</td>
        </tr>
        <tr>
            <th align="right">CVS</th>
            <td align="right">5%</td>
            <td align="right">&lt;1%</td>
        </tr>      
    </tbody>
</table>

note:
Let's put the graph data into a table.

---

<!-- .slide: data-background="img/background/problem-encountered.jpg" data-background-color="black" data-background-opacity="0.5" --->

## Don't forget!

<blockquote class="explanation">
    Include some new products!
</blockquote>

<https://www.pexels.com/photo/man-in-black-shirt-and-gray-denim-pants-sitting-on-gray-padded-bench-1134204> <!-- .element: class="attribution" -->

note:
And we shouldn't forget to include a few new products.
Because a lot can happen in ten years!
What if a brand-new, feature-packed version control system appears and takes the market by storm?

---

<div class="logo-grid">
    <div class="logo"><figure><img src="img/logos/fossil-icon.png"><figcaption>Fossil</figcaption></figure></div>
    <div class="logo"><figure><img src="img/logos/pijul.png"><figcaption>Pijul</figcaption></figure></div>
    <div class="logo"><figure><img src="img/logos/sapling.png"><figcaption>Sapling</figcaption></figure></div>
</div>

note:
So let's look at a few alternatives.

I'll cover all three of them, and I'll try to live-demo them if time permits.
