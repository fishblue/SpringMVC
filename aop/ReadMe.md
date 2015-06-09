#AOP概念#
**aop**包括了：通知，切点，连接点

##通知（Advice）##
spring有5种通知的类型
- Before——在方法调用之前调用通知
- After——在方法完成之后调用通知，无论方法执行是否成功
- After-returning——在方法成功执行只有调用通知
- After-throwing——在方法抛出异常之后调用通知
- Around——通知包裹了被通知的方法，在被通知的方法调用之前和之后执行自定义行为

##连接点（joinpoint）##
**连接点**是指在应用执行过程中能够插入切面的一个点。这个点可以使方法调用时，抛出异常时，甚至修改一个字段时。切面代码可以利用这些点插入到应用的正常执行流程之中，并添加新的行为。

##切点（pointcut）##
**切点**的定义会匹配通知所要植入的一个或者多个连接点。我们通常使用明确的类和方法的名称来指定这些切点，或者利用正则表达式定义匹配的类和方法名来指定这些切点。

##切面（Aspect）##
**切面**是切点和通知的结合。


#Spring对AOP的支持#
- AspectJ
- JBoss AOP
- Spring AOP
    spring对AOP的支持包括了四个方面:
    - 基于代理的经典AOP
    - @AspectJ注解驱动的切面
    - 纯POJO切面
    - 注入式AspectJ切面（适合个spring版本）
> spring只支持方法连接点

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
