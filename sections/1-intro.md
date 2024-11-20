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

*Voorbereidingen*:

* Verbind Spotlight met de Logitech-software.
* Leg dobbelsteen klaar
* Start Rancher Desktop
* Verbind met internet
* Eerste scherm:
  * Speaker notes
  * IntelliJ IDEA, voor Random.java
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
  * Nieuwe tab voor Fossil UI (http://localhost:8080/timeline?c=current)
  * Tab voor de Sapling demo (https://github.com/hannotify/articles/pulls)
* Telefoon met de demostappen erop (https://trello.com/c/WT8ILiTd/109-demos-tools-in-action-successor-of-git)
* Reset de timer in de speaker notes

*Talk start*:

**Time Elapsed:** `0:00`.

* [pretend to grab USB stick and copy some files]
* (about 10 seconds later) "Oh, don't mind me. Just copying some files here."
* (about 5 seconds later) "Just a few resources I need in order to do this talk."
* (about 5 seconds later) "There, all done."
* [eject USB stick, and put it someplace else]
* (about 5 seconds later) "What?!"
* "This is how we did things back then!"
* "It's easy, it's familiar and it works most of the time."
* "Come on, can I get some love for USB sticks?"
* "No no! Let's be serious for a minute."
* "Can I please see a show of hands: who has used a USB stick at least once in the past year?"
* ("Right?! USB sticks are neat!" or "Hey!! Don't hurt its feelings.")

---

<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Version Control by USB stick <!-- .element class="stroke" -->

note:
When I started my first Software Development job, we did 'Version Control by USB Stick'.
Eventually we switched to... CVS. Very modern.

---

### Version Control by email <!-- .element class="fragment" data-fragment-index="8"-->

<table class="email-inbox">
  <tr class="fragment" data-fragment-index="7">
    <td class="checkbox">☐</td>
    <td class="star">★</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">FINAL VERSION - supersedes all others</td>
    <td class="attachment">📎</td>
    <td class="date">Mar 10</td>
  </tr>
  <tr class="fragment" data-fragment-index="6">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">Newer version<span class="excerpt"> - asdfasdf</span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 09</td>
  </tr>
  <tr class="fragment" data-fragment-index="5">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">newer version so much better<span class="excerpt"> - ngl, it's dope</span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 09</td>
  </tr>
  <tr class="fragment" data-fragment-index="4">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">even better version<span class="excerpt"> - you know what to do</span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 08</td>
  </tr>
  <tr class="fragment" data-fragment-index="3">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">better final version<span class="excerpt"> - All, see attachment. - H</span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 08</td>
  </tr>
  <tr class="fragment" data-fragment-index="2">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">final presentation<span class="excerpt"> - Hi all, I attached the final version. Best, Hanno</span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 08</td>
  </tr>
  <tr class="fragment" data-fragment-index="1">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">presentation<span class="excerpt"> - Dear project members, I have attached the presentation file that we prepared </span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 08</td>
  </tr>
</table>

note:
Although things could be worse, because THIS is also something I have dabbled with in the past. (not at work though)
Let's call it 'Version Control by email'.

---

<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Teaching a course on Git <!-- .element class="stroke" -->

<https://pxhere.com/en/photo/652221> <!-- .element: class="attribution" -->

note:
Thank goodness it's 17 years later now, because I've gained proper experience with Subversion and Git.
I even teach a "Git" course at Info Support.
It's a one-day course where I teach our interns and juniors how to use Git **as a developer**.
We discuss the pros and cons of distributed version control and how it compares to earlier version control systems, like CVS and Subversion. 

---

<!-- .slide: data-background="img/background/version-control-timeline.png" data-background-size="contain" data-background-color="white" -->

<http://blog.plasticscm.com/2010/11/version-control-timeline.html> <!-- .element: class="attribution" -->

note:
This is actually one of the course slides.
Displaying which version control systems have emerged until now, and their publication date.
By comparing the publication dates to the most modern phone known at the time, you get a sense of how old these systems are.

So, for example, Subversion relates to the Nokia 3310. (point)
Both *indestructible*.
And CVS relates to the thing with the power plug.
Both are obviously **ancient**!

Now during the Git course I mainly talk about the events of the year 2005 and why so many new version control systems emerged in that year.
It has to do with BitKeeper. 

[Tell the licensing story]

* BitKeeper: distributed version control
* Used to maintain the Linux kernel
* Started charging licensing costs to open-source projects
* So they developed their own VCS
* (which also supports sending patches via email, by the way)
* [demo `git send-email --help`)
* So that's "Version Control by Email" all over again!

Anyway, to a few of my students, something else entirely had caught their attention.
Something that I didn't even notice while I'd prepared the course.

---

<!-- .slide: data-background="img/background/red-car-brand-new-front.jpg" data-background-color="black" data-background-opacity="1.0" data-background-size="contain" -->

note:
This phenomenon can happen to every single one of us.
(tell the story 'The Decoy Car', and mention sustainability!)

---

<!-- .slide: data-background="img/background/red-car-with-damage.jpeg" data-background-color="black" data-background-opacity="1.0" data-background-size="contain" -->

---

<!-- .slide: data-background="img/background/two-red-cars.jpeg" data-background-color="black" data-background-opacity="1.0" data-background-size="contain" -->

---

<!-- .slide: data-background="img/background/version-control-timeline.png" data-background-size="contain" data-background-color="white" -->

<http://blog.plasticscm.com/2010/11/version-control-timeline.html> <!-- .element: class="attribution" -->

note:
Back to my Git course. What had caught the attention of my students in this timeline picture?

At the end of one particular course day, a student came to me with a question.
And she said: "Git is great and all that, but what's gonna be the **next** big thing?"
"It looks like nothing has happened in Version Control world for over ten years!"

I told her: 

* we're quite sure that distributed version control systems like Git and Mercurial will be around for much longer.

But of course this wasn't a proper answer at all!
Because **I didn't know** what was gonna be the next big thing.

I had effectively told her that "Git will probably be around forever", even if I didn't phrase it exactly like that.
That didn't sit right with me.
So I decided to research the matter a bit further.
And the research got out of hand and eventually turned into this conference talk.

---

<!-- .slide: data-background-color="white" data-transition="none" -->

<img data-src="img/logos/snic-sustainabilit.svg" width="60%" style="vertical-align: middle" class="no-background fragment"/>
<img data-src="img/logos/git.png" width="30%" style="vertical-align: middle" class="no-background fragment"/>

note:
So, this talk will mainly be about Git, and about how long it will stick around.
What does that have to do with sustainability, you ask?
Don't worry, I'll get to that part.
For now, let's just say I came here to talk about Git because the event logo (slide) and the Git logo (slide) are so alike.

---

<!-- .slide: data-background-color="white" data-transition="none" -->

<img data-src="img/logos/snic-sustainabilit.svg" width="60%" style="vertical-align: middle" class="no-background"/>
<img data-src="img/logos/git.png" width="30%" style="vertical-align: middle; transform: rotate(315deg);" class="no-background"/>
