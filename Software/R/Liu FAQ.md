## Liu-FAQ ##

---

R与统计学的一些资源

[R官网](http://cran.r-project.org/other-docs.html )

[R文档（中文版）](http://www.biosino.org/R/R-doc/)

[统计之都](http://cos.name/)

---

CRAN 是 C omprehensive R Archive N etwork 的简写，顾名思义：是拥有同一资料，包括R 的发布版本，包，文档和源代码的网络集合

---
R-intro 确实是官方文档中最基础的，但它不是从 R 软件应用角度讲的，故并不适合于 R 初学者。可以参考 R-intro 中数据类型、结构部分，作为基础学习。

---
在 R 中，大部分包的作者都是以英文为母语的，不会对中文字符考虑太多，`故建议使用全英文环境`。但在绘图时，可能会遇到中文支持问题，这时候需要设置 par 中的 family 参数

---
一般来说，R 本地的目录结构相对固定，可以通过在其他目录下安装 R ，再将旧版本保留的 library 目录下的文件拷贝至新版本 library 目录下或卸载 R ，把 R 装到旧的目录下，最后使
用如下命令更新：

    update.packages(checkBuilt = TRUE, ask = FALSE)

or `install.packages (.packages (all = TRUE) )`

可以考虑用云来管理package

---
![](http://img5.douban.com/view/photo/photo/public/p2190153226.jpg)

---

![](http://img5.douban.com/view/photo/photo/public/p2190153667.jpg)



---

如何得到函数的代码？
    
    dist

    summary # a generic function

	methods(summary)

	summary.lm # the linear model's summary

---

输入输出

使用
**Foreign**包，它可以读取 Minitab, S, SAS, SPSS, Stata, Systat, dBase 保存的数据。

或者使用 **Hmisc**包中 sas.get, spss.get 函数来获取 SAS 和 SPSS 软件格式数据。

但随着这些商业软件的版本更新，依旧会出现一些文件不能通过 foreign 包读取的情况，建议在交换数据时尽量使用.csv 这种通用格式。

---

**注意包安装的路径**

---

读取 Excel 文件

1. 将 Excel 另存为 csv(Comma Separated Values) 文件，使用 read.csv() 函数读取（推荐）；
2. 加载 RODBC 包，使用 odbcConnectExcel() 函数读取 xls 文件，
3.  xlsReadWrite 包中的 read.xls函数。

---

R 可以直接从数据库读取数据

可以，并且还可以通过 SQL 语句对数据库进行操作。R 对于基于 SQL 语言的关系型数据库有良好的支持，这些数据库既有商业数据库 Oracle、Microsoft SQL Server、IBM DB2 等，也包含在GNU General Public License (GPL) 下发布的 MySQL 等开源数据库。

`RMySQL（未安装成功）`包中提供了到 MySQL 数据库的接口；`RODBC `包提供了更为广泛数据库接口的解决方案 — 支持所有标准 ODBC 接口的数据库。

---

unique 函数可以去掉向量、数据框或类似数列的数据中重复的元素。

---

一组数中随机抽取数据

函数 sample()

![](http://img3.douban.com/view/photo/photo/public/p2190164063.jpg)

---

根据共有的列将两个数据框合并

merge(x, y ,by.x = ,by.y = ,all = ) 函数。

如果你对 SQL 语言非常熟悉，还可以使用 sqldf 包来进行数据框合并，这个包可以让用户在 R 环境下使用标准 SQL 语言进行数据的预处理：

---

如何将数据标准化？

参考 scale 函数

---

R 对大小写是敏感的

可以使用 tolower() 、toupper() 、casefold() 这类的函数对字符进行转化。


---

![](http://img3.douban.com/view/photo/photo/public/p2190179134.jpg)

---

如何在同一画面画出多张图

• 修改绘图参数，如 par(mfrow = c(2,2)) 或 par(mfcol = c(2,2))；

• 更为强大功能的 layout函数，它可以设置图形绘制顺序和图形大小；

• split.screen()函数。

---

如何做线性回归模型

lm() 函数提供了线性回归的计算方法。

如果处理数据的量很大，可以使用 biglm 包中的 biglm() 函数。这个函数可以用于 “海量”数据的回归模拟


---

使用逐步回归

在 R 里，可以使用计算逐步回归的 step()函数。它以计算 AIC 信息统计量为准则，选取最小的 AIC 信息统计量来达到逐步回归的目的。

---

- 聚类分析
- 主成分分析
- 因子分析
- 正态分布检验
- 配对t检验
- 多项式回归
- 方差分析（ANOVA）
- 回归参数的置信区间
- 岭回归
- logistic回归
- 相关分析








---
![](http://img3.douban.com/view/photo/photo/public/p2190186315.jpg)

---
R 有类似于 SPSS 的界面

安装包 Rcmdr 

    Commander ( )

用于数据挖掘的界面环境` rattle`

---

在 R 中如何处理地图数据

R 提供了 maps 和 mapdata 两个包来绘制地图，其中 mapdata 提供了中国地图的相关信息：

不过如果你熟悉地理数据，那么 maptools 包将是一个不错的选择。她可以读取、处理空间对象，且提供了同 PBSmapping, spatstat, maps, RArcInfo, Stata tmap, WinBUGS, Mondrian
这类包的封装接口。









