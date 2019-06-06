<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Why has Git become so popular?

[https://pxhere.com/en/photo/652221](https://pxhere.com/en/photo/652221)  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 11 min.

So, it's great that now we know 'what goes up, must come down'.
But it's not enough to make a sound prediction.

FIXME: regel wat meer aansluiting met vorige onderwerp.

Now if we want to be able to predict 'the next big thing' in version control, surely some information on the 'current big thing' is very relevant to our quest.
Moreover, it could be useful to understand how 'the current big thing' became 'the big thing' in the first place.

---

## Features of Git

* Distributed
* Free &amp; open-source
* Fast
* Optimized for branching

note:
FIXME: leg wat verder uit waarom deze features - of liever gezegd: deze combinatie van features - baanbrekend waren in die tijd.

* **Distributed**
  * Like BitKeeper. Commit often, push once.
* **Free &amp; open-source**
  * **Unlike** BitKeeper
* **Fast** 
 * Linus said "everything you ever do on a daily basis should take less than a second".
* **Optimized for branching** 
  * In the Subversion age, developers 'were afraid of branching', so they didn't do it! 
  * Which was a very bad thing in a time where Continuous Delivery did not yet exist like we know it today.

---

## Some surprising facts on Git

> "First Linux, now Git"

<https://www.infoworld.com/article/2669670/after-controversy--torvalds-begins-work-on--git-.html>  <!-- .element: class="attribution" -->

note:
When asked why he called the new software, "git," British slang meaning "a rotten person," he said. "I'm an egotistical bastard, so I name all my projects after myself. First Linux, now git."

---

<!-- .slide: data-background="img/background/implementation-decision.jpg" data-background-color="black" data-background-opacity="0.5"-->

## WWCVSND?

<blockquote class="explanation">
    If in doubt, make the exact opposite decision.
</blockquote>

<https://pxhere.com/en/photo/704019> <!-- .element: class="attribution" -->

note:
When Linus Torvalds was developing Git, one of his guiding principles was WWCVSND, or “What Would CVS Not Do.” Take CVS as an example of what not to do; if in doubt, make the exact opposite decision.

---

<!-- .slide: data-background="img/background/crystal-ball.jpg" data-background-color="black" data-background-opacity="0.5" --->

## Killer features.

<blockquote class="explanation">
    <code>prediction variable</code>
</blockquote>

<https://www.pexels.com/photo/photo-displays-person-holding-ball-with-reflection-of-horizon-940880> <!-- .element: class="attribution" -->

note:
FIXME: Introduceer deze variable wat beter.

Killer features are new features (that have never been seen) or different features (where a similar feature has been implemented in a radically different way, to distinguish it from the competitors).

* Surprising name
* Opposite of CVS in many aspects
* ...

---

<!-- .slide: data-background-color="#f9f9f9" data-background="img/background/vcs-popularity-graph.png" data-background-size="60%" --->

[https://blog.gitprime.com/git-didnt-beat-svn-github-did/](https://blog.gitprime.com/git-didnt-beat-svn-github-did/) <!-- .element: class="attribution" -->

note:
Here is some information on how 'the current big thing' - which is Git - became 'the big thing'.

There's a lot of significant information in this chart: (*point*)
* Git's growth increased rapidly after it was supported by Github (2008), Bitbucket (2012) and Gitlab (2013).
* Subversion's popularity peaked in 2009 
  * 4 years after Git and Mercurial were released;
  * also: after Github was launched.
* Mercurial started declining **only** after Bitbucket added Git support.
* The numbers we see here are based on *relative search volume*. It is not the **actual** usage of the products. Version control system popularity is actually quite hard to measure! (more on this later)

FIXME: meer verhaaltje hier.

--- 

## Influence of source code hosting on popularity

<https://en.wikipedia.org/wiki/Comparison_of_source-code-hosting_facilities#Version_control_systems>

---

<!-- .slide: data-background="img/background/crystal-ball.jpg" data-background-color="black" data-background-opacity="0.5" --->

## Hosting platform support.

<blockquote class="explanation">
    <code>prediction variable</code>
</blockquote>

<https://www.pexels.com/photo/photo-displays-person-holding-ball-with-reflection-of-horizon-940880> <!-- .element: class="attribution" -->

note:
FIXME: Introduceer deze variable.

---

FIXME: Introduceer de PV "Open-source community support."

---

<!-- .slide: data-background-color="#f9f9f9" data-background="img/background/vcs-popularity-graph.png" data-background-size="60%" --->

[https://blog.gitprime.com/git-didnt-beat-svn-github-did/](https://blog.gitprime.com/git-didnt-beat-svn-github-did/) <!-- .element: class="attribution" -->

note:
Let's return to this chart one more time and allow me to address a final point:

* The numbers we see here are based on *relative search volume*. It is not the **actual** usage of the products. Version control system popularity is actually quite hard to measure! (more on this later)

---

## Measuring Version Control System Popularity

* This is very hard.

note:
FIXME: dit verhaaltje kan beter. 
En schrijf wat naar het Google Trends-voorbeeld toe.

In Stack Overflow’s 2015 developer survey, 69.3% of respondents used Git, almost twice as many as used the second-most-popular version control system, Subversion. After 2015, Stack Overflow stopped asking developers about the version control systems they use, perhaps because Git had become so popular that the question had become uninteresting.

---

<https://trends.google.nl/trends/explore?date=today%205-y&q=git,subversion,mercurial> <!-- .element: target="_blank" -->

---

<!-- .slide: data-background-video="video/programming-language-popularity-stack-overflow.mp4" data-background-video-muted="true" data-background-size="contain" -->

<https://www.globalapptesting.com/blog/picking-apart-stackoverflow-what-bugs-developers-the-most> <!-- .element: class="attribution" -->

note:
FIXME: leg uit waarom dit niet de metriek is die je wilt. :-)

Wat betekent het als er veel vragen worden gesteld?
* veel gebruikers van de taal?
* veel onervaren gebruikers?
* de taal is moeilijk te leren / niet intuïtief?

---

<!-- .slide: data-background="img/background/there-are-two-types-of-people.png" data-background-size="cover" --->

<https://bingeprints.com/products/there-are-two-types-of-people-those-who-can-extrapolate-from-incomplete-data-mug-funny-statistics-math-coffee-cup-1> <!-- .element: class="attribution" -->

note:
Of course, this shouldn't stop us from making a first prediction!
After all, we all know there are only two types of people in the world.
1. Those who can extrapolate from incomplete data.

FIXME: meer verhaaltje.

---

## First Prediction

<table>
    <thead>
        <tr>
            <th/>
            <th>2009</th>
            <th class="fragment" data-fragment-index="1">2019</th>
            <th class="fragment" data-fragment-index="2">2029</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Subversion</th>
            <td align="right">45%</td>
            <td align="right" class="fragment" data-fragment-index="1">8%</td>
            <td align="right" class="fragment" data-fragment-index="2">4%</td>
        </tr>
        <tr>
            <th align="right">Git</th>
            <td align="right">20%</td>
            <td align="right" class="fragment" data-fragment-index="1">73%</td>
            <td align="right" class="fragment" data-fragment-index="2">80%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">17%</td>
            <td align="right" class="fragment" data-fragment-index="1">12%</td>
            <td align="right" class="fragment" data-fragment-index="2">9%</td>
        </tr>  
        <tr>
            <th align="right">TFS</th>
            <td align="right">11%</td>
            <td align="right" class="fragment" data-fragment-index="1">7%</td>
            <td align="right" class="fragment" data-fragment-index="2">7%</td>
        </tr>
        <tr>
            <th align="right">CVS</th>
            <td align="right">7%</td>
            <td align="right" class="fragment" data-fragment-index="1">&lt;1%</td>
            <td align="right" class="fragment" data-fragment-index="2">&lt;1%</td>
        </tr>      
    </tbody>
</table>

note:
FIXME: leg deze voorspellingen uit aan de hand van de populariteitsgrafiek.

FIXME: vind een manier om hier snel te kunnen wisselen naar de populariteitsgrafiek, *zonder dat de fragment state verandert*. 
Een optie: open het plaatje als voorbereiding en zet deze direct op het tweede scherm neer. 
Dan moet ik die voorbereiding wel ergens vastleggen (bij voorkeur op de titelslide in de notities).

---

<!-- .slide: data-background="img/background/problem-encountered.jpg" data-background-color="black" data-background-opacity="0.5" --->

## One problem though.

<blockquote class="explanation">
    We haven't included <em>any</em> new products!
</blockquote>

<https://www.pexels.com/photo/man-in-black-shirt-and-gray-denim-pants-sitting-on-gray-padded-bench-1134204> <!-- .element: class="attribution" -->

note:
This 'first prediction' is based entirely on existing products.
But a lot can happen in ten years!
What if a brand-new, feature-packed version control system appears and takes the market by storm?

---

<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

## Version Control 'By USB Stick'

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note:
The next big thing could be 'Version Control By USB Stick', for example.
Haven't you been wondering why some of my slides have had USB sticks in the background?
It's a great story.

FIXME: dit verhaaltje uitwerken.

I can assure you that we don't need to worry about 'Version Control By USB Stick'. 
It will not get popular, for obvious reasons.
