package season.maven.spring.BeanAssembly.bean;

public class FooBean {
	private int foo = 5;
	
	public FooBean() {
		// TODO Auto-generated constructor stub
	}
	
	public FooBean(int initial){
		foo = initial;
	}
	
	public void foo(){
		System.out.println(foo);
	}

	public int getFoo() {
		return foo;
	}

	public void setFoo(int foo) {
		this.foo = foo;
	}
	
}
