## 升级R版本后，更新Package ##

1）在旧版本中的R中运行


> --run in the old version of R

setwd("C:/Temp/")  #注意要在C盘中新建Temp文件夹

packages <- installed.packages()[,"Package"]

save(packages, file="Rpackages")

2）在新版本中的R运行

> --run in the new version 

setwd("C:/Temp/") 

load("Rpackages") 

for (p in setdiff(packages, installed.packages()[,"Package"])) 

install.packages(p) 

运行新版本将发现所有原有Package可以在新版中运行





---

## 必装的包 ##

    ggplot2

---

	DMwR  

Data Mining with R

---

	RMySQL 未完成

[解决方案](http://f.dataguru.cn/thread-12104-1-1.html)


---

    zoo

---

    plyr

---

    utils

---
	lattice
作图用

---
	tcltk2
作图用，带GUI

---
Rcmdr

The widely used Rcmdrpackage, which provides a set of graphical interfaces to numerous R functions, can be run in this manner. One can also use the interfaces provided
by RGtk2 and qtbase.

---

roxygen2 package  to  document  our  package’s  functions

---

安装vcd包（一个用于可视化类别数据的包

---

    foreign
用来导入数据

----

SPSS数据集可以通过foreign包中的函数read.spss()导入到R中，也可以使用`Hmisc`包中的spss.get()函数。

---

	reshape
拥有一系列强大的数据集结构修改函数

--------

    sqldf包

可以使用sqldf()函数
在数据框上使用SQL中的SELECT语句。

---

reshape包 是一套重构和整合数据集的绝妙的万能工具。

---

gplots

-----

doBy包和psych包也提供了分组计算描述性统计量的函数。



















