#GIT 笔记

###1. 每次请记住设置文件路径

>cd XXXpath

习惯了WINDOWS的桌面操作，在使用GIT 和 MAC操作系统时才发现，DOS型的命令式操作的用途没有因为WINDOWS的推广而消亡，相反，还有大批量的操作使用命令式语句。

>cd ..

来返回上一级目录。

###2. 初始化一个Git仓库，使用

>git init命令


每次修改，如果不add到暂存区，那就不会加入到commit中。

###3. .gitignore文件
>.gitignore顾名思义就是告诉git需要忽略的文件，这是一个很重要并且很实用的文件。一般我们写完代码后会执行编译、调试等操作，这期间会产生很多中间文件和可执行文件，这些都不是代码文件，是不需要git来管理的。我们在git status的时候会看到很多这样的文件，如果用git add -A来添加的话会把他们都加进去，而手动一个个添加的话也太麻烦了。这时我们就需要.gitignore了。比如一般c#的项目我的.gitignore是这样写的：

>bin

>*.suo

>obj

>bin和obj是编译目录，里面都不是源代码，忽略；suo文件是vs2010的配置文件，不需要。这样你在git status的时候就只会看到源代码文件了，就可以放心的git add -A了。

---
在实际项目中，有些文件不需要使用git进行管理，比如:.pyc文件，.class文件，.o文件，.swp文件的等，我们可以在项目根目录下创建一个名为 .gitignore的文件，列出要忽略的文件。git默认会读取项目目录下的.gitignore文件（跟.git同目录）
1
vim .gitignore
###git进行管理时，忽略以下文件
c/file_operator/*.swp
*.o
所有空行或者以注释符号 # 开头的行都会被 Git 忽略，以上设置忽略所有.o文件，同时忽略c/file_operator/目录下的所有.swp文件
另外，还可以在配置项中通过core.excludesfile来指定ignore文件。
1
2
3
git config --system core.excludesfile ~/.gitignore_system
git config --global core.excludesfile ~/.gitignore_global
git config core.excludesfile .gitignore_local

注意：
git config –system 设置系统配置

git config –global 设置用户配置

git config  设置项目配置

###4. tag文件

待补充

###5. checkout fetch

待补充

###6.取消跟踪文件

与跟踪文件相反，取消跟踪就是把该文件或目录从暂存区（stage）移除
>git rm --cached  c/file_operator/.file_cp.c.swp

ps：此时.file_cp.c.swp文件已经从暂存区域删除，但是仍在当前目录下，如果想把该文件也从工作目录中删除，执行
>git rm c/file_operator/.file_cp.c.swp
>
>git status

可以看到 c/file_operatorrator/.file_cp.c.swp 已经不在stage区了。可以通过git add重新添加到stage区


 git commit 加上-a 选项，Git 就会自动把所有已经跟踪过的文件暂存起来一并提交，从而跳过 git add 步骤：git commit -a -m ‘xxxx’