
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













