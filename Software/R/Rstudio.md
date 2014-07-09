Integrated Development Environment (IDE)

command-line interface (CLI)


![](http://img3.douban.com/view/photo/photo/public/p2190490961.jpg)


----

[about the book](http://shop.oreilly.com/product/0636920021278.do)

---

This is basically **comma-separated-value (CSV)** data with a nonstandard separator.

most data used in R should be in the form of CSV.

可以使用Excel对数据预处理，但最终应该使用CSV输出，以供R操作

---

    read.csv()

---

R has many different classes for working with time-series data. In this case study we will look at two. The  **POSIXct** class records time by *the number of
seconds since the beginning of 1970* and is useful for storing times in a data frame, such
as x. 

R在处理时间序列分析上独有一套

The **zoo** package is designed for such data, as one
needs only ordered observations for the time index.


----

Using the Code Editor to Write R Scripts

---

Commands can be combined on one line if
separated by a semicolon and can extend over multiple lines. 


---

R has two commonly used options
for assignment:  =and ←(the latter is preferred by most longtime R users). 

    Alt + -

---
 Typing can be a chore, proper command syntax is essential, and the user needs to have intimate knowledge of the function and its arguments.

---

Keyboard Shortcuts

![](http://img3.douban.com/view/photo/photo/public/p2190600631.jpg)

![](http://img3.douban.com/view/photo/photo/public/p2190600633.jpg)

---

**Command History**

RStudio keeps a stack of past commands
and allows one to scroll through them easily. This can be done using the up and down
arrow  keys.

---

For properly formatted text files, RStudio provides the Import Dataset toolbar button to open a dialog to initiate the process.

---
As such, it is important to plan a graphic
prior to creating it—for example, computing the size of the coordinate space that will
be needed.

---

we will use the roxygen2 package  to  document  our  package’s  functions.

---


Testing a package can involve loading the package, testing it, making desired changes,
then reloading the package.

----

The devtoolspackage provides the  load_allfunction to reload the package without
having to restart R. 

----

 R has the  data directory for including data in a package.


---

![](http://img3.douban.com/view/photo/photo/public/p2190619612.jpg)

![](http://img3.douban.com/view/photo/photo/public/p2190619614.jpg)

---




