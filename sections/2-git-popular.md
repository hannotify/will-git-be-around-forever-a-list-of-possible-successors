<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Why did Git become so popular? <!-- .element class="stroke" -->

[https://pxhere.com/en/photo/652221](https://pxhere.com/en/photo/652221)  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** `3:30`.

To answer the question, we have to discover what factors are influencing the popularity of a version control system.
So let's take Git as an example.
Why do you think Git became so popular?

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

* Free to use (not like BitKeeper)
* Fast; everyday operations take less than a second (unlike Darcs or Subversion)
* Easy branching (unlike CVS)

**Hosting platform support**

* As of 2022, there are 18 websites that offer public Git repositories. (wikipedia)

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
* Or your favourite football team.

---

## Putting the graph data into a table

<table>
    <thead>
        <tr>
            <th/>
            <th>2010</th>
            <th>2021</th>
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

In the rest of this talk I'll add 3 newer version control systems to this table: Fossil, Pijul & Sapling.
