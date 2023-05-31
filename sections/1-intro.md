<h2>Will Git Be Around</h2>
<h1>Forever?</h1>
<h4>A List Of Possible Successors</h4>

<table>
    <tr>
        <td style="vertical-align: middle;" width="35.3%">Hanno Embregts</td>
        <td style="text-align: left; vertical-align: middle; padding: 0 0 0 0"><img width="14%" data-src="img/logos/ace-associate-spade.png" class="no-background" style="margin-top: 30px"/></td>
        <td style="text-align: right;"><img width="25%" data-src="img/icons/twitter-white.png" class="no-background" style="margin-top: 35px"/></td>
        <td style="vertical-align: middle; padding: 0 0 0 0"><a href="https://www.twitter.com/hannotify">@hannotify</a></td>
    </tr>
</table>
<img data-src="img/logos/java-community-logo.png" width="10%" class="no-background" style="margin-right: 2em">
<img data-src="img/logos/devoxx-pl.png" width="40%" class="no-background"/>
<br/>

note:
**Time Elapsed:** `0:00`.

*Voorbereidingen*:

* Verbind Spotlight met de Logitech-software.
* Leg dobbelsteen klaar
* Eerste scherm:
  * Speaker notes
  * VSCode, voor Random.java
  * Terminal:
    * Tab met `mirror`
    * Tab met de slides draaiend
    * Tab voor fossil, met working-dir `/Users/hanno/development/talks/reveal.js/slide-decks/will-git-be-around-forever`
    * Tab voor pijul - verbonden met Docker-container
    * Tab voor sapling, met working-dir `/Users/hanno/development/talks/reveal.js/slide-decks/will-git-be-around-forever`
* Tweede scherm:
  * Slides
  * Nieuwe tab voor Fossil UI
* Telefoon met de demostappen erop
* Reset de timer in de speaker notes

Hi, my name is Hanno. 
From the Netherlands, and I work at Info Support as an IT consultant.
Recently I've received the Oracle ACE Associate award in the 'Java' category.
I am @hannotify at Twitter or Mastodon, I post about things I like.
Which is Java Development, Version Control and making music.
If you like that stuff, by all means give me a follow!

Now when it comes to version control, I've come a long way.
When I was in college, back in 2006, I participated in 'Version Control by Email'.

(...)

When I started my first Software Development job, we did 'Version Control by USB Stick'.
Eventually we switch to using... CVS. Very modern.

(...)

---

<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Teaching a course on Git

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note:
Thank goodness it's 15 years later now, because I've gained proper experience with Subversion and Git.
I even teach a "Git" course at Info Support.
It's a one-day course where I teach our interns and juniors how to use Git **as a developer**.
We discuss the pros and cons of distributed version control and how it compare to earlier version control systems, like CVS and Subversion. 

---

<!-- .slide: data-background="img/background/version-control-timeline.png" data-background-size="contain" data-background-color="white" -->

<http://blog.plasticscm.com/2010/11/version-control-timeline.html> <!-- .element: class="attribution" -->

note:
This is actually one of the course slides.
Displays which version control systems have emerged until now, and their publication date.
By comparing the publication dates to the most modern phone known at the time, you get a sense of how old these systems are.

So, for example, Subversion relates to the Nokia 3310. (point)
Which are both *indestructible*.
And CVS relates to the thing with the power plug.
Both are obviously **ancient**!

At the end of one particular course day, a student came to me with a question.
And she said: "Git is great and all that, but what's gonna be the **next** big thing?"
"It looks like nothing has happend in Version Control world for over ten years!"

I told her: 

* we're quite sure that distributed version control systems like Git and Mercurial will be around for much longer.

But of course this wasn't a proper answer at all!
Because **I didn't know** what was gonna be the next big thing.

I had effectively told her that "Git will probably be around forever", even if I didn't phrase it exactly like that.
That didn't sit right with me.
So I decided to research the matter a bit further.
And the research got out of hand and eventually turned into this conference talk.

So, thank you for attending it, you are most welcome! (*open arms*)
And let's see if we can find the answer to the student's question together, shall we?

---

<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Why did Git become so popular?

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
