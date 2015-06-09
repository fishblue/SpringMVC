#AutowiringBean
[TOC]

##spring提供了四种装配策略：
	-**byName**——把bean的属性具有相同名字（或者ID）的其他bean自动装配到bean的属性中去。如果没有，则不装配。
	-**byType**——把与bean的属性具备相同类型的其他bean自动装配到bean对应的属性中。如果没有，则不装配
	-**constructor**——把与bean的构造器入参具有相同类型的其他bean自动注入
	-**autodetect**——首先尝试constructor，如果失败则使用byType
* * *
##maven test的测试类寻找规则：
	-**Test*.java 以test开头的类
	-**\*Test.java 以test结尾的类
	-**\*TestCase.java 以testcase结尾的类

* * *
##添加了markdown语法的ReadMe