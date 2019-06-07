<!-- .slide: data-background="img/background/usb-sticks.jpg" data-background-color="black" data-background-opacity="0.3"-->

# Predictions

<https://pxhere.com/en/photo/652221>  <!-- .element: class="attribution" -->

note: 
**Time Elapsed:** 44 min.

Well, the wait is finally over, it's prediction time!
About time, right?

Let's compile a list of the prediction variables that we've assembled. 

---

## Prediction variables

* Killer features.
* Hosting platform support.
* Open-source community support.
* The disadvantage of the dominant product.

note:
Looks like we've gathered four prediction variables so far:

* **Killer features.**
* **Hosting platform support.** 
* **Open-source community support.**
* **The disadvantage of the dominant product.**

---

<table>
    <thead>
        <tr>
            <th/>
            <th>Git</th>
            <th>Hg</th>
            <th>TFS</th>
            <th>Fossil</th>
            <th>Pijul</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <th align="right">Features</th>
            <td align="right">-1</td>
            <td align="right">-1</td>
            <td align="right">-1</td>
            <td align="right">+1</td>
            <td align="right">+2</td>
        </tr>  
        <tr class="fragment">
            <th align="right">Hosting</th>
            <td align="right">+2</td>
            <td align="right">+1</td>
            <td align="right">-1</td>
            <td align="right">0</td>
            <td align="right">0</td>
        </tr>
        <tr class="fragment">
            <th align="right">Open-source</th>
            <td align="right">+2</td>
            <td align="right">+2</td>
            <td align="right">-2</td>
            <td align="right">-1</td>
            <td align="right">+1</td>
        </tr>
        <tr class="fragment">
            <th align="right">Dominant</th>
            <td align="right">-2</td>
            <td align="right">-1</td>
            <td align="right">0</td>
            <td align="right">0</td>
            <td align="right">0</td>
        </tr>    
        <tr class="fragment">
            <th/>
            <th align="right">+1</td>
            <th align="right">+1</td>
            <th align="right">-4</td>
            <th align="right">0</td>
            <th align="right">+3</td>
        </tr>              
    </tbody>
</table>

note:
Pijuls major feature (fast patch-based versioning) might lure new users who think Git is too difficult to understand.
Fossil just adds 'show descendants' and an integrated developer website to the mix, which in my opinion is a bit less 'killer'.

[slide]

Hosting capabilities for Git are superb. 
Wikipedia lists 16 different hosting websites that support Git.
Mercurial has 9 websites.
TFS only has 1 - which is Azure DevOps.
Fossil and Pijul both have one, but with the potential to grow.

[slide]

Git and Hg have proven that that contribute massively to open-source development.
TFS just doesn't.
I'm not too impressed with Fossil on this one.
With their 'Github-in-a-box' and 'you don't need a dedicated hosting platform', they tend to tailor their product to small teams that are physically at the same location (and not spread out across the world). 
This is not the best support that open-source development can have.
And Pijul shows potential with the Pijul Nest. 
But the Nest obviously needs to become a lot more popular in the future.

[slide]

Being the dominant products, Git and Hg suffer the most from the "disadvantage of the dominant product".

---

<table>
    <thead>
        <tr>
            <th/>
            <th>2029</th>
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
            <th align="right">TFS</th>
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
            <th><del>2029</del></th>
            <th>2029</th>
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
            <th align="right">TFS</th>
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
I think Git will gain a few users who now use TFS.
(In my Git course I meet a lot of TFS users who are switching to Git)
And both Git and Mercurial will lose some users to Pijul, and to a lesser extent: to Fossil.

So Pijul will be the third version control system in 2029!
But I based this prediction on the current hosting situation.
Should Github announce in the meantime that they're gonna support Pijul, for example, then Pijul will gain users a lot faster and might even take the #2 spot from Mercurial.

