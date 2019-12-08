<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Why did Git become so popular?

[https://pxhere.com/en/photo/652221](https://pxhere.com/en/photo/652221)  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 7 min.

The question remains: which one will it be?
Which one will be the successor?

Now in finding the answer to this question, we obviously have to make a prediction.
We have to predict which version control system will be popular in, say, ten years.
And throughout this talk, we will discover several ideas that can be useful to our prediction. 
I call these ideas 'prediction variables'.
At the end of the talk, we will use these 'variables' to make the final prediction.

And I think we can discover them quickly by gathering information on the 'current big thing'.
And how 'the current big thing' became 'the big thing' in the first place.
So, why *did* Git become so popular?

---

## Main features of Git

* Distributed <!-- .element: class="fragment fade-in-then-semi-out" -->
* Free &amp; open-source <!-- .element: class="fragment fade-in-then-semi-out" -->
* Fast <!-- .element: class="fragment fade-in-then-semi-out" -->
* Optimized for branching <!-- .element: class="fragment fade-in-then-semi-out" -->

note:
Well, as you may already know, these are Git's main features:

* **Distributed**
  * Like BitKeeper. Commit often, push once.
* **Free &amp; open-source**
  * **Unlike** BitKeeper, obviously!
* **Fast** 
  * Linus said "everything you ever do on a daily basis should take less than a second".
* **Optimized for branching**
  * Like Subversion, Git has 'easy branching'.
  * In the CVS age, developers 'were afraid of branching', so they didn't do it! 
  * Which was a very bad thing in a time where Continuous Delivery did not yet exist like we know it today.

---

## Some surprising facts on Git

<blockquote class="fragment">
    "I'm an egotistical bastard, so I name all my projects after myself. First Linux, now git."
</blockquote>

<https://www.infoworld.com/article/2669670/after-controversy--torvalds-begins-work-on--git-.html>  <!-- .element: class="attribution" -->

note:
When Linus Torvalds was asked why he called the new software, "git," British slang meaning "a rotten person," he said:
[slide] 
"I'm an egotistical bastard, so I name all my projects after myself. First Linux, now git."

---

<!-- .slide: data-background="img/background/implementation-decision.jpg" data-background-color="black" data-background-opacity="0.5"-->

## WWCVSND?

<blockquote class="explanation">
    If in doubt, make the exact opposite decision.
</blockquote>

<https://pxhere.com/en/photo/704019> <!-- .element: class="attribution" -->

note:
When Linus Torvalds was developing Git, one of his guiding principles was WWCVSND, or “What Would CVS Not Do.” 
Which means: 
Take CVS as an example of what not to do; and if in doubt, make the exact opposite decision.

---

<!-- .slide: data-background="img/background/crystal-ball.jpg" data-background-color="black" data-background-opacity="0.5" --->

## Killer features.

<blockquote class="explanation">
    <code>prediction variable #1</code>
</blockquote>

<https://www.pexels.com/photo/photo-displays-person-holding-ball-with-reflection-of-horizon-940880> <!-- .element: class="attribution" -->

note:
Now I think 'Killer features' should be our first *prediction variable*.

And by 'Killer features' I mean two things:
* new features (that have never been seen); or 
* similar features, implemented differently (where a similar feature has been implemented in a radically different way, to distinguish it from any competitors).

Git is a great example of 'Killer features', because it was designed to be the opposite of CVS in many aspects.
And it went and got popular, so lots of reasons to use 'Killer features' as a prediction variable.

---

<!-- .slide: data-background-color="#f9f9f9" data-background="img/background/vcs-popularity-graph.png" data-background-size="60%" --->

<https://blog.gitprime.com/git-didnt-beat-svn-github-did> <!-- .element: class="attribution" -->

note:
Here is some information on how Git became 'the big thing'.

Now there's a lot of significant information in this chart: (*point*)
* For example, Git's growth increased rapidly after it was supported by Github (2008), Bitbucket (2012) and Gitlab (2013).
* Subversion's popularity peaked in 2009 
  * 4 years after Git and Mercurial were released;
  * also: after Github was launched.
* Mercurial started declining **only** after Bitbucket added Git support.

I would like to point out that all data that's displayed here is an approximation of the real usage. 
It is not the **actual** usage of the products.
Version control popularity can't be *measured* like with browsers, for example.
These data were acquired by combining usage statistics from various sources.
Sources like Google Trends, GitHub, Atlassian and GitLab.
So any prediction based on these estimates will also be an estimate. 

---

<!-- .slide: data-background="img/background/crystal-ball.jpg" data-background-color="black" data-background-opacity="0.5" --->

## Hosting platform support.

<blockquote class="explanation">
    <code>prediction variable #2</code>
</blockquote>

<https://www.pexels.com/photo/photo-displays-person-holding-ball-with-reflection-of-horizon-940880> <!-- .element: class="attribution" -->

note:
So it seems that the available source code hosting for a particular version control system has quite some influence on its popularity!
Which is why I think "Hosting platform support" should be our second 'prediction variable'.

---

<!-- .slide: data-background="img/background/crystal-ball.jpg" data-background-color="black" data-background-opacity="0.5" --->

## Open-source community support.

<blockquote class="explanation">
    <code>prediction variable #3</code>
</blockquote>

<https://www.pexels.com/photo/photo-displays-person-holding-ball-with-reflection-of-horizon-940880> <!-- .element: class="attribution" -->

note:
Let's introduce another one, while we`re at it!
Your version control system may be supported by a hosting provider, but that doesn't necessarily mean that said hosting provider supports the open-source community.
Lots of hosting providers primarily offer private repositories.
Also, not all version control systems focus as much on open-source develoment as Git does, for example.
So, here's prediction variable number three: "Open-source community support."

That's enough about prediction variables, for now.
Let's try and make a first prediction.
Which at this early stage can only be done by using one approach:
"Extrapolate from incomplete data"

---

<!-- .slide: data-background="img/background/there-are-two-types-of-people.png" data-background-size="cover" --->

<https://bingeprints.com/products/there-are-two-types-of-people-those-who-can-extrapolate-from-incomplete-data-mug-funny-statistics-math-coffee-cup-1> <!-- .element: class="attribution" -->

note:
After all, we all know there are only two types of people in the world.
1. Those who can extrapolate from incomplete data.

So, let's take some existing data and extrapolate it!

---

<!-- .slide: data-background-color="#f9f9f9" data-background="img/background/vcs-popularity-graph.png" data-background-size="60%" --->

<https://blog.gitprime.com/git-didnt-beat-svn-github-did> <!-- .element: class="attribution" -->

---

## First Prediction

<table>
    <thead>
        <tr>
            <th/>
            <th>2009</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Subversion</th>
            <td align="right">43%</td>
        </tr>
        <tr>
            <th align="right">Git</th>
            <td align="right">19%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">16%</td>
        </tr>  
        <tr>
            <th align="right">TFS</th>
            <td align="right">6%</td>
        </tr>
        <tr>
            <th align="right">CVS</th>
            <td align="right">5%</td>
        </tr>      
    </tbody>
</table>

---

<!-- .slide: data-background-color="#f9f9f9" data-background="img/background/vcs-popularity-graph.png" data-background-size="60%" --->

<https://blog.gitprime.com/git-didnt-beat-svn-github-did> <!-- .element: class="attribution" -->

---

## First Prediction

<table>
    <thead>
        <tr>
            <th/>
            <th>2009</th>
            <th>2019</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Subversion</th>
            <td align="right">43%</td>
            <td align="right">8%</td>
        </tr>
        <tr>
            <th align="right">Git</th>
            <td align="right">19%</td>
            <td align="right">73%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">16%</td>
            <td align="right">12%</td>
        </tr>  
        <tr>
            <th align="right">TFS</th>
            <td align="right">6%</td>
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

<!-- .slide: data-background-color="#f9f9f9" data-background="img/background/vcs-popularity-graph.png" data-background-size="60%" --->

<https://blog.gitprime.com/git-didnt-beat-svn-github-did> <!-- .element: class="attribution" -->

---

## First Prediction

<table>
    <thead>
        <tr>
            <th/>
            <th>2009</th>
            <th>2019</th>
            <th>2029</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Subversion</th>
            <td align="right">43%</td>
            <td align="right">8%</td>
            <td align="right">4%</td>
        </tr>
        <tr>
            <th align="right">Git</th>
            <td align="right">19%</td>
            <td align="right">73%</td>
            <td align="right">80%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">16%</td>
            <td align="right">12%</td>
            <td align="right">9%</td>
        </tr>  
        <tr>
            <th align="right">TFS</th>
            <td align="right">6%</td>
            <td align="right">7%</td>
            <td align="right">7%</td>
        </tr>
        <tr>
            <th align="right">CVS</th>
            <td align="right">5%</td>
            <td align="right">&lt;1%</td>
            <td align="right">&lt;1%</td>
        </tr>      
    </tbody>
</table>

---

<!-- .slide: data-background="img/background/problem-encountered.jpg" data-background-color="black" data-background-opacity="0.5" --->

## One problem though.

<blockquote class="explanation">
    We haven't included <em>any</em> new products!
</blockquote>

<https://www.pexels.com/photo/man-in-black-shirt-and-gray-denim-pants-sitting-on-gray-padded-bench-1134204> <!-- .element: class="attribution" -->

note:
Yeah, one problem though.
We haven't included *any* new products.
This 'first prediction' is based entirely on existing products.
But a lot can happen in ten years!
What if a brand-new, feature-packed version control system appears and takes the market by storm?
