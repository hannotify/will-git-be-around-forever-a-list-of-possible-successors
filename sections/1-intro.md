<h2>Will Git Be Around</h2>
<h1>Forever?</h1>
<h4>A List Of Possible Successors</h4>

<table>
    <tr>
        <td style="text-align: right; vertical-align: middle;" width="36%">Hanno Embregts</td>
        <td style="text-align: left; padding: 0 0 0 0; vertical-align: middle;">
            <img width="16%" data-src="img/logos/ace-pro-spade.png" class="no-background" style="margin-top: 30px; vertical-align: middle;"/>
            <img width="20%" data-src="img/logos/java-champion.png" class="no-background" style="margin-top: 30px; vertical-align: middle;"/>
        </td>
        <td style="vertical-align: middle; text-align: right;"><img width="35%" data-src="img/icons/twitter-white.png" class="no-background" style="margin-top: 35px"/></td>
        <td style="vertical-align: middle; padding: 0 0 0 0"><a href="https://www.twitter.com/hannotify">@hannotify</a></td>
    </tr>
</table>
<img data-src="img/logos/info-support.png" width="30%" class="no-background" style="vertical-align: middle; margin-right: 2em">
<img data-src="img/logos/snic-sustainabilit.svg" width="35%" style="vertical-align: middle" class="no-background"/>
<br/>

note:
**Time Elapsed:** `0:00`.

*Voorbereidingen*:

* Verbind Spotlight met de Logitech-software.
* Leg dobbelsteen klaar
* Start Rancher Desktop
* Eerste scherm:
  * Speaker notes
  * VSCode, voor Random.java
  * Terminal:
    * Tab met `mirror`
    * Tab met de slides draaiend
    * Tab voor fossil, met working-dir `/Users/hanno/Code/fossil`
    * Tab voor pijul - verbonden met Docker-container (`docker run -it pijul`)
      * If this fails, then build and tag the image first.
```bash
cd ~/Code/talks/slide-decks/will-git-be-around-forever/docker`
docker build --tag 'pijul' .
```
* Tweede scherm:
  * Slides
  * Nieuwe tab voor Fossil UI
  * https://github.com/hannotify/articles/pulls
* Telefoon met de demostappen erop
* Reset de timer in de speaker notes

Hi, my name is Hanno. 
From the Netherlands, and I work at Info Support as an IT consultant.
Recently I've received the Oracle ACE Pro award in the 'Java' category.
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

# Teaching a course on Git <!-- .element class="stroke" -->

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
