package season.maven.spring.AutowiringBean.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import season.maven.spring.AutowiringBean.Service.FooService;
@Component
public class BarInvocation {
	@Autowired
	private FooService fooService;
	
	public void invoke(){
		fooService.fooService();
	}
}
