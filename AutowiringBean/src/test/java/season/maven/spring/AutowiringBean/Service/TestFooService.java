package season.maven.spring.AutowiringBean.Service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import season.maven.spring.AutowiringBean.Service.FooService;
/**
 * 单元测试，测试fooservice
 * @author Administrator
 *
 */
public class TestFooService {
	@Test
	public void TFooService(){
		ApplicationContext ctx = null;
		FooService foo = null;
		try{
			ctx = new ClassPathXmlApplicationContext("conf/spring-application.xml");
		}catch(BeansException e){
			Assert.assertTrue(false);
		}
		try{
			Assert.assertTrue(ctx != null);
			foo = (FooService) ctx.getBean("fooService");
		}catch(NoSuchBeanDefinitionException e){
			Assert.assertTrue(false);
		}
		Assert.assertTrue(foo != null);
		foo.fooService();
		Assert.assertTrue(true);
	}
}
