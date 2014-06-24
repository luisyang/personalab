## 如何自学 Java ##


- 首先先搞懂JavaSE的部分

- Swing和swt部分就可以少看或不看，因为现在用的比较少。重点是看懂Java中的面向对象、集合框架、JDBC、异常、IO、线程和网络编程。

- JavaSE搞定后再学习Servlet、JSP,然后才是经典的Struts2、Hibernate和Spring，学习框架时重点理解框架的运行原理，甚至可以尝试自己写个轻量级的框架。

- 理解运行原理的最好方法就是阅读源代码，还是要感谢Java中的开源项目。这期间还要多找各种大小的项目去完成，不一定要大，但是要精致，功能要完整，这样可以练习所学知识，并且可以在做项目中发现自己的知识体系中不足的地方。
- 关于看视频，我不推荐，很多同学一天到晚就知道看视频，殊不知，编程真理在于“练习，练习，不停练习”！ 

- 再补充下：当学习Java的期间，会碰到各种各样的异常，请积累这些异常信息，以及如何出现的异常和如何处理的，因为java中常见的异常就那么几种，积累的多了，处理问题的能力就提高，这样水平会提高的很快！

---

Java平台包含的东西也挺多，先说JavaSE

1. 基础语言知识，主流语言都差不多，变量、常量、运算符、流程控制
2. 面向对象部分，继承、封装、多态
3. 集合框架
4. 常用类库API
5. JFC部分，awt Swing JavaBean
6. Java高级知识，Annotation、IO和NIO AIO、多线程、线程池、阻塞、非阻塞、异步网络通信、反     射、动态代理
7. SQL基础，基本SQL语句、基本查询、多表查询、子查询、结果集的交、并、差运算
8. JDBC基础，常见数据库用法、JDBC操作常见数据库、RowSet与离线结果集、数据库连接池、事务处理、批处理
9. JDBC进阶，存储过程、函数、触发器、理解JDBC不足、掌握ORM工具优势和设计


书籍推荐
> 
> 疯狂Java讲义
> 
> Java核心技术
> 
> Java编程思想
> 
> Effective Java
> 
> ......

学习完可以写一些小项目，比如MIS，小游戏，小型局域网聊天工具and so on

学习完JavaSE，路你自己选

---

假设你的编程经验相当少的前提下，以下建议：

1.看一遍Think in java，快速的看完，大致明白即可。

2.安装jdk，eclipse，实际做一个任务。比如说做一个简单的网站。由这样的具体任务着手，在具体的编程细节里做调研和试验，学习的效率会很高。

做一个网站太难的话，也可以从做一些没有画面的小程序开始，诸如文件读写，排序，xml解析等等。

---

以下方法适合有一定语言基础的及想学j2ee的同学：

1.看int string for if等写法及格式

2.看struts+spring+hibernate的相关知识及源码，仅仅看就行

3.搭建struts+spring+hibernate，并尝试解决其中遇到的问题

4.在自己的搭建的框架里尝试写个应用出来，比如留言板等

5.认真学习java基础部分，有类的各种操作，常用的string方法，多线程等等

6.与5同时进行，深入研究struts+spring+hibernate原理与参数配置

7.学习常用java 工具，如poi等

8.尝试学习其他框架

---

推荐资源和教学视频网站：Java知识分享网 ，从最基础的SE开始一直到JS、EE、APPLET等等全部覆盖，有很多教学视频，你可以仔细看看，个人建议路线：

Java SE

MySql

JDBC

JavaScript

Java EE（就是那四大项：Struts Hibernate Jsp Servlet）

接着就看一看示例项目。

然后你就入门了！

接下来学习安卓编程（就是Java ME），

Core

GUI

network

database

然后你就可以进入一些公司了，通过这些学习，你将会掌握Java的中级技能，要想进一步提升，就多看看文档和代码！

---


我认为java只是一个氛围，并不是一种技术工具。所以它涵盖之广，你一定要清楚明白你在用java语言干什么。java是依附职能存在的。

再回来说说java。首

先Java不只在说Java语法，而是Java相关的全套技术。
> 
> - 它包括基本语言Java、JavaScript、HTML、JSP、XML、CSS、JQuery、Extjs；
> - 开发环境JDK、JBoss、Tomcat、WebSphere、WebLogic；
> - IDE（开发平台或者插件）JBuilder、Eclipse、MyEclipse、JCreator；
> - 数据库Oracle、SQL Server、MySql；
> - 安全Acegi、CAS、jSai、kasai；
> - 项目或测试CruiseControl、JUnit、TestNG；
> - 框架及应用Java SE、Java EE、Java ME，Web开发JSP、Servlet、Applet，项目开发Spring、Hibernate、Struts、Tapestry、JSF JMX，还有一些专题框架如Ajax JNDI、JMX JMS、JDBC Jmail，JDOM SAX。
> - 这还不止，还有许多开源的，甚至商业的技术或框架。 而现在android系统以及其上的应用都可以用java来开发。

于是，你要学java只买本Thingking In Java是不够的。现在开始，决定自己要做一个web的如学生管理系统，或者android的某个应用，然后有问题了去网上问，去找你需要的素材，代码，手边要时刻准备几本工具书，比如Thingking In Java，java设计模式，java Web编程，android开发等等等等。在你不断的编码出问题解决问题再编码的过程中，你会学的很快，最好收藏几个相关技术的论坛，他们都会有qq群，随时和那些大牛们互动起来，氛围有了，你还在担心你学不会么。

---

- 用记事本写hello world，用控制台的方式运行起来。
- 随便搞一本Java入门书籍，但作者一定不要是中国人。譬如Small Java How to program。把书中的例子敲一遍，看明白
- 学会查Java api的方法
- 买本Thinking in Java，挑你感兴趣的章节读一遍，顺便写个扫雷或者坦克大战之类的程序
- 用SSH写个图书馆管理系统，不会的地方自己查文档，尽量用官网，不要买什么李刚的SSh教程。
- 买本Effective Java，挑你感兴趣的章节读一遍。
- 买本重构，挑你感兴趣的章节读一遍
- 重构图书馆管理系统
- 重读上面那三本书
- 用Java写个聊天室系统，在你的电脑上运行起来，随便找一门课程，把大作业的答案发上去，邀请在同一网段又懒得做作业的同学下载、讨论
- 用Java写个爬虫系统，去百度知道、知乎一类的网站爬跟贵专业有关的信息，存到数据库里，再用SSH做个网站发布，邀请在同一网段又懒得做作业的同学下载、讨论
- 重读上面那三本书
- 学习一下并发、事务一类的知识
- 可能的话，组个小团队，去外面接点私活，赚钱不赚钱无所谓。重点关注一下代码规范、团队合作常识
- 对于Java初学者，Thinking In Java确实是一本好书，但是一般好书往往都不是写给初学者的，虽然那么多人推荐Thinking In Java，但大多不是初学者推荐的，况且你认为初学者有分辨一本编程书好坏的能力吗？
- Thinking In Java适合写过至少1W行代码的人看。不推荐Head First Java，这本书很鸡肋，作者的本意是深入浅出，但其实是浅入深出，很多复杂的东西介绍的很简单，简单的东西又不够明白。如果你习惯看书，那么请看：《JAVA面向对象编程》(孙卫琴),《Java开发实战经典》(李兴华)，还有，《Core Java》也是好书，可以结合着看，英文不太好的就看中文吧，毕竟非一日之功。
- 如果你跟我一样习惯看视频，那么请：http://verycd.com上搜索java，上面很多，我看过圣思园和马士兵的，圣思园很细致，但有些部分讲得不形象，马士兵的很形象，但视频内容很少，不够细致，所以推荐先看一般圣思园，然后每章总结的时候看马士兵的。当然如果你有时间的话，可以结合视频和书籍一起看。最重要的事情，还是要写代码。自己想一些需求，然后试着写，遇到搞不定的去网上查解决办法。程序是写出来的，不是看出来的。

---

## 【一.Java架构师之路：JAVA程序员必看的15本书】 ##

作为Java程序员来说，最痛苦的事情莫过于可以选择的范围太广，可以读的书太多，往往容易无所适从。我想就我自己读过的技术书籍中挑选出来一些，按照学习的先后顺序，推荐给大家，特别是那些想不断提高自己技术水平的Java程序员们。

###一、Java编程入门类

　　对于没有Java编程经验的程序员要入门，随便读什么入门书籍都一样，这个阶段需要你快速的掌握Java基础语法和基本用法，宗旨就是“囫囵吞枣不求甚解”，先对Java熟悉起来再说。用很短的时间快速过一遍Java语法，连懵带猜多写写代码，要“知其然”。

####1、《Java编程思想》

下载地址：http://www.shangxueba.com/share/p2446196.html

　　在有了一定的Java编程经验之后，你需要“知其所以然”了。这个时候《Java编程思想》是一本让你知其所以然的好书，它 对于基本的面向对象知识有比较清楚的交待，对Java基本语法，基本类库有比较清楚的讲解，可以帮你打一个良好的Java编程基础。这本书的缺点是实在太 厚，也比较罗嗦，不适合现代人快节奏学习，因此看这本书要懂得取舍，不是每章每节都值得一看的，挑重点的深入看就可以了。

####2、《Agile Java》中文版

下载地址：《Agile Java》高清中文版(rar,软件开发/编程)_上学吧

　　这本书是出版社送给我的，我一拿到就束之高阁，放在书柜一页都没有翻过，但 是前两天整理书柜的时候，拿出来一翻，竟然发现这绝对是一本好书！这本书一大特点是以单元测试和TDD来贯穿全书的，在教你Java各种重要的基础知识的 过程中，潜移默化的影响你的编程思维走向敏捷，走向TDD。另外这本书成书很新，以JDK5.0的语法为基础讲解，要学习JDK5.0的新语法也不错。还 有这本书对于内容取舍也非常得当，Java语言毕竟类库庞大，可以讲的内容太多，这本书选择的内容以及内容的多寡都很得当，可以让你以最少的时间掌握 Java最重要的知识，顺便培养出来优秀的编程思路，真是一本不可多得的好书。

　　虽然作者自己把这本书定位在入门级别，但我不确定这本书用来入门是不是稍微深了点，我自己也准备有空的时候翻翻这本书，学习学习。

###二、Java编程进阶类

　　打下一个良好的Java基础，还需要更多的实践经验积累，我想没有什么捷径。有两本书值得你在编程生涯的这个阶段阅读，培养良好的编程习惯，提高你的代码质量。

1、《重构 改善既有代码的设计》

下载地址：重构——改善既有代码的设计(中文版)(pdf,计算机/IT)_上学吧
　　这本书名气很大，不用多介绍，可以在闲暇的时候多翻翻，多和自己的实践相互印证。这本书对产生影响是潜移默化的。

2、《测试驱动开发 by Example》

下载地址：吉林申论(甲级)2007年(doc,公务员考试)_上学吧

　　本书最大特点是很薄，看起来没有什么负担。可以找一个周末的下午，一边看，一边照做，一个下午就把书看完，这本书的所有例子跑完了。这本书的作用是通过实战让你培养TDD的思路。

三、Java架构师之路

　　到这个阶段，应该已经非常娴熟的运用Java编程，而且有了一个良好的编程思路和习惯了，但是可能还缺乏对应用软件整体架构的把握，现在就是迈向架构师的第一步。

1、《Expert One-on-One J2EE Design and Development》

下载地址：Expert One-on-One J2EE Design and Development(PDF,软件开发/编程)_上学吧

　　这本书是Rod Johnson的成名著作，非常经典，从这本书中的代码诞生了springframework。但是好像这本书没有中译本。

2、《Expert One-on-One J2EE Development without EJB》

下载地址：Expert One On One J2EE Development Without EJB英文下载(pdf,软件开发/编程)_上学吧

　　这本书由gigix组织翻译，多位业界专家参与，虽然署名译者是JavaEye，其实JavaEye出力不多，实在是忝居译者之名。

　　以上两本书都是Rod Johnson的经典名著，Java架构师的必读书籍。在所推荐的这些书籍当中，是看过的最仔细，最认真的书，当时读这本书几乎是废寝忘食的一气读完的， 有小时候挑灯夜读金庸武侠小说的劲头，书中所讲内容和自己的经验知识一一印证，又被无比精辟的总结出来，读完这本书以后，有种被打通经脉，功力爆增的感 觉。

　　但是后来看过一些其他人的评价，似乎阅读体验并没有那么high，也许是因为每个人的知识积累和经验不同导致的。那个时候刚好是经验知识积累已经足够丰富，但是还没有系统的整理成型，让这本书一梳理，立刻形成完整的知识体系了。

3、《企业应用架构模式》

下载地址：企业应用架构模式中文版(pdf,计算机/IT)_上学吧

Martin的又一本名著，但这本书只是泛泛的看了一遍，并没有仔细看。这本书 似乎更适合做框架的人去看，例如如果打算自己写一个ORM的话，这本书是一定要看的。但是做应用的人，不看貌似也无所谓，但是如果有空，还是推荐认真看 看，会让知道框架为什么要这样设计，这样的层次可以晋升到框架设计者的角度去思考问题。Martin的书向来都是推崇，但是从来都没有像Rod Johnson的书那样非常认真去看。

4、《敏捷软件开发原则、模式与实践》

下载地址：敏捷软件开发:原则、模式与实践(C#版)(rar,软件开发/编程)_上学吧

　　Uncle Bob的名著，敏捷的经典名著，这本书比较特别，与其说是讲软件开发过程的书，不如说讲软件架构的书，本书用了很大篇幅讲各种面向对象软件开发的各种模式，个人以为看了这本书，就不必看GoF的《设计模式》了。

四、软件开发过程

　　了解软件开发过程不单纯是提高程序员个人的良好编程习惯，也是增强团队协作的基础。

1、《UML精粹》

下载地址：UML 精華第三版(pdf,软件开发/编程)_上学吧

UML其实和软件开发过程没有什么必然联系，却是软件团队协作沟通，撰写软件文档需要的工具。但是UML真正实用的图不多，看看这本书已经足够了，完全没有必要去啃《UML用户指南》之类的东西。要提醒大家的是，这本书的中译本翻译的非常之烂，建议有条件的看英文原版。

2、《解析极限编程 拥抱变化》XP

下载地址：解析极限编程-拥抱变化(pdf,软件开发/编程)_上学吧

　　这是Kent Beck名著的第二版，中英文对照。没什么好说的，必读书籍。


3、《统一软件开发过程》UP

下载地址：统一软件开发过程(PDF,软件开发/编程)_上学吧

　　其实UP和敏捷并不一定冲突，UP也非常强调迭代，测试，但是UP强调的文档和过程驱动却是敏捷所不取的。不管怎么说，UP值得去读，毕竟在中国真正接受敏捷的企业很少，还是需要用UP来武装一下自己的，哪怕是披着UP的XP。

4、《敏捷建模》AM

下载地址：敏捷建模：极限编程和统一过程的有效实践(pdf,软件开发/编程)_上学吧

Scott Ambler的名著，这本书非常的progmatic，告诉怎么既 敏捷又UP，把敏捷和UP统一起来了，又提出了很多progmatic的建议和做法。可以把《解析极限编程拥抱变化》、《统一软件开发过程》和《敏捷建 模》这三本书放在一起读，看XP和UP的不同点，再看AM是怎么统一XP和UP的，把这三种理论融为一炉，形成自己的理论体系，那么也可以去写书了。

五、软件项目管理

　　如果突然被领导提拔为项目经理，而完全没有项目管理经验，肯定会心里没底；如果觉得自己管理项目不善，很想改善项目管理能力，那么去考PMP肯定是远水不解近渴的。

1、《快速软件开发》

下载地址：快速软件开发(pdf,软件开发/编程)_上学吧

　　这也是一本名著。可以这样说，有本书在手，就有了一个项目管理的高级参谋给 你出谋划策，再也不必担心自己不能胜任的问题了。这本书不是讲管理的理论的，在实际的项目管理中，讲这些理论是不解决问题的，这本书有点类似于“软件项目 点子大全”之类的东西，列举了种种软件项目当中面临的各种问题，以及应该如何解决问题的点子，只需要稍加变通，找方抓药就行了。

六、总结

　　在这份推荐阅读书籍的名单中，没有列举流行的软件框架类学习书籍，例如Struts，Hibernate，Spring之类，也没有列举AJAX方面的书籍。是因为这类书籍容易过时，而上述的大半书籍的生命周期都足够长，值得去购买和收藏。

## 【二.Java书籍Top 10】 ##

下面是Java Inside上推荐的十本不错的Java书籍。（文章来源）

1）Java Language Specification, Third Edition (by James Gosling)

本书由Java技术的发明者编写，是Java TM编程语言的权威性技术指南。如果你想知道语言之构造的精确含义，本书是最好的资源。

中文版链接：《Java编程规范》

英文版链接：《The Java Language Specification (3rd Edition) 》

2）Effective Java , Second Edition (by Joshua Bloch)

本书介绍了在Java编程中78条极具实用价值的经验规则，这些经验规则涵盖了大多数开发人员每天所面临的问题的解决方案。通过对Java平台设计专家所使用的技术的全面描述，揭示了应该做什么，不应该做什么才能产生清晰、健壮和高效的代码。

本书中的每条规则都以简短、独立的小文章形式出现，并通过例子代码加以进一步说明。本书内容全面，结构清晰，讲解详细。可作为技术人员的参考用书。…

中文版链接：《Effective Java 第二版》

英文版链接：《Effective Java (2nd Edition) 》

3)Java Concurrency in Practice (by Brian Goetz)

随着多核处理器的普及，使用并发成为构建高性能应用程序的关键。Java 5以及6在开发并发程序取得了显著的进步，提高了Java虚拟机的性能，提高了并发类的可伸缩性，并加入了丰富的新并发构建块。在本书中，这些便利工具的创造者不仅解释了它们究竟如何工作、如何使用，同时，还阐释了创造它们的原因，及其背后的设计模式。 本书既能够成为读者的理论支持，又可以作为构建可靠的，可伸缩的，可维护的并发程序的技术支持。本书并不仅仅提供并发API的清单及其机制，本书还提供了设计原则，模式和思想模型，使我们能够更好地构建正确的，性能良好的并发程序。

本书的读者是那些具有一定Java编程经验的程序员、希望了解Java SE 5，6在线程技术上的改进和新特性的程序员，以及Java和并发编程的爱好者。

中文版链接：《JAVA并发编程实践》

英文版链接：《Java Concurrency in Practice 》

4）Java Puzzles: Traps, Pitfalls and Corner Cases (by Joshua Bloch)

Java教父的又一经典名著–Java Puzzlers，Amazon五星图书。认为你到底有多了解Java？你是一个代码神探吗？你是否曾经花费过数天时间去追踪一个由Java或其类库的陷阱和缺陷而导致的bug？你喜欢智力测验吗？那么这本书正好适合你！

中文版链接：《JAVA解惑》

英文版链接：《Java Puzzlers : Traps, Pitfalls, and Corner Cases 》

5)Thinking in Java (by Bruce Eckel)

本书赢得了全球程序员的广泛赞誉，即使是最晦涩的概念，在Bruce Eckel的文字亲和力和小而直接的编程示例面前也会化解于无形。从Java的基础语法到最高级特性（深入的面向对象概念、多线程、自动项目构建、单元测试和调试等），本书都能逐步指导你轻松掌握。

从本书获得的各项大奖以及来自世界各地的读者评论中，不难看出这是一本经典之作。本书的作者拥有多年教学经验，对C、C++以及Java语言都有独到、深入的见解，以通俗易懂及小而直接的示例解释了一个个晦涩抽象的概念。本书共22章，包括操作符、控制执行流程、访问权限控制、复用类、多态、接口、通过异常处理错误、字符串、泛型、数组、容器深入研究、Java I/O系统、枚举类型、并发以及图形化用户界面等内容。这些丰富的内容，包含了Java语言基础语法以及高级特性，适合各个层次的Java程序员阅读，同时也是高等院校讲授面向对象程序设计语言以及Java语言的绝佳教材和参考书。

中文版链接：《JAVA编程思想(第4版)》

英文版链接：《Thinking in Java (4th Edition) 》

6)Better, faster, lighter Java (by Justin Gehtland, Bruce A. Tate)

Java的开发者正深陷于复杂性的泥沼中而无法自拔。我们的经验和能力正接近极限，程序员为了编写支持所选框架的程序所花的时间比解决真正问题的时间要多得多。我们不禁要问，有必要把Java搞得这么复杂吗?.

答案是否定的。本书给你指引了一条出路。无论是维护应用程序，还是从头开始设计，你都能够超越成规，并大幅精简基本框架、开发过程和最终代码。你能重新掌握一度失控的J2EE应用程序。..

在本书中，原作者Bruce A．Tate与Justin Gehtland将循序渐进、娓娓道来。首先，他们列出了五项基本法则。他们展示了如何构建简单、解耦的代码，并告诉你如何选择技术。他们还对两种被广泛运用的开源程序如何迎合这些概念进行了剖析。最后，作者还将利用这些基本概念构建一个简单但内涵丰富的应用程序来解决现实世界中所遇到的问题。

中文版链接：《轻快的JAVA》

英文版链接：《Better, Faster, Lighter Java 》

7)Core Java (vol. 1, 2) (by Cay S. Horstmann, Gary Cornell)

《Java核心技术》出版以来一直畅销不衰，深受读者青睐，每个新版本都尽可能快地跟上Java开发工具箱发展的步伐，而且每一版都重新改写了部分内容，以便适应Java的最新特性。本版也不例外，它反映了Java SE 6的新特性。全书共14章，包括Java基本的程序结构、对象与类、继承、接口与内部类、图形程序设计、事件处理、Swing用户界面组件、部署应用程序和Applet、异常日志断言和调试、泛型程序设计、集合以及多线程等内容。.
全书对Java技术的阐述精确到位，叙述方式深入浅出，并包含大量示例，从而帮助读者充分理解Java语言以及Java类库的相关特性。

中文版链接：《JAVA核心技术，卷1，卷2》

英文版链接：《Core Java, Volume I–Fundamentals (8th Edition) ，Core Java, Vol. 2: Advanced Features, 8th Edition 》

8） The Java Virtual Machine Specification (by Tim Linholm, Frank Yellin)

如果你需要了解Java虚拟机的byte code，或者是一些编译方面的东西，这本书绝对让你得偿所愿。其不但包含了机器码的规范说明，同时它也是Java编译器和运行环境的规格说明书。

中文版链接：《无》

英文版链接：《The Java Virtual Machine Specification (2nd Edition) 》

9）Robust Java: Exception Handling, Testing, and Debugging (by Stephen Stelting)

处理异常涉及开发、设计和体系结构等方面的知识。本书共分3个部分。

　　第Ⅰ部分介绍Java异常的产生机理和用法，介绍一些最佳实践，讲述各类异常处理使用的一般API和技术。

　　第Ⅱ部分阐述可测试性设计，介绍故障模式分析，讨论常见API的异常及起因，分析J2EE体系结构和分布式API的异常模式。

　　第Ⅲ部分讨论在软件开发周期执行异常和错误处理，分析软件体系结构、设计模式、测试和调试，列举成熟的设计模式，介绍处理策略对系统体系结构的影响，讲述如何构建健壮系统。

中文版链接：《ROBUST JAVA中文版–JAVA异常处理、测试与调试》

英文版链接：《Robust Java Exception Handling,Testing and Debugging 》

10）Java Code Convention

最后一本当然是Java编码规范，这是由Sun公司官方出品的。这也是每个程序员为了得供程序的易读性，可维护性需要知道的。

Oracle Technology Network for Java Developers

## 【三.Java 专业人士必备的书籍】 ##

每个程序员都会有一些由于经常被当作专业资料参阅而磨坏的书。下列书籍应该是 Java 语言程序员的书架上必备的。书很贵，所以我有意将这份列表弄得很短，仅限于重要书籍。

---

Thinking in Java (Bruce Eckel)

Thinking in Java, 3rd edition （Bruce Eckel; Prentice Hall PTR，2002 年）

Java 编程思想：第3版 （陈昊鹏 等译; 机械工业出版社，2005 年）

Eckel 的书对于学习如何在 Java 语言环境中使用好面向对象技术极其实用。书中大量的代码样例解释了他所介绍的概念。文字出自一个并不认为 Java 技术总是正确答案的人，所以相当地实用。Eckel 具有多种语言的大量经验，还有用面向对象方式进行思考的扎实技能。本书将这些技能放到实用的 Java 语言环境中。他还在写一本新书，名为 Thinking in Enterprise Java。

---

Effective Java (Joshua Bloch)

Effective Java: Programming Language Guide（Joshua Bloch; Addison-Wesley，2001 年）

Effective Java 中文版 （潘爱民 译; 机械工业出版社，2003 年）

本书是理解优秀 Java 程序设计原则的最佳书籍。大多数材料从其他的 “学习 Java ” 的书中根本找不到。例如，Bloch 书中关于覆盖equals() 这一章是我读过的最好的参考资料之一。他也在书中包括了很实用的建议：用接口替代抽象类和灵活使用异常。Bloch 是 Sun 公司 Java 平台库的架构师，所以他透彻地了解这门语言。事实上，他编写了该语言中大量有用的库。本书必读！

---

The Java Programming Language (Ken Arnold, James Gosling, David Holmes)

The Java Programming Language（Ken Arnold，James Gosling，David Holmes; Addison-Wesley，2000 年）

Java 编程语言（第 3 版） （虞万荣 等译，中国电力出版社，2003 年）
这也许是能弄到的最好的 Java 入门读物。它并不是一个标准规范，而是一本介绍每门语言特性的可读书籍。这本书在严谨性和教育性方面权衡得很好，能够让懂编程的人迅速被 Java 语言（和其丰富的类库）所吸引。

---

Concurrent Programming in Java: Design Principles and Patterns (Doug Lea)

Concurrent Programming in Java: Design Principles and Patterns, 2nd edition（Doug Lea; Addison-Wesley，1999 年）
Java 并发编程—设计原则与模式（第二版） （赵涌 等译，中国电力出版社，2004 年）

不是每个开发人员都需要如此细致地了解并发性，也不是每个工程师都能达到本书的水准，但却没有比本书更好的关于并发性编程的概述了。如果您对此感兴趣，请从这里开始。Lea 是 SUNY 的一名专业程序员，他的和并发性有关的作品和想法都包含在了 JDK 5.0 规范（引自 JSR166）中，所以您大可放心，他所说的关于有效使用 Java 语言的建议是值得一听的。他是一个很善于沟通的人。

---

Expert One-On-One J2EE Design and Development (Rod Johnson)

Expert One-On-One J2EE Design and Development（Rod Johnson）

WROX: J2EE 设计开发编程指南 （魏海萍 译，电子工业出版社，2003 年）

对于刚接触 J2EE 的人来说，这是唯一的一本如实反映这项技术的书。本书收录了多年的成功经验和失败经验，不同于其他许多作者，Johnson 乐于将失败的经验公诸于众。J2EE 常常都被过度使用。Johnson 的书能帮您避免这一点。

---

Refactoring (Martin Fowler, Kent Beck, John Brant, William Opdyke, Don Roberts)

Refactoring: Improving the Design of Existing Code（Martin Fowler，Kent Beck，John Brant，William Opdyke，Don Roberts; Addison-Wesley，1999 年）

重构：改善既有代码的设计（中文版） （侯捷 等译，中国电力出版社 ，2003 年）

Fowler 写了几本现已出版的最流行的编程书，包括 Analysis Patterns。他的关于重构 的书是这一主题的基本书籍。重构代码是被程序员忽略的训练，但却是程序员最直观的想法。重构是在不改变代码结果的前提下改进现有代码的设计。这是保持代码整洁的最佳方式，用这种方法设计的代码总是很容易修改。什么时候进行重构呢？当代码“散发出味道”时。Fowler 的书里满是 Java 语言代码的例子。许多 Java 语言集成开发环境（IDE）（包括了 IBM 的 Eclipse）都将 Fowler 的重构包含了进去，每一个都使用他的重构名命名，所以熟悉如extract method 等重构方法还是很值得的。

---

Design Patterns (Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides)

Design Patterns: Elements of Reusable Object Oriented Software（Erich Gamma，Richard Helm，Ralph Johnson，John Vlissides; Addison-Wesley，1997 年）

设计模式：可复用面向对象软件的基础 （李英军 等译，机械工业出版社 ，2005 年）

这是一本在专业程序员圈子里更为有名的书，基于作者共同的绰号，这本书被认为是 “四人帮（GOF）之书”。模式是思考和解决普通编程问题时可以重用的方式。学习模式是一门学科。使用好模式（或知道什么时候不 使用模式）是一项技能。忽略模式则是错误的。书中所有的例子都以 C++ 表示，但 Java 语言是从那里诞生的，让 Java 语言程序员由此联系到如何在 Java 语言中实现这些模式相对简单一些。熟悉模式并了解如何使用好模式使编程更加简单。这使得和其他程序员交流也更简单，因为在针对通用问题的通用解决方案中，模式是描述解决方案中彼此协作的大量相关编程概念的快捷方式。一些更为通用的方式，如工厂方法 则是普便存在的，甚至存在于 Java 语言本身。关于明智使用模式的这个主题，也可以阅读 Joshua Kerievsky 的 Refactoring to Patterns，该书称可以让代码来告诉您何时实现模式。

---

Patterns of Enterprise Application Architecture (Martin Fowler)

Patterns of Enterprise Application Architecture（Martin Fowler; Addison-Wesley，2002 年）


企业应用架构模式 （王怀民 等译，机械工业出版社 ，2004 年）

比起小型、一次性项目来说，企业开发当然代表了更大的挑战。那并不意味着企业开发带来的所有挑战都是新挑战。事实上有些时候，这项开发已经 是以前完成过的了。Fowler 做了很多个这样的项目。他的书提到了一些通用解决方案，并提供了关于使用、折中和可选方案的指导。Fowler 在书中包含了一些熟悉的模式，如模型视图控制器（MVC），他也提供了一些您也许不了解的模式，如处理 Web 站点上特定页面请求或行为请求的 Page 
Controller 模式。正如您对待大多数模式一样，一旦您读过许多模式，您就会认为 “我已经知道那个模式了” 。也许是这样，但有一个用来引用模式的通用表达方式还是很有帮助的。在有多个组件（由不同人开发）的大型项目中，该类引用是一项很好的帮助。

---

UML Distilled (Martin Fowler)

UML Distilled: A Brief Guide to the Standard Object 

Modeling Language（Martin Fowler; Addison-Wesley 2003 年）

UML精粹：标准对象语言简明指南（第3版） （徐家福 译，清华大学出版社 ，2005 年）

对于专业的程序员来说，UML 是一门很重要的通用可视化沟通语言，但是它被过度使用和草率地滥用了。您无需对使用 UML 沟通了解太多。Martin 对 UML 的提炼为您提供了最核心的东西。事实上，前后的封页提供了常规基础上可能使用到的所有东西。该书中 UML 例子的代码都是 Java 代码。

---

Test-Driven Development: By Example (Kent Beck)

Test-Driven Development: By Example（Kent Beck; Addison-Wesley 2002 年）

测试驱动开发（中文版） （崔凯 译，中国电力出版社 ，2004 年）

测试优先编程将使编程发生革命性变化，能助您成为更好的程序员。在写代码之前编写测试开始很难，但却是一项威力强大的技能。通过优先编写测试，可使代码更加简单，并确保从一开始它就能工作（Beck 实践着他提倡的测试优先，与人合写了 JUnit，这是 Java 语言最流行的测试框架）。Beck 的书是权威的参考资料，扩展了的 Money 例子也用 Java 语言写成。Beck 详述了如何用测试优先进行思考（这也许是许多程序员首先遇到的障碍）。

---
The Pragmatic Programmer: From Journeyman to Master (Andy Hunt and Dave Thomas)

The Pragmatic Programmer: From Journeyman to Master（Andrew Hunt 和 David Thomas; Addison-Wesley 1999 年）

程序员修炼之道——从小工到专家 （马维达 译，电子工业出版社 ，2004 年）

做一个纯粹的面向对象开发人员有其优势所在。在当今复杂的社会中，作为 Java 语言开发人员，为完成任务常要妥协。Hunt 和 Thomas 探讨了如何不将真正重要的东西妥协掉而完成任务。这不是一本关于 Java 语言的书，而是 Java 语言开发人员重要的思想读物。例如，我认为没从“要解决问题，而不是推卸责任”这句忠言中受益的程序员，不能像个自豪的艺术家一样在他的杰作上签上大名。

Peopleware: Productive Projects and Teams (Tom DeMarco and Timothy Lister)

Peopleware: Productive Projects and Teams（Tom DeMarco，Timothy Lister; Dorset House，1999 年）

人件（第2版） （UMLChina 翻译组 译，清华大学出版社 ，2003 年）

这份列表中的其他所有书籍都至少和技术有些相关。这本书却不是。在所有技术行话和首字母缩略词的海洋中，有时软件开发人员和经理们会忘记：是人 制造了软件。DeMarco 和 Lister 向我们提醒了这一事实，也向我们提醒了形成这一区别的原因。这不是一本关于一门特定编程语言的书籍，但却是每个 Java 语言程序员都应该读的书。关于 “累死程序员如何让经理们适得其反” 还有许多其他的好书，但这是最好的一本。


## 【四.推荐给初级Java程序员的3本进阶书 】 ##


原作者在这篇文章中介绍3本不错的技术书籍。作者认为这些书籍对新手或者学生而言尤其有帮助。通过一些基础性的教程入门后，我们可以使用Java做基础性的编程。然而，当我们需要从初级提升更高的一个层次时，大多数的人却不知道从何入手。一些好的书籍在这个阶段可以很好地帮助初级开发人员。

---
《Head First设计模式》

这本书介绍 GoF 常用设计模式的方式引人入胜。如果只看封面很难看出来这是一本技术书籍，更不用说这本技术书籍介绍的还是面向对象编程的一些很有用的技巧。这本书采用 Kathy Sierra 式编写风格：虽然她的博客已经关了，但是还是能从前面这个链接看到一些她的文章，建议读一读。如果你周围有人认为设计模式没有什么用处，这本书倒是能够让他们改变看法。个人而言，我认为经典的 GoF 手册是一个很好的参考，但它并不是专为新手准备的。因此强烈推荐在校生（包括那些不清楚组合模式是什么的程序员们）阅读此书。

书中介绍的设计模式是程序开发中比较基本的编程模式，也是面向对象编程的程序员应该了解和掌握的。接下来要介绍的这本书则更偏向于Java语言本身，这也是我日常使用的编程语言。

---

《Effective Java中文版》第二版

每个Java程序员的书桌上都应该放有这本书。让我们先了解下作者：

Joshua Bloch是Google公司的首席Java设计师，并且也是一位Jolt 奖获得者。他之前是Sun的一位杰出工程师（distinguished engineer），也是Transarc公司的一个资深系统设计师。Bloch主导了众多基于Java平台的软件系统的设计和实现，包括JDK5.0的功能加强以及获得过奖项的Java集合框架的设计实现。他同时也参与编写了《Java解惑 | Java Puzzlers》 和《Java并发编程实战 | Java Concurrency in Practice》这两本技术书。

就凭“Java集合框架开发者”这个称号，我们就应该认真听取这位值得尊敬的程序员的建议。这些建议在这本书中组织成78个点：读者可以按照自己的速度进行阅读。

在复写equals和hashcode方法时，我们应该遵循什么规则？

不可变类（immutable class）是什么？

在特定的情况下，应当选用哪种最相关的异常类型?运行时异常（Runtime exception）还是可捕获异常（checked exception）？

对于一个托管语言（managed language，详细请参考 wiki介绍），如何在混淆编译时保留（preserve）类的成员？

上面所有的问题（也包括其他74个）都有实用主义者Joshua Bloch的详细解释。读完这本书，程序员应该能意识到使用Findbugs、Checkstyle这些工具的必要性了。

---

《Java并发编程实战》

一年前我正努力在做 UI 开发工作时（在Eclipse 插件中使用SWT/JFace，其他一些项目则使用Swing ），就看了这本书。那时，我想了解如何实现一个快速响应的UI，从而能给用户更好的使用体验。我知道自己写线程安全的代码是非常复杂的，尽管运行时间长的操作通常是一个独立的线程。UI开发和多核系统应用开发是学习如何开发线程安全的软件系统的一个很好的理由。

这本书的作者如下：Brian Goetz，Joshua Bloch（又出现这位大牛了，我们刚提到过，还记得吗？）， Doug Lea（java.util.concurrent包的开发者）， David Holmes，Tim Peierls 和Joseph Bowbeer。

这本书的风格非常直接，有的代码在非线程安全的环境下表现不错，可一旦到了线程安全的环境下就变得十分的危险。接着，这本书介绍了基本的保证线程安全的机制：同步机制，volatile关键字等。本书还有对java.util.concurrent接口的介绍，你可以根据自己的需要来选择适合的并发集合类。这本书也介绍了程序运行时的错误管理，以及如何测试代码是否是线程安全的。而且书中还提供了说明性的注释（Annotation）（下载），这些注释通过了FindBugs的检查！


