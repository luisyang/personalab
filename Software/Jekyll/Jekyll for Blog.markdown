##[Jekyll-Bootstrap](http://jekyllbootstrap.com/usage/jekyll-quick-start.html)

##[jekyllrb](http://jekyllrb.com/docs/variables/)


##[minix](http://blog.csdn.net/on_1y/article/details/19259435)

1. 找一份框架，修改后使用
2. 从GitHub上fork别人的博客代码，在其中添加自己的文章


你在 GitHub 上有一个账号，名为username(任意)， 有一个项目，名为 username.github.io(固定格式，username与账号名一致)， 项目分支名为 master(固定)，这个分支有着类似下面的 目录结构:
.
    
    ├── index.html
    ├── _config.yml
    ├── assets
    │   ├── blog-images
    │   ├── css
    │   ├── fonts
    │   ├── images
    │   └── javascripts
    ├── _includes
    ├── _layouts
    ├── _plugins
    ├── _posts
    └── _site

Jekyll 提供了插件功能，在网站源代码目录下，有一个名为 _plugins的目录， 你可以将一些插件放进去，这样，Jekyll在解析网站源代码时，就会运行你的插件。

---
如果你需要使用插件，那么需要维护两个分支，一个是网站的源代码分支，另一个 是 Jeklly 解析源代码后生成的静态网站。

例如，我的源代码分支名为 master，静态网站分支名为 gh-pages。平时写博客时， 首先在 master 分支下，添加新文章，然后本地使用 jekyll build 将添加文章后的网站 解析一次，这时 _site 目录下就有新网站的静态代码了。然后把这个目录下的所有内容 复制到 gh-pages 分支下。这个过程，可以写一个 Makefile，每次添加文章后 make 一下， 就自动将文章发布到 GitHub 上。

Makefile 内容如下：

    deploy:

    git checkout master
    git add -A
    git commit -m "deploy blog"
    cp -r _site/ /tmp/
    git checkout gh-pages
    rm -r ./*
    cp -r /tmp/_site/* ./
    git add -A
    git commit -m "deploy blog"
    git push origin gh-pages
    git checkout master
    echo "deploy succeed"
下面的内容涉及源代码，如果需要进一步学习，或者有问题，可以在 Jeklly 官网上找到更详细的解释，或者在评论中留言。

##源代码解析
    
    ├── index.html
    ├── _config.yml
    ├── assets
    │   ├── blog-images
    │   ├── css
    │   ├── fonts
    │   ├── images
    │   └── javascripts
    ├── _includes
    ├── _layouts
    ├── _plugins
    ├── _posts
    └── _site

_config.yml

这是针对 Jekyll 的配置文件， 决定了 Jekyll 如何解析网站的源代码,下面是一个示例：

    baseurl: /StrayBirds
    markdown: redcarpet
    safe: false
    pygments: true
    excerpt_separator: "\n\n\n"
    paginate: 5

我的网站建立在 StrayBirds 项目中，所以 baseurl 设置成 StrayBirds

我的文章采用 Markdown 格式写成，可以指定 Markdown 的解析器 redcarpet

另外，安全模式需要关闭，以便 Jekyll 解析时会运行插件

pygments 可以使得Jekyll解析文章中源代码时加入特殊标记，例如指定代码类型， 这可以被很多 javascript 代码高度库使用 

excerpt_separator 指定了一个摘要分割符号，这样 Jekyll 可以在解析文章时， 将文章的提要提取出来。 

paginate 指定了一页有几篇文章，页数太多时，我们可以将文章列表分页，我们在 后文还会提到。

---
_layouts

这个目录存放着一些网页模板文件，为网站所有网页提供一个基本模板，这样 每个网页只需要关心自己的内容就好，其它的都由模板决定。例如，这个目录下的 default.html 文件：
    
    {% raw %}
    <!DOCTYPE html>
    <html>
      <head>
        <meta charset='utf-8'>
        <title>{{ page.title }}</title>
      </head>
      <body>
        <header>
        </header>

        <aside>
        </aside>

        <article>
    {{ content }}
        </article>

        <footer>
        </footer>
      </body>
    </html>
    {% endraw %}
    
可以看出，这个文件就是所有页面共有的东西，每个页面的具体内容会被填充在 {{ content }} 中，注意这个 content 两边的标记，这是一种叫 liquid 的标记语言。 另外，还有那个 {{ page.title }} ，其中 page 表示引用 default.html的 那个页面，这个页面的 title 值会在 page 相应页面中被设置，例如 下面的 index.html 文件，开头部分就设置了 title值。

index.html
这是网站的首页，访问 http://username.github.io 时，会指向 http://username.github.io/index.html，我们看一下基本内容：

    ---
    layout: default
    title: 首页
    ---
    
    {% raw %}
    <ul class="post-list">
        {% for post in site.posts %}
            <a href="{{site.baseurl}}{{post.url}}"> {{ post.title }}  </a> <br>
            {{ post.date | date: "%F" }} <br>
            {{ post.category }} <br>
            {{ post.excerpt }} 
        {% endfor %}
    {% endraw %}
    </ul>

文件开头的描述，我们称之为 front-matter， 是对当前文件的一种描述，这里 设置的变量可以在解析时被引用，例如这里的 layout就会告诉 Jekyll, 生成 index.html 文件时，去 _layouts 目录下找 default.html 文件，然后把当前文件解析后，添加到 default.html 的 content 部分，组成最终的 index.html 文件。还有title 设置好的 值，会在 default.html 中通过 page.title 被引用。

文件的主体部分遍历了站点的所有文章，并将他们显示出来，这些语法都是 liquid 语法， 其中的变量，例如 site, 由 Jekyll 设置我们只需要引用就可以了。而 post 中的变量， 如 post.title, post.category 是由 post 文件中的 front-matter 决定，后面马上就会看到。

---
_posts

这个目录存放我们的所有博客文章，他们的名字有统一的格式：

YEAR-MONTH-DAY-title.MARKUP
例如，2014-02-15-github-jeklly.md，这个文件名会被解析，前面的 index.html 中， post.date 的值就由这里文件名中的日期而来。下面，我们看看一篇文章的内容示例：

    ---
    layout: default
    title: 使用 Markdown
    category: 工具
    comments: true
    ---
    
    # 为什么使用 Markdown
    
    * 看上去不错  
    * 既然看上去不错，为什么不试试呢  
    
    
    # 如何使用 Markdown
可以看出，文章的 front-matter 部分设置了多项值，以后可以通过类似 post.title, post.category 的方式引用这些些，另外，layout部分的值和之前解释的一样， 文件的内容会被填充到 _layouts/default.html 文件的 content 变量中。

另外，文章中 
> 为什么不试试呢

之后的有三个不可见的 \n，它决定了这三个 \n 之前的内容会被放在 post.excerpt 变量中，供其它文件使用。

---

_includes
这个文件中，存放着一些模块文件，例如 categories.ext，其它文件可以通过

{% raw %}
{% include categories.ext %}
{% endraw %}
来引用这个文件的内容，方便代码模块化和重用。我的博客 主页上的 分类，归档，这些模块的代码都是通过这种方式引用的。

---

_plugins

这个文件中存放一些Ruby插件, 例如 gen_categories.rb，这些文件会在 Jekyll 解析网站源代码时被执行。下一节讲述的就是插件。

---

_site

Jekyll 解析整个网站源代码后，会将最终的静态网站源代码放在这里

---

##插件

插件使用 Ruby 写成，放在 _plugins 目录下，有些 Jekyll 没有的功能，又不能 手动添加，因为页面的内容会随着文章日期类别的不同而不同，例如分类功能和归档功能， 这时，就需要使用插件自动生成一些页面和目录。

分类 我的分类插件使用的是 
> jekyll-category-archive-plugin 

它会根据网站文章的分类信息，为每个类别生成一个页面。
使用方法是，把 plugins/categoryarchive_plugin.rb 放在 plugins 目录下， 把 _layouts/categoryarchive.html 放在 layouts 目录下， 这样，这个插件会在Jekyll解析网站时，生成相应categories目录，目录下是各个分类， 每个分类下都有一个 index.html 文件，这个文件是根据模板文件 categoryarchive.html 生成的，例如：

    _site/categories/
    ├── 工具
    │   └── index.html
    ├── 思想
    │   └── index.html
    ├── 技术
    │   └── index.html
    └── 源代码阅读
        └── index.html
然后，你就可以通过 http://username.github.io/blog/categories/工具/ 访问 工具类下的 index.html 文件。

归档 我的归档插件使用的是 jekyll-monthly-archive-plugin,它会根据网站 _posts目录下的文章日期，为每个月生成一个页面。
使用方法同上。注意，这个插件在 jekyll-1.4.2 中可能会出错，在 jekyll-1.2.0 中没有错误。

---
##[yihui](http://yihui.name/cn/2012/02/hello-jekyll/)
