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
<img data-src="img/logos/voxxed-days-athens.png" width="40%" class="no-background"/>
<br/>
<aside class="notes">
    <p>
        <strong>Time Elapsed:</strong> 0 min.
    </p>
    <p>
        Hi, my name is Hanno. 
        I'm from the Netherlands, where I work at Info Support as an IT consultant.
        Besides doing consultancy work, I also teach a few courses.
        Now at Info Support we offer a wide range of courses, which exist mainly to get our junior colleagues up to speed with important concepts or products they'll need for their daily work.
    </p>
    <p>
        One of the courses I teach is called 'Git for Developers'.
        It's a one-day course where we teach the students how to use Git as a developer (none of that GUI stuff of course; command-line For The Win!).
        Besides doing the practical stuff we also discuss the pros and cons of distributed version control systems and how they compare to the earlier VCS's, like CVS and Subversion. 
        Now the other day a student came to me after attending the course and said: "Git is great and all that, but what is gonna be the next big thing?"
    </p>
    <p>
        Which was a great question, because I couldn't really answer it.
        I was quite sure distributed version control systems like Git and Mercurial would be around for a while longer, so that's what I told him.
        And he replied: "Surely Git won't be around forever?!"
        Now I really hated the fact that I couldn't tell him more on the subject, so I decided to research the matter a bit further.
        And what started out as finding the answer to a simple question turned into giving a conference talk.
        Which is the one you're attending right now!
    </p>
    <p>
        So, welcome to you all.
        I'm going to assume that you are all more or less like the student I told you about.
        He just couldn't believe that everything in version control land would stay the same for a long period of time.
        And I hope you're also a little bit like me, because you probably also can't stand not being able to know the answer to a question.
        So, let's see if we can find the answer together, shall we?
    </p>
</aside>

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

---

note:
Speaking of browser market shares, when I was in college I did a talk on 'the browser wars'.
The talk was actually quite similar to the one I'm doing right now.
Because it was also about predictions.
In this college talk I tried to predict what browser we would be using ten years later in time.

Now in the year I did this talk the hurricane Katrina struck the southern coast of the USA.
Also in this year a video sharing website called "YouTube" is founded.
And lastly, in this year cyclist Lance Armstrong won his seventh consecutive Tour de France.
(although he was 'stripped' of his titles, because of drug allegations)
So what do you think the year was?

The year was 2005.

---

<!-- .slide: data-background="img/background/the-browser-wars-2005.png" --->

note:
This was actually one of the slides I used.
This was fourteen years ago, and it shows.
It looks RETRO, doesn't it?

I mean, the obnoxious headers and footers.
The background gradient.
The page number at the bottom.
Fantastic stuff.

The slide also shows that the Internet Explorer browser family was VERY dominant in 2005.
Almost 90% of all Internet users used an IE browser.
In this talk I predicted three things, of which two REALLY HAPPENED IN THE END.

---

## In ten years time...

1. ...Internet Explorer would be surpassed as the top browser family;
2. ...Mozilla Firefox would surpass Internet Explorer;
3. ...Mozilla Firefox would be the top browser.

note:
Just the last prediction didn't happen, the other two did!

---

<!-- .slide: data-background="img/background/browser-shares-2007-2018.jpg" data-background-size="contain" data-background-color="white" --->

[https://www.bbntimes.com/en/global-economy/market-shares-for-browsers-and-platforms](https://www.bbntimes.com/en/global-economy/market-shares-for-browsers-and-platforms) <!-- .element: class="attribution" -->

note:
I didn't count on Google Chrome - a new browser - to take the top spot.
But see!
Internet Explorer WAS surpassed within ten years time.
And Firefox DID surpass IE for a few months in 2016.
OK, technically that did take 11 years, not 10.

---

## Key question: was I right? 

note:
So, was I right with the browser prediction?
What *was* the most popular browser in 2015?
TODO: samenvoegen met wat hierboven staat.

---

note:
Now who in their right mind would dare to claim that Google Chrome will be around forever?
I mean, it will probably be gone in ten years or so...
By then it will have been replaced by a superior product.
These replacements in the browser world have happened at least four times until now.
Mosaic was replaced by Netscape, which was replaced by Internet Explorer.
Which was replaced by Internet Explorer, which was replaced by Mozilla Firefox, which was replaced by Google Chrome.
And I can't think of a reason why it wouldn't happen for a fifth time.

---

note:
So let's see how these things have happened until now in the version control world!
