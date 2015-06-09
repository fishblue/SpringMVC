package season.spring.aop.bean;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {

	public void takeSeats(){
		System.out.println("the audience is taking their seats!");
	}
	
	public void turnOffCellPhones(){
		System.out.println("the audience is turning their phones!");
	}
	
	public void applaud(String msg){
		System.out.println("CLAP CLAP CLAP CLAP"+msg);
	}
	
	public void watch(ProceedingJoinPoint joinPoint){
		try {
			System.out.println("开始观看...");
			joinPoint.proceed();
			System.out.println("观看完毕...");
		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}
