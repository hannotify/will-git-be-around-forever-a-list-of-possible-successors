<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Teaching A Course On Git

[https://pxhere.com/en/photo/652221](https://pxhere.com/en/photo/652221) <!-- .element: class="attribution" -->

note:
**Time Elapsed:** 1 min.

Besides doing consultancy work, I also teach a few courses.
Now at Info Support we offer a wide range of courses, which exist mainly to get our junior colleagues up to speed with important concepts or products they'll need for their daily work.

One of the courses I teach is called 'Git for Developers'.
It's a one-day course where we teach the students how to use Git as a developer (none of that GUI stuff of course; command-line For The Win!).
Besides doing the practical stuff we also discuss the pros and cons of distributed version control systems and how they compare to the earlier VCS's, like CVS and Subversion. 
Now the other day a student came to me after attending the course and said: "Git is great and all that, but what is gonna be the next big thing?"

Which was a great question, because I couldn't really answer it.
I was quite sure distributed version control systems like Git and Mercurial would be around for a while longer, so that's what I told him.
And he replied: "Surely Git won't be around forever?!"
Now I really hated the fact that I couldn't tell him more on the subject, so I decided to research the matter a bit further.
And what started out as finding the answer to a simple question turned into giving a conference talk.
Which is the one you're attending right now!

So, welcome to you all.
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
**Time Elapsed:** 3 min.

So, whenever I hear somebody say that [insert-product-name-here] "will probably be around forever", it immediately reminds me of...
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
Because change is the only constant, and has been for a long time.

---

<!-- .slide: data-background="img/background/what-goes-up-must-come-down.jpg" --->

[Photo credit: Quang Le](https://quotefancy.com/quote/833239/Isaac-Newton-What-goes-up-must-come-down) <!-- .element: class="attribution" -->

note:
Now if "Change is the only constant" is valid in our industry, then so is "What goes up, must come down".
And although Newton (*point*) probably talked about an apple here, his quote can be applied to a lot of things, including:

* airplanes;
* Bitcoin prices;
* browser market shares;
* and maybe even version control system market shares.

TODO: overweeg om hier extra plaatjes te gebruiken.

Throughout this talk, we'll discover several ideas that I will use as input variables for the prediction at the end of the talk. The idea of "What's goes up..." is actually the first variable that we'll use.

TODO: maak een plaatje voor 'Prediction variable', dat bij elk nieuw geïntroduceerd idee als een fragment op de slide gegooid wordt.
