<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Predictions

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 42 min.

Well, the wait is finally over, it's prediction time!
About time, right?

Let's compile a list of the prediction variables that we've assembled. 

---

## Prediction variables

* Killer features. <!-- .element: class="fragment fade-in-then-semi-out" -->
* Hosting platform support. <!-- .element: class="fragment fade-in-then-semi-out" -->
* Open-source community support. <!-- .element: class="fragment fade-in-then-semi-out" -->
* The handicap of a head start. <!-- .element: class="fragment fade-in-then-semi-out" -->

note:
Looks like we've gathered four prediction variables so far:

* **Killer features.**
* **Hosting platform support.** 
* **Open-source community support.**
* **The handicap of a head start.**

---

<table>
    <thead>
        <tr>
            <th/>
            <th>Git</th>
            <th>Hg</th>
            <th>TFVC</th>
            <th>Fossil</th>
            <th>Pijul</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Features</th>
            <td align="center"><code>-</code></td>
            <td align="center"><code>-</code></td>
            <td align="center"><code>-</code></td>
            <td align="center"><code>+</code></td>
            <td align="center"><code>++</code></td>
        </tr>  
        <tr class="fragment">
            <th align="right">Hosting</th>
            <td align="center"><code>++</code></td>
            <td align="center"><code>+</code></td>
            <td align="center"><code>-</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>0</code></td>
        </tr>
        <tr class="fragment">
            <th align="right">Open-source</th>
            <td align="center"><code>++</code></td>
            <td align="center"><code>++</code></td>
            <td align="center"><code>--</code></td>
            <td align="center"><code>-</code></td>
            <td align="center"><code>+</code></td>
        </tr>
        <tr class="fragment">
            <th align="right">Dominant</th>
            <td align="center"><code>--</code></td>
            <td align="center"><code>-</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>0</code></td>
        </tr>    
        <tr class="fragment">
            <th/>
            <th align="center"><code>+1</code></td>
            <th align="center"><code>+1</code></td>
            <th align="center"><code>-4</code></td>
            <th align="center"><code>0</code></td>
            <th align="center"><code>+3</code></td>
        </tr>              
    </tbody>
</table>

note:
Pijuls major feature (fast patch-based versioning) might lure new users who think Git is too difficult to understand.
Fossil just adds 'show descendants' and an integrated developer website to the mix, which in my opinion is a bit less 'killer'.

[slide]

Hosting capabilities for Git are superb. 
Wikipedia lists 19 different hosting websites that support Git.
Mercurial has 9 websites.
TFVC only has 1 - which is Azure DevOps.
Fossil and Pijul both have one, but with the potential to grow.

[slide]

Git and Hg have proven that that contribute massively to open-source development.
TFVC just doesn't.
I'm not too impressed with Fossil on this one.
With their 'Github-in-a-box' and 'you don't need a dedicated hosting platform', they tend to tailor their product to small teams that are physically at the same location (and not spread out across the world). 
This is not the best support that open-source development can have.
And Pijul shows potential with the Pijul Nest. 
But the Nest obviously needs to become a lot more popular in the future.

[slide]

Being the dominant products, Git and Hg suffer the most from the "handicap of a head start".

---

<table>
    <thead>
        <tr>
            <th/>
            <th>2032</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Git</th>
            <td align="right">80%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">9%</td>
        </tr>  
        <tr>
            <th align="right">TFVC</th>
            <td align="right">7%</td>
        </tr>
        <tr>
            <th align="right">Subversion</th>
            <td align="right">4%</td>
        </tr>     
        <tr>
            <th align="right">CVS</th>
            <td align="right">&lt;1%</td>
        </tr>      
    </tbody>
</table>

---

<table>
    <thead>
        <tr>
            <th/>
            <th><del>2032</del></th>
            <th>2032</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Git</th>
            <td align="right"><del>80%</del></td>
            <td align="right">77%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right"><del>9%</del></td>
            <td align="right">8%</td>
        </tr>
          <tr>
            <th align="right">Pijul</th>
            <td align="right"></td>
            <td align="right">5%</td>
        </tr>      
        <tr>
            <th align="right">TFVC</th>
            <td align="right"><del>7%</del></td>
            <td align="right">4%</td>
        </tr>
        <tr>
            <th align="right">Subversion</th>
            <td align="right"><del>4%</del></td>
            <td align="right">4%</td>
        </tr>  
        <tr>
            <th align="right">Fossil</th>
            <td align="right"></td>
            <td align="right">2%</td>
        </tr>           
        <tr>
            <th align="right">CVS</th>
            <td align="right"><del>&lt;1%</del></td>
            <td align="right">&lt;1%</td>
        </tr>      
    </tbody>
</table>

note:
So, this is the final prediction!
I think Git will gain a few users who now use TFVC.
(In my Git course I meet a lot of TFVC users who are switching to Git)
Especially since this is now so easy in Azure DevOps.
And both Git and Mercurial will lose some users to Pijul, and to a lesser extent: to Fossil.

So Pijul might be the third version control system in 2032!
But I based this prediction on the current hosting situation.
Should Github or GitLab announce in the meantime that they're gonna support Fossil, for example, then Fossil will gain users a lot faster and might even take the #2 spot from Mercurial.

So this is my prediction when hosting platform keep supporting what they currently support.
If that changes, obviously these predictions will have to change, too.
