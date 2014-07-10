
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





