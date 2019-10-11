# 使用Spring Boot搭建个人博客

## 2019-10-11 更新

感谢各位的支持，由于很久不做Java的项目，所以本项目疏于维护，这里对大家说一声抱歉，这个项目以后不会再维护了。

看到很多童鞋在提出本项目的一些问题，所以欢迎大家提issues，大家相互解决一下问题，我也会及时pr大家的合并。

## 简介
后端使用Spring Boot搭建的一个博客系统，前端使用的是thymeleaf + bootstrap，集成了editormd的markdown编辑器。
本人前端水平非常小学生，所以界面可能不是很美观。还有很多不完整的地方请大家多多指教。
本项目适合Spring初学者作为练手项目，包含的主要技术点：

> 1. spring data jpa的基本使用
> 2. 数据绑定
> 3. 拦截器
> 4. spring boot 注解配置

### 地址
项目博客地址：[ 使用Spring Boot搭建个人博客](http://blog.csdn.net/wchstrife/article/details/76725317)

项目的思路以及前端代码来自他的博客：
[ 一个JavaWeb搭建的开源Blog系统，整合SSM框架](http://blog.csdn.net/u012702547/article/details/61428686)

## 功能展示
把工程导入本地后，在mysql中添加一个叫做blog的database，然后在配置文件中把数据库的账号密码地址修改成自己的即可运行
**主界面**：
![主界面](http://img.blog.csdn.net/20170805162254370?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvd2Noc3RyaWZl/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)


**详情**
![详情](http://img.blog.csdn.net/20170805162444564?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvd2Noc3RyaWZl/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

**登录**
![登录](http://img.blog.csdn.net/20170805162532111?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvd2Noc3RyaWZl/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

**后台管理**
![后台管理](http://img.blog.csdn.net/20170805162604500?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvd2Noc3RyaWZl/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

**写博客**
![写博客](http://img.blog.csdn.net/20170805162634149?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvd2Noc3RyaWZl/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast)

