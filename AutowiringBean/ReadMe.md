#AutowiringBean


##spring提供了四种装配策略：
	- **byName**——把bean的属性具有相同名字（或者ID）的其他bean自动装配到bean的属性中去。如果没有，则不装配。
	- **byType**——把与bean的属性具备相同类型的其他bean自动装配到bean对应的属性中。如果没有，则不装配
	- **constructor**——把与bean的构造器入参具有相同类型的其他bean自动注入
	- **autodetect**——首先尝试constructor，如果失败则使用byType
* * *
##maven test的测试类寻找规则：
	- **Test*.java 以test开头的类
	- **\*Test.java 以test结尾的类
	- **\*TestCase.java 以testcase结尾的类

* * *
##添加了markdown语法的ReadMe

## Welcome to MarkdownPad 2 ##

**MarkdownPad** is a full-featured Markdown editor for Windows.

### Built exclusively for Markdown ###

Enjoy first-class Markdown support with easy access to  Markdown syntax and convenient keyboard shortcuts.

Give them a try:

- **Bold** (`Ctrl+B`) and *Italic* (`Ctrl+I`)
- Quotes (`Ctrl+Q`)
- Code blocks (`Ctrl+K`)
- Headings 1, 2, 3 (`Ctrl+1`, `Ctrl+2`, `Ctrl+3`)
- Lists (`Ctrl+U` and `Ctrl+Shift+O`)

### See your changes instantly with LivePreview ###

Don't guess if your [hyperlink syntax](http://markdownpad.com) is correct; LivePreview will show you exactly what your document looks like every time you press a key.

### Make it your own ###

Fonts, color schemes, layouts and stylesheets are all 100% customizable so you can turn MarkdownPad into your perfect editor.

### A robust editor for advanced Markdown users ###

MarkdownPad supports multiple Markdown processing engines, including standard Markdown, Markdown Extra (with Table support) and GitHub Flavored Markdown.

With a tabbed document interface, PDF export, a built-in image uploader, session management, spell check, auto-save, syntax highlighting and a built-in CSS management interface, there's no limit to what you can do with MarkdownPad.
