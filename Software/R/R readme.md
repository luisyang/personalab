[对于没有编程经验的人，R 语言是否很难掌握？](http://www.zhihu.com/question/23686835)

与其把R简单地看作一个「统计软件」，
    
> 不如说R除了是一个统计软件，即统计计算环境之外，而是一门设计完善的编程语言，更加是一个快速成长的社区，是能够将非IT领域的前沿知识（例如最新的统计工具）快速转化为生产力的生态系统。

在学习中最基本的就是掌握R作为编程语言的语法规则（syntax），之后就是通过学习和各种项目积累处理各种数据的手法、流行扩展包的使用技巧等等，在此过程中参与到社区当中去，去看大家在Stackoverflow: R Questions中的问答，参与到GitHub中托管的上千个R扩展包的issue report和改进中，在这个过程中你学到的R才是有灵魂的，才是与时俱进的；如果只是自己看教程，不实战、不参与社区互动，那么你学系到的R就是死的，没有灵魂，不会更新，很快就将被你的大脑清除出去。

[http://renkun.me/learnR/](http://renkun.me/learnR/)


    学习R的前期难度是一般的语法规则，这并不太难，到后期真正比较难的是背后的理论知识。

    R是一套主要致力于统计计算、数据探索、数据分析、数据可视化的一个编程语言、计算环境、社区以及生态系统。

    学习Excel，建议先熟悉基本函数，数据透视表，再VBA，规划求解，等等

---

1.学计算机的目的是什么？

楼上说什么让从C语言学起的，你们是认真的吗？。。。你们的C语言都过关吗？拿C写个能跑的快排给姐看看！

lz的目的很明确，就是一学金融的，要读研究生，学计算机是有非常强的针对性的，说从C语言学起从算法导论学起，这种说法完全是不负责任的也是不合适的。

在我看来作为一个金融的学生，在研究和工作中，计算机主要帮助我们达到以下目的：
a. 写文字性的论文和报告
b. 统计分析数据

说什么编程自己写交易系统那都是IT干的事儿，国内基本没有干的，国内交易系统基本都是从国外买的，自己开发的也就是里面的模型，要说让学金融的写软件，你让学计算机的拿什么混饭吃，修电脑么？

2.为了达到以上目的，需要怎么学习计算机？

a. 为了满足写论文写报告的要求，那基本上可以分成两类：文字处理和图形处理。

文字处理：

基础：word, ppt --> 进阶：latex
word方面，lz写个毕业论文之后，基本该会用的就都会了；ppt一般公司有自己的模板，基本功能会了就可以了，设计方面不能强求，多看看好的ppt自然就慢慢悟了。
一般发表在外刊上的文章会要求用latex作为格式编辑，本质上是一种功能性的编程语言，有模板可套，自己改改就会了。

图形处理：


美图秀秀足以解决ppt里80%的图片修整问题。Visio能解决流程图的问题，是公司里画流程图十分常用的软件，这个软件非常简单，一用就会。。

b. 为了统计分析数据，需要的软件和技能就有点多，从基础到高深一个一个说。

基础：Excel -->进阶：Excel VBA, Stata, Access -->高级：SAS, R, matlab

Excel其实没什么，说什么投行男投行女excel用的有多溜，那就是“我亦无他，惟手熟耳”，常用的几个函数无非就是vlookup,sumifs再就是数据透视表。回归什么的就用linest，一般OLS就足以糊弄客户了。工作之后最常用的就是Excel，投行那边估值的模型一般也是用Excel做的。这方面可以看一下估值建模那本考试教材，那本书别的都没用，就怎么拿excel搭模型最有用：估值建模（实用投融资分析师考试教材）.pdf_免费高速下载

但是这是简单的应用而已，如果想用点儿高级的，就得扯上VBA了。比如说我要根据我后台的数据库自动生成订单派送报告，或者根据数据自动生成并调整多个图表。对，lz，就是把你弄得焦头烂额的这玩意儿，其实非常有用。


Access就是纯粹的数据库了，应用不多，但是也有人在用，主要优点是允许多人编辑。

Stata和SAS是做学术研究的两大神器，左手横截面右手时间序列，双剑合璧一统江湖。。但是SAS这玩意儿的语言实在是太繁琐了……干个小事儿就整出去半页的程序……matlab的语言就聪明多了。

3.皮埃斯：如何有效学习编程语言


其实学金融的和学计算机的一大不同就在于，在编程语言这件事情上，计算机的同学们学的是算法，是解决问题的方法；学金融的同学们呢，我们学的是命令。

还是拿快排举例，区别在于计算机的同学们需要明白快排算法的原理是啥，学金融的同学们只要知道qsort函数就可以了。

基于此，我推荐的方法就是抄代码，把书上的或者你在哪个旮旯搜到的代码拿到相应的环境去跑一遍，改几个参数，看看会出现什么结果。再读一读代码，只要你懂语法，一般都可以明白大概是怎么回事儿，下回再有这样事儿知道上哪儿找代码就行了。

学金融的童鞋们，我们的优势在于我们对于金融理论的知识，对于市场的了解，也就是说我们的优势在理论研究在估值建模，不在明白快排的原理是啥不在明白啥是动态规划不在会java/php or whatever language


计算机只是一个工具，不要舍本逐末。