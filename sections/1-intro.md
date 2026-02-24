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
        <td style="vertical-align: middle; text-align: right;"><img width="35%" data-src="img/icons/bluesky.png" class="no-background" style="margin-top: 35px"/></td>
        <td style="vertical-align: middle; padding: 0 0 0 0"><a href="https://bsky.app/profile/hanno.codes">@hanno.codes</a></td>
    </tr>
</table>
<img data-src="img/logos/info-support.png" width="30%" class="no-background" style="vertical-align: middle; margin-right: 2em">
<img data-src="img/logos/brabantjug.avif" width="25%" style="vertical-align: middle" class="no-background"/>
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
    * Tab voor fossil, met working-dir `/Users/hanno/Code/version-control/fossil`
    * Tab voor pijul - verbonden met Docker-container (`docker run -it pijul`)
      * If this fails, then build and tag the image first.
```bash
cd ~/Code/talks/slide-decks/will-git-be-around-forever/docker`
docker build --tag 'pijul' .
```
    * Tab voor sapling, met working-dir `/Users/hanno/Code/version-control/sapling`
* Tweede scherm (Ecosia):
  * Slides
* Derde scherm (Safari):
  * https://dangitgit.com
  * https://git-man-page-generator.lokaltog.net
  * https://www.janavirgin.com/CO2/
  * https://ecosia.com
  * https://oceanhero.today
  * Fossil UI (http://localhost:8080/timeline?c=current)
  * Pull Request created with Sapling (https://github.com/hannotify/articles/pulls)
* Telefoon met de demostappen erop (Apple Notes)
* Reset de timer in de speaker notes

*Talk start*:

**Time Elapsed:** `0:00`.

* [show cassette tape to audience]
* "I have a question for you."
* "Who knows what this is?"
* (...)
* "This is how we listened to audio back then!"
* "It's easy, it's familiar and it works! Well, most of the time."
* "Who has used one of these in the past year?"
* "Right, no one. So the cassette tape had a good run, but it has been replaced by better alternatives."
* --
* "I've brought something else" [usb stick]
* "Come on, can I get some love for USB sticks?"
* "No no! Let's be serious for a minute."
* "Can I please see a show of hands: who has used a USB stick at least once in the past year?"
* ("Right?! USB sticks are neat!" or "Hey!! Don't hurt its feelings.")

---

<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Version Control by USB stick <!-- .element class="stroke" -->

note:
When I started my first Software Development job, USB sticks played a vital part in our version control strategy.
Because there we did 'Version Control by USB Stick'.
[tell the story, including the 'integration laptop' which was an Exchange resource in Outlook with its own calendar]
Eventually we switched to... CVS. Very modern.

---

### Version Control by email <!-- .element class="fragment" data-fragment-index="9"-->

<table class="email-inbox">
  <tr class="fragment" data-fragment-index="8">
    <td class="checkbox">☐</td>
    <td class="star">★</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">FINAL VERSION - supersedes all others</td>
    <td class="attachment">📎</td>
    <td class="date">Mar 10</td>
  </tr>
  <tr class="fragment" data-fragment-index="7">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">Newer version<span class="excerpt"> - asdfasdf</span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 09</td>
  </tr>
  <tr class="fragment" data-fragment-index="6">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">newer version so much better<span class="excerpt"> - ngl, it's dope, lol</span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 09</td>
  </tr>
  <tr class="fragment" data-fragment-index="5">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">even better version<span class="excerpt"> - you know what to do</span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 08</td>
  </tr>
  <tr class="fragment" data-fragment-index="4">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">better final version with attachment!<span class="excerpt"> - sorry, forgot to attach the actual presentation</span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 08</td>
  </tr>
  <tr class="fragment" data-fragment-index="3">
    <td class="checkbox">☐</td>
    <td class="star">☆</td>
    <td class="sender">Hanno E.</td>
    <td class="subject">better final version<span class="excerpt"> - All, see attachment. - H</span></td>
    <td class="attachment"></td>
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
    <td class="subject">Presentation<span class="excerpt"> - Dear project members, I have attached the presentation file that we prepared </span></td>
    <td class="attachment">📎</td>
    <td class="date">Mar 08</td>
  </tr>
</table>

note:
Although things could be worse, because THIS is also something I have dabbled with in the past. (not at work though)
Let's call it (slide x9) 'Version Control by email'.

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

---

<!-- .slide: data-background="img/background/bitkeeper-goes-commercial.png" data-background-size="contain" data-background-color="#707070" -->

note:

* But in 2005, Bitkeeper started charging licensing costs to open-source projects
* So the Linkux kernel team developed their own VCS: `git`
* (which also supports sending patches via email, by the way)
* [demo `git send-email --help`)
* So that's "Version Control by Email" all over again!

---

<!-- .slide: data-background="img/background/version-control-timeline.png" data-background-size="contain" data-background-color="white" -->

<http://blog.plasticscm.com/2010/11/version-control-timeline.html> <!-- .element: class="attribution" -->

note:

Anyway, to a few of my students, on this slide something entirely different had caught their attention.
Something that I didn't even notice while I'd prepared the course.

That's nothing to be embarrassed about.
Sometimes we just miss stuff that is right in front of us.



---

<!-- .slide: data-background="img/background/red-car-brand-new-front.jpg" data-background-color="black" data-background-opacity="1.0" data-background-size="contain" -->

note:
Like that time I got a brand-new electric car.

(tell the story 'The Decoy Car', and mention sustainability!)

---

<!-- .slide: data-background="img/background/red-car-with-damage.jpeg" data-background-color="black" data-background-opacity="1.0" data-background-size="contain" -->

---

<!-- .slide: data-background="img/background/two-red-cars.jpeg" data-background-color="black" data-background-opacity="1.0" data-background-size="contain" -->

note: 
[mention the other car as 'the decoy car']

---

<!-- .slide: data-background="img/background/version-control-timeline.png" data-background-size="contain" data-background-color="white" -->

<http://blog.plasticscm.com/2010/11/version-control-timeline.html> <!-- .element: class="attribution" -->

note:
Back to the Git course I was teaching. Just like the decoy car, what was right in front of us, according to my students in this timeline picture?

Recall that I had focused on the events of the year 2005, but instead my students were drawn to the 'gap' that followed.
One of them came to me with a question about that 'gap'.
And she said: "Git is great and all that, but what's gonna be the **next** big thing?"
"It looks like nothing has happened in Version Control world for over ten years!"

And that was a very good question.
I told her: 

* we're quite sure that distributed version control systems like Git and Mercurial will be around for much longer.

But of course this wasn't a proper answer at all!
Because **I didn't know** what was gonna be the next big thing.

I had effectively told her that "Git will probably be around forever", even if I didn't phrase it exactly like that.
That didn't sit right with me.
So I decided to research the matter a bit further.
And the research got out of hand and eventually turned into this conference talk.

---

### So this talk will be about

* Git <!-- .element: class="fragment fade-in-then-semi-out" -->
* familiar things <!-- .element: class="fragment fade-in-then-semi-out" -->
* sustainability <!-- .element: class="fragment fade-in-then-semi-out" -->

note:

* **Git**, the version control system, how it became popular and a few alternatives to Git that already exist.
* It'll be about **familiar things**, things that we keep using but we've forgotten why exactly. (like the USB-stick at the start of the talk)
* And I'll briefly touch upon **sustainability**, more on that later.

---

<!-- .slide: data-background-color="white" data-transition="none" -->

<img data-src="img/logos/brabantjug-white.avif" width="60%" style="vertical-align: middle" class="no-background fragment"/>
<img data-src="img/logos/git-red.png" width="30%" style="vertical-align: middle" class="no-background fragment"/>

note:

Actually, the BrabantJUG logo (slide) was what gave me the idea to talk about Git in the first place (slide).

