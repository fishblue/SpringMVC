package season.maven.spring.AutowiringBean.Service;

import org.springframework.stereotype.Service;

@Service
public class FooService {
	
	public void fooService(){
		System.out.println("i am from fooService!");
	}
}
