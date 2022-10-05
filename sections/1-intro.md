<h2>Will Git Be Around</h2>
<h1>Forever?</h1>
<h4>A List Of Possible Successors</h4>
<table>
    <tr>
        <td style="vertical-align: middle;">Hanno Embregts</td>
        <td style="text-align: right;"><img width="20%" data-src="img/icons/twitter-white.png" class="no-background"/></td>
        <td style="vertical-align: middle; padding: 0 0 0 0"><a href="https://www.twitter.com/hannotify">@hannotify</a></td>
    </tr>
</table>
<img data-src="img/logos/frontmania.png" width="25%" class="no-background"/>
<br/>

note:
**Time Elapsed:** 0 min.

*Voorbereidingen*:

* Verbind Spotlight met de Logitech-software.
* Leg dobbelsteen klaar
* Eerste scherm:
  * Speaker notes
  * VSCode, met alle editors dicht
  * Terminal:
    * Tab met `mirror`
    * Tab met de slides draaiend
    * Tab voor fossil
    * Tab voor pijul - verbonden met Docker-container
* Tweede scherm:
  * Slides
  * Nieuwe tab voor Fossil UI

Hi, my name is Hanno. 
I work at Info Support as an IT consultant.

---

# Teaching a course on Git

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note:
Besides that, I also teach a few courses at Info Support, from time to time.
One of these courses is called 'Git for Developers'.
It's a one-day course where I teach the students how to use Git **as a developer**.
We discuss the pros and cons of distributed version control systems and how they compare to the earlier version control system, like CVS and Subversion. 

---

<!-- .slide: data-background="img/background/version-control-timeline.png" data-background-size="contain" data-background-color="white" -->

<http://blog.plasticscm.com/2010/11/version-control-timeline.html> <!-- .element: class="attribution" -->

note:
This is actually one of the course slides.
And it displays which version control systems have emerged until now, and when they became available.
It also tries to put the publication date of each version control system in perspective by comparing them to the most modern phone known at that time.

So, for example, Subversion relates to the Nokia 3310. (point)
Which are both *indestructible*.
And CVS relates to the thing with the power plug.
Both are obviously **ancient**!

At the end of one particular course day, this student came to me with a question.
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
**Time Elapsed:** 2 min.

The question remains: which one will it be?
Which one will be the successor?

Now in finding the answer to this question, we obviously have to make a prediction.
We have to predict which version control system will be popular in, say, ten years.
And throughout this talk, we will discover several ideas that can be useful to our prediction. 
I call these ideas 'prediction variables'.
At the end of the talk, we will use these 'variables' to make the final prediction.

And I think we can discover these variables quickly by gathering information on the 'current big thing'.
And how it became 'the big thing' in the first place.
So, why *did* Git become so popular?

---

## Reasons for Git's popularity

* Killer features
* Hosting platform support
* Open-source community support
* The handicap of the head start

notes:

TODO

---

<!-- .slide: data-background="img/background/implementation-decision.jpg" data-background-color="black" data-background-opacity="0.5"-->

## Prediction variables

* Killer features
* Hosting platform support
* Open-source community support
* The handicap of the head start

notes:

TODO

---

<!-- .slide: data-background-color="#f9f9f9" data-background="img/background/vcs-popularity-graph.png" data-background-size="60%" --->

<https://blog.gitprime.com/git-didnt-beat-svn-github-did> <!-- .element: class="attribution" -->

--- 

## Getting To A Proper Prediction

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
            <td align="right">73%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">19%</td>
            <td align="right">12%</td>
        </tr>  
        <tr>
            <th align="right">TFVC</th>
            <td align="right">7%</td>
            <td align="right">7%</td>
        </tr>
        <tr>
            <th align="right">CVS</th>
            <td align="right">5%</td>
            <td align="right">&lt;1%</td>
        </tr>      
    </tbody>
</table>

---

<!-- .slide: data-background="img/background/problem-encountered.jpg" data-background-color="black" data-background-opacity="0.5" --->

## But first!

<blockquote class="explanation">
    Let's include some new products!
</blockquote>

<https://www.pexels.com/photo/man-in-black-shirt-and-gray-denim-pants-sitting-on-gray-padded-bench-1134204> <!-- .element: class="attribution" -->

note:
Yeah, one problem though.
We haven't included *any* new products.
This 'first prediction' is based entirely on existing products.
But a lot can happen in ten years!
What if a brand-new, feature-packed version control system appears and takes the market by storm?

