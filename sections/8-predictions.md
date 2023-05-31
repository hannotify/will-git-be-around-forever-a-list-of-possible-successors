<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Predictions

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** `27:00`.

Looks like it's prediction time!

---

## Prediction variables

* Killer features. 
* Hosting platform support. 
* Open-source community support. 
* IDE support.
* The handicap of a head start. 

note:
These were our prediction variables:

* **Killer features.**
* **Hosting platform support.** 
* **Open-source community support.**
* **IDE support**
* **The handicap of a head start.**

Now that we've seen a bit of Fossil, Pijul & Sapling, let's score them according to these variables.

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
            <th>Sapling</th>
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
            <td align="center"><code>+</code></td>
        </tr>  
        <tr class="fragment">
            <th align="right">Hosting</th>
            <td align="center"><code>++</code></td>
            <td align="center"><code>+</code></td>
            <td align="center"><code>-</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>+</code></td>
        </tr>
        <tr class="fragment">
            <th align="right">Open-source</th>
            <td align="center"><code>++</code></td>
            <td align="center"><code>++</code></td>
            <td align="center"><code>--</code></td>
            <td align="center"><code>-</code></td>
            <td align="center"><code>+</code></td>
            <td align="center"><code>0</code></td>
        </tr>
        <tr class="fragment">
            <th align="right">IDE support</th>
            <td align="center"><code>++</code></td>
            <td align="center"><code>++</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>-</code></td>
            <td align="center"><code>-</code></td>
        </tr>  
        <tr class="fragment">
            <th align="right">Dominant</th>
            <td align="center"><code>--</code></td>
            <td align="center"><code>-</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>0</code></td>
            <td align="center"><code>0</code></td>
        </tr>    
        <tr class="fragment">
            <th/>
            <th align="center"><code>+2</code></td>
            <th align="center"><code>+2</code></td>
            <th align="center"><code>-4</code></td>
            <th align="center"><code>0</code></td>
            <th align="center"><code>+2</code></td>
            <th align="center"><code>+1</code></td>
        </tr>              
    </tbody>
</table>

note:

**Features**

*Winner*: Pijul. Fast patch-based versioning might lure new users.
*Losers*: Git, Hg, TFVC
*OK*: Fossil, Sapling. Both have some nice features, but not 'killer' imo. 

> Fossil just adds 'show descendants' and an integrated developer website.
> Sapling has somewhat better UX than Git, but is still snapshot-based. And the large repo support is not entirely in the open-source realm.

[slide]

**Hosting**

*Winner*: Git. Support is superb.

> Wikipedia lists 18 different hosting websites that support Git.

*Loser*: TFVC

> Azure DevOps

*OK*: Hg, Fossil, Pijul, Sapling.

> Mercurial has 7 websites.
> Fossil and Pijul both have one, but with the potential to grow.
> Sapling has one, but that one happens to be 'GitHub'.

[slide]

**Open-source**

*Winners*: Git, Hg.
*Losers*: TFVC, Fossil

> I'm not too impressed with **Fossil** on this one.
> With their 'Github-in-a-box' and 'you don't need a dedicated hosting platform', they tend to tailor their product to small teams that are physically at the same location (and not spread out across the world). 
> This is not the best support that open-source development can have.

*OK*: Pijul, Sapling

> **Pijul** shows potential with the Pijul Nest. 
> But the Nest obviously needs to become a lot more popular in the future.
> **Sapling** is able to support open-source development, but keeps important parts of their large repo proposition as closed-source (so I scored them a bit lower).

[slide]

**IDE support**

*Winners*: Git, Hg
*Losers*: Pijul, Sapling
*OK*: TFVC, Fossil

> **Fossil** has a good plugin for VSCode, the IntelliJ one still works but hasn't been updated in two years.
> **Pijul**'s plugins are currently incomplete and unmaintained.
> The **Sapling** team has a plugin for VSCode, but no other IDEs are supported.

[slide]

**Dominant**

*Losers*: Git, Hg

> Being the dominant products, **Git** and **Hg** suffer the most from the "handicap of a head start".

---

<!-- .slide: data-auto-animate -->

<table data-id="predictions-animation">
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
            <td align="right">74%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">19%</td>
            <td align="right">12%</td>
        </tr>  
        <tr>
            <th align="right">TFVC</th>
            <td align="right">7%</td>
            <td align="right">6%</td>
        </tr>
        <tr>
            <th align="right">CVS</th>
            <td align="right">5%</td>
            <td align="right">&lt;1%</td>
        </tr>      
    </tbody>
</table>

---

<!-- .slide: data-auto-animate -->

<table data-id="predictions-animation">
    <thead>
        <tr>
            <th/>
            <th>2010</th>
            <th>2021</th>
            <th>2033</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Subversion</th>
            <td align="right">44%</td>
            <td align="right">8%</td>
            <td align="right">3%</td>
        </tr>    
        <tr>
            <th align="right">Git</th>
            <td align="right">25%</td>
            <td align="right">74%</td>
            <td align="right">77%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">19%</td>
            <td align="right">12%</td>
            <td align="right">8%</td>            
        </tr>
        <tr>
            <th align="right">TFVC</th>
            <td align="right">7%</td>
            <td align="right">6%</td>
            <td align="right">2%</td>
        </tr>
        <tr>
            <th align="right">CVS</th>
            <td align="right">5%</td>
            <td align="right">&lt;1%</td>
            <td align="right">&lt;1%</td>
        </tr>   
        <tr style="background-color: #555">
            <th align="right">Fossil</th>
            <td align="right">&lt;1%</td>
            <td align="right">&lt;1%</td>
            <td align="right">2%</td>            
        </tr>           
        <tr style="background-color: #555">
            <th align="right">Pijul</th>
            <td align="right"></td>
            <td align="right">&lt;1%</td>
            <td align="right">5%</td>            
        </tr>
        <tr style="background-color: #555">
            <th align="right">Sapling</th>
            <td align="right"></td>
            <td align="right">&lt;1%</td>
            <td align="right">3%</td>            
        </tr>            
    </tbody>
</table>

---

<!-- .slide: data-auto-animate -->

<table data-id="predictions-animation">
    <thead>
        <tr>
            <th/>
            <th>2010</th>
            <th>2021</th>
            <th>2033</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Git</th>
            <td align="right">25%</td>
            <td align="right">74%</td>
            <td align="right">77%</td>
        </tr>
        <tr>
            <th align="right">Mercurial</th>
            <td align="right">19%</td>
            <td align="right">12%</td>
            <td align="right">8%</td>            
        </tr>
        <tr style="background-color: #555">
            <th align="right">Pijul</th>
            <td align="right"></td>
            <td align="right">&lt;1%</td>
            <td align="right">5%</td>            
        </tr>
        <tr style="background-color: #555">
            <th align="right">Sapling</th>
            <td align="right"></td>
            <td align="right">&lt;1%</td>
            <td align="right">3%</td>            
        </tr>            
        <tr>
            <th align="right">Subversion</th>
            <td align="right">44%</td>
            <td align="right">8%</td>
            <td align="right">3%</td>
        </tr>    
        <tr style="background-color: #555">
            <th align="right">Fossil</th>
            <td align="right">&lt;1%</td>
            <td align="right">&lt;1%</td>
            <td align="right">2%</td>            
        </tr>           
        <tr>
            <th align="right">TFVC</th>
            <td align="right">7%</td>
            <td align="right">6%</td>
            <td align="right">2%</td>
        </tr>
        <tr>
            <th align="right">CVS</th>
            <td align="right">5%</td>
            <td align="right">&lt;1%</td>
            <td align="right">&lt;1%</td>
        </tr>   
    </tbody>
</table>

note:
Some observations on the final prediction!

1. Imo Git will gain a few users who now use TFVC.

> In my Git course I meet a lot of TFVC users who are switching to Git)
> Switching is very easy in Azure DevOps nowadays.

2. I'm afraid none of the 'newer' VCS's "tick all the boxes".

> **Fossil** is good for small teams, but not for larger, distributed ones.
> **Pijul** is fast and has an intuitive patch-based design, but lacks hosting and IDE support.
> **Sapling** has good hosting support and is a bit more user-friendly, but suffers from keeping parts of the code closed-source.

So none of them will replace Git in the near future imo - if things stay the way they are.
Although that's not very common in our industry.