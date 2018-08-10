## 跟开涛学SpringMVC

###url
http://jinnianshilongnian.iteye.com/blog/1593441

###主要内容
>hello world
1.一个简单的controller
2.默认DispatcherServlet会加载　`WEB-INF/[DispatcherServlet的Servlet名字]-servlet.xml`配置文件
3.HandlerMapping常用的有2种
　BeanNameUrlHandlerMapping要加`/`，使用`name`属性,是默认配置
　SimpleUrlHandlerMapping可不加`/`，使用`id`属性

### 遇到问题
1. web.xml文件可能提示 `web.xml servlet should have a mapping`
可以尝试去掉pom中的compile版本，重启一下idea
2. webcontent 和 webapp　目录
eclipse:　`/WebContent` 非标准
Maven:`/src/main/webapp` 标准


