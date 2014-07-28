
[R in action](http://www.manning.com/kabacoff/)

---


以数据科学家的角度学习R

- 获取数据（从各种数据源将数据导入程序中）；
 
- 整理数据（编码缺失值、修复或删除错误数据、将变量转换成更方便的格式）；

- 注释数据（为了记住每段数据的含义）； 

- 总结数据（通过描述性统计量了解数据的概况）；

- 数据可视化（一图胜千言）；

- 数据建模（解释数据间的关系，检验假设）；

- 整理结果（创建具有出版水平的表格和图形）。

---

![](http://img3.douban.com/view/photo/photo/public/p2190645995.jpg)

---

注释由符号 # 开头。

---

demo(graphics)

demo(Hershey)、demo(persp)和demo(image)

要看到完整的演示列表，不加参数直接运行demo()即可。

----

![](http://img5.douban.com/view/photo/photo/public/p2190647726.jpg)

---

我们可以使用函数getwd()来查看当前的工作目录，或使用函数setwd()设定当前的工作目录。

---

![](http://img3.douban.com/view/photo/photo/public/p2190648405.jpg)

---

![](http://img3.douban.com/view/photo/photo/public/p2190650782.jpg)

---

包是R函数、数据、预编译代码以一种定义完善的格式组成的集合。计算机上存储包的目录称为库（library）。函数.libPaths()能够显示库所在的位置， 函数library()则可以显示库中
有哪些包。

命令search()可以告诉你哪些包已加载并可使用。

---
> R的批处理 P15-16

----

函数attach()可将数据框添加到R的搜索路径中。

函数detach()将数据框从搜索路径中移除。

相对于attach()，多数的R书籍更推荐使用with()。

---

类别（名义型）变量和有序类别（有序型）变量在R中称为因子（factor）。

要表示有序型变量，需要为函数factor()指定参数ordered=TRUE。

需指定顺序，否则为首字母顺序赋值，levels

函数summary()会区别对待各个变量。

----

列表成为了R中的重要数据结构

- 列表允许以一种简单的方式组织和重新调用不相干的信息
- 许多R函数的运行结果都是以列表的形式返回的。

---

美元符号（$）却有着和其他语言中的句点类似的含义，即指定一个对象中的某些部分

---

[导入数据官方文档](http://cran.r-project.org/doc/manuals/R-data.pdf)

----

按照个人要求的格式来创建含有研究信息的数据集，这是任何数据分析的第一步。在R中，这个任务包括以下两步：

- 选择一种数据结构来存储数据；
- 将数据输入或导入到这个数据结构中。

数据集通常是由数据构成的一个矩形数组，行表示观测，列表示变量。

---

R中有许多用于存储数据的结构，包括标量、向量、数组、数据框和列表。

![](http://img5.douban.com/view/photo/photo/public/p2190665636.jpg)

---

向量是用于存储数值型、字符型或逻辑型数据的一维数组。执行组合功能的函数c()可用来创建向量。

---
![](http://img3.douban.com/view/photo/photo/public/p2190739621.jpg)

---

Stat/Transfer（www.stattransfer.com）是一款可在34种数据格式之间作转换的独立应用程序，其中包括R中的数据格式（见图2-4）。

使用第三方软件

---
![](http://img3.douban.com/view/photo/photo/public/p2190739965.jpg)

![](http://img3.douban.com/view/photo/photo/public/p2190740503.jpg)

---

![](http://img3.douban.com/view/photo/photo/public/p2190744192.jpg)

![](http://img3.douban.com/view/photo/photo/public/p2190744860.jpg)

![](http://img3.douban.com/view/photo/photo/public/p2190745041.jpg)


---

在R中，可以通过颜色下标、颜色名称、十六进制的颜色值、RGB值或HSV值来指定颜色。举例来说，col=1、col="white"、col="#FFFFFF"、col=rgb(1,1,1)和col=hsv(0,0,1)都是表示白色的等价方式。函数rgb()可基于红—绿—蓝三色值生成颜色，而hsv()则基于色相—饱和度—亮度值来生成颜色。请参考这些函数的帮助以了解更多细节。

[R中色彩的在线图表](http://research.stowers-institute.org/efg/R/Color/Chart)

---

[边界参数的完整指南](http://research.stowers-institute.org/efg/R/Graphics/Basics/mar-oma/ )

    par

---
![](http://img5.douban.com/view/photo/photo/public/p2190751648.jpg)

---

在R中，缺失值以符号NA（Not Available，不可用）表示。不可能出现的值（例如，被0除的结果）通过符号NaN（Not a Number，非数值）来表示。

na.rm=TRUE选项，可以在计算之前移除缺失值并使用剩余
值进行计算：

可以通过函数na.omit()移除所有含有缺失值的观测。na.omit()可以删除所有含有缺失数据的行。

---
![](http://img3.douban.com/view/photo/photo/public/p2190828384.jpg)

----
要横向合并两个数据框（数据集），请使用merge()函数。

---

R的日期表示方法很有意思

--------

sample()函数能够让你从数据集中（有放回或无放回地）抽取大小为n的一个随机样本。

R中拥有齐全的抽样工具，包括抽取和校正调查样本（参见sampling包）以及分析复杂调
查数据（参见survey包）的工具。

----

数据的标准化

函数scale()对矩阵或数据框的指定列进行均值为0、标准差为1的标准化：

---

![](http://img3.douban.com/view/photo/photo/public/p2190864572.jpg)

![](http://img3.douban.com/view/photo/photo/public/p2190864574.jpg)

![](http://img5.douban.com/view/photo/photo/public/p2190864576.jpg)

![](http://img5.douban.com/view/photo/photo/public/p2190864577.jpg)

![](http://img5.douban.com/view/photo/photo/public/p2190864578.jpg)

![](http://img5.douban.com/view/photo/photo/public/p2190874529.jpg)

----

regular expression（正则表达式）

---

R中提供了一个apply()函数，可将一个任意函数“应用”到矩阵、数组、数据框的任何维
度上。apply函数的使用格式为：

---

### 控制流 ###

- 语句（statement）是一条单独的R语句或一组复合语句（包含在花括号{ } 中的一组R语句，使用分号分隔）；
- 条件（cond）是一条最终被解析为真（TRUE）或假（FALSE）的表达式
- 表达式（expr）是一条数值或字符串的求值语句
- 序列（seq）是一个数值或字符串序列。

---

在处理大数据集中的行和列时，R中的循环可能比较低效费时。只要可能，最好联用R中的内建数值/字符处理函数和apply族函数。

---
[Debugging in R](http://www. stats.uwo.ca/faculty/murdoch/software/debuggingR)

---

转置（反转行和列）也许是重塑数据集的众多方法中最简单的一个了。使用函数t()即可对一个矩阵或数据框进行转置。

---

小提琴图是箱线图与核密度图的结合。

vioplot()函数要求你将要绘制的不同组分离到不同的变量中

---

若干用户贡献包都提供了计算描述性统计量的函数，其中包括Hmisc、pastecs和psych

---

![](http://img3.douban.com/view/photo/photo/public/p2190944841.jpg)

----

除了基础图形，**grid、lattice和ggplot2**软件包也提供了图形系统，它们克服了R基础图
形系统的低效性，大大扩展了R的绘图能力。

grid图形系统可以很容易控制图形基础单元，给予编程者创作图形极大的灵活性。lattice
包通过一维、二维或三维条件绘图，即所谓的栅栏（trellis）图形来对多元变量关系进行直观展
示。ggplot2包则基于一种全面的图形“语法”，提供了一种全新的图形创建方法。

---

lattice包由Deepayan Sarkar（2008）编写，可绘制Cleveland（1985，1993）所描述的栅栏
图形，具体描述可参见Trellis网站（http://netlib.bell-labs.com/cm/ms/departments/sia/project/trellis/）。
基于grid包，lattice包对多元数据的可视化功能已经远超Cleveland的原始方法，它为R提供了一种全面的、创建统计图形的备选系统。

ggplot2包由Hadley Wickham（2009a）编写，它提供了一种基于Wilkinson（2005）所描述的图形语法的图形系统，Wickham（2009b）还对该语法进行了扩展。ggplot2包的目标是提供一个全面的、基于语法的、连贯一致的图形生成系统，允许用户创建新颖的、有创新性的数据可
视化图形。






