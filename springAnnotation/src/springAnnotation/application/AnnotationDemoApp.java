package springAnnotation.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
				ClassPathXmlApplicationContext context =
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//get the bean from spring container
				Professor theProfessor = context.getBean("thatMathProfessor", Professor.class);
				
				//call a method on the bean
				System.out.println(theProfessor.getDailyNote());
				
				//close the context
				context.close();

	}

}
