<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Teaching a course on Git

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note:
**Time Elapsed:** 1 min.

Besides doing consultancy work, I also teach a few courses.
Now at Info Support we offer a wide range of courses, which exist mainly to get our junior colleagues up to speed with important concepts or products they'll need for their daily work.

One of the courses I teach is called 'Git for Developers'.
It's a one-day course where I teach the students how to use Git as a developer (none of that GUI stuff of course; command-line For The Win!).
Besides doing the practical stuff we also discuss the pros and cons of distributed version control systems and how they compare to the earlier VCS's, like CVS and Subversion. 

---

<!-- .slide: data-background="img/background/version-control-timeline.png" data-background-size="contain" data-background-color="white" -->

<http://blog.plasticscm.com/2010/11/version-control-timeline.html> <!-- .element: class="attribution" -->

note:
This is actually one of the course slides.
It displays which version control systems have emerged until now, and when they became available.
It also tries to put the publication date of each version control system in perspective by comparing them to the most modern phone known at that time.

So, Subversion relates to the Nokia 3210, for example. (*point*)
And CVS relates to the thing with the power plug.
Both are obviously **ancient**.

Now, when I talk about this slide during the Git course, I tend to focus on the events of the year 2005. (*point*)
Because to me, 2005 **really** stands out in version control history.
I mean, **five** new version control systems were published in that year. 
In a **single** year.

To put things in perspective, before 2005, it had taken **nine** years for five version control systems to emerge.
(Starting with VSS in 1994, and ending with BitKeeper in 2003.)
And in 2005, it all happened within a few months!

So, does anyone know why things happened like this?

---

<!-- .slide: data-background="img/background/bitkeeper-goes-commercial.png" data-background-size="contain" data-background-color="#707070" -->

<http://web.archive.org/web/20050408062838/http://www.bitkeeper.com/press/2005-04-05.html> <!-- .element: class="attribution" -->

note:
Well, BitKeeper happened.
They went from open-source to proprietary just like **that**.
The open-source world - Linus Torvalds in front - was not amused.
He had been using BitKeeper for the Linux kernel, but was now in need of a new system.

And becasue BitKeeper was the only distributed version control system at the time, which was now no longer freely available, a lot of similar products were developed in a short amount of time.
Including Mr. Torvalds' own rendition of distributed version control, which later became Git.

---

<!-- .slide: data-background="img/background/version-control-timeline.png" data-background-size="contain" data-background-color="white" -->

<http://blog.plasticscm.com/2010/11/version-control-timeline.html> <!-- .element: class="attribution" -->

note:
Now just because I thought the year 2005 really stood out in this graphic, doesn't necessarily mean it was like that for everyone.
In fact, at the end of one particular course day a student came to me with a question.
And his question proved that he had noticed an **entirely** different thing than I had noticed.
Moreover, his 'discovery' - if you will - proved to be a **lot** more interesting than mine.

He came up to me and said: "Git is great and all that, but what's gonna be the **next** big thing?"
So I told him I was quite sure distributed version control systems like Git and Mercurial would be around for a while longer.
But this wasn't a good answer, really.
Because **I didn't know** what was gonna be the next big thing.
So it was a great question, actually.

And he was right in asking this question, of course.
Because if you look at the chart and you look beyond what you've already seen (the year 2005), then it becomes painfully obvious...
That in version control land, nothing seems to have happened after 2006.
This is one of those things that, once you see it, you can't **unsee** it.

FIXME: het volgende verhaaltje vloeiender, natuurlijker laten lopen.
En het kan ook best wat korter.

Now I kind of felt bad that I had dodged my student's question a bit by telling him distributed version control was the present **and** the future.
I had effectively told him that "Git will probably be around forever", even if I didn't phrase it exactly like that.
And I really hated the fact that I couldn't tell him more on the subject, so I decided to research the matter a bit further.
And what started out as finding the answer to a simple question turned into an investigation.
And the investigation turned into a conference talk.
Which is the one you're attending right now!

So, welcome to you all! (*open arms*)
I'm going to assume that you are all more or less like the student I told you about.
He just couldn't believe that everything in version control land would stay the same for a long period of time.
And I hope you're also a little bit like me, because you probably also can't stand not being able to know the answer to a question.
So, let's see if we can find the answer together, shall we?

---

<!-- .slide: data-background="img/background/bill-gates-2004.jpg" -->

<blockquote class="explanation fragment">
    <em>"640K ought to be enough for anybody."</em>
</blockquote>

<https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Bill_Gates_2004.jpg/1280px-Bill_Gates_2004.jpg> <!-- .element: class="attribution" -->

note: 
Now, whenever I hear somebody say that [insert-product-name-here] "will probably be around forever", it immediately reminds me of...
[slide]
...this quote. 

If working in software development for almost 12 years has taught me anything, it's that...
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
* Browser behaviours change.

Agile was invented for a reason! To be able to cope with CHANGE.
Because in our industry, change is the only constant
And it has been like that for a long time.

---

<!-- .slide: data-background="img/background/what-goes-up-must-come-down.jpg" --->

[Photo credit: Quang Le](https://quotefancy.com/quote/833239/Isaac-Newton-What-goes-up-must-come-down) <!-- .element: class="attribution" -->

note:
Now if the idea of "Change is the only constant" is valid in our industry, then so is the idea of "What goes up, must come down".
And although Newton (*point*) probably talked about an apple here, his quote can be applied to a lot of things, including:

* airplanes;
* Bitcoin prices;
* browser market shares;
* and maybe even version control system market shares.

FINAL: wanneer voorbereidingstijd over, gebruik hier dan meer slides met plaatjes van de voorbeelden.

---

<!-- .slide: data-background="img/background/crystal-ball.jpg" data-background-color="black" data-background-opacity="0.5" --->

## What goes up must come down.

<blockquote class="explanation">
    <code>prediction variable</code>
</blockquote>

<https://www.pexels.com/photo/photo-displays-person-holding-ball-with-reflection-of-horizon-940880> <!-- .element: class="attribution" -->

note:
FIXME: leg het idee van 'prediction variable' wat beter uit.

Throughout this talk, we will discover several ideas that I will use as input variables for the final prediction.
At the moment we're far from it.
But we'll get there in the end, by identifying more prediction variables.
The idea of "What's goes up..." is actually the first variable that we'll use.
Because...? FIXME
