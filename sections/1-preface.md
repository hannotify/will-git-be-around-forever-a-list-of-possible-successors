<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Teaching a course on Git

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note:
**Time Elapsed:** 3 min.

So, fast-forward 15 years again.
I've gained some experience with real Version Control Systems like Subversion and Git.
And I also teach a few courses at Info Support, from time to time.
Our courses address basic software development topics such as object-orientation, automated testing, continuous delivery, containerisation and so on. 

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

Now, when I talk about this slide during the Git course, I tend to focus on the events of the year 2005. (point)
Because to me, 2005 **really** stands out in version control history.
I mean, **five** new version control systems were published in that year. 
In a **single** year.

To put things in perspective, before 2005, it had taken **nine** years for five different version control systems to appear.
Starting with VSS in 1994, and ending with BitKeeper in 2003.
And in 2005, it all happened within a few months.
Now that's remarkable!

So, does anyone happen to know why things happened like this?

---

<!-- .slide: data-background="img/background/bitkeeper-goes-commercial.png" data-background-size="contain" data-background-color="#707070" -->

<http://web.archive.org/web/20050408062838/http://www.bitkeeper.com/press/2005-04-05.html> <!-- .element: class="attribution" -->

note:
* BitKeeper changed its licensing model for Open Source users
* In a nutshell: the Linux community could no longer use BitKeeper for free

The open-source world - with Mr. Linus Torvalds in front - was not amused.
And what do you do when the only distributed version control system is no longer freely available?
Well, you create a new one, of course!
So in the aftermath of BitKeeper's licensing change, a lot of similar products were developed in a short amount of time.
Including Mr. Torvalds' own rendition of distributed version control, which later would become 'Git'.

---

<!-- .slide: data-background="img/background/version-control-timeline.png" data-background-size="contain" data-background-color="white" -->

<http://blog.plasticscm.com/2010/11/version-control-timeline.html> <!-- .element: class="attribution" -->

note:
* The year 2005 caught my attention.
* But one of my students had noticed something entire different in this graphic.

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

<!-- .slide: data-background="img/background/bill-gates-2004.jpg" -->

<blockquote class="explanation fragment">
    <em>"640K ought to be enough for anybody</em>
    <em class="fragment">for now..."</em>
</blockquote>

<https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Bill_Gates_2004.jpg/1280px-Bill_Gates_2004.jpg> <!-- .element: class="attribution" -->

note: 
Now, whenever I hear somebody say that some product "will probably be around forever", it immediately reminds me of...
[slide]
...this quote. 

Which he probably didn't say **exactly** like this, it is very plausible that he added
[slide]
"for now" to that claim.

And I think he added the "for now", because mr. Gates knows very well that in the computer industry...
[slide]

---

<!-- .slide: data-background="img/background/change-is-the-only-constant.jpg" --->

[Photo credit: Ryan McGuire](https://quotefancy.com/quote/1003699/Heraclitus-Change-is-the-only-constant) <!-- .element: class="attribution" -->

note:
...change is the only constant. 
This idea has been valid in our industry for as long as I remember.
If you think about it for just a second, you can come up with lots of examples.

* Requirements change.
* Priorities change. 
* Dependencies change.
* Or if you work in front-end: browser behaviours change.

To me, this proves that in our industry, change is the only constant.
So no, Git *won't* be around forever.
It might be around "for now", but eventually there will be a successor.
