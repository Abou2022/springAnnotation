package springAnnotation.application;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring configure file
				ClassPathXmlApplicationContext context =
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//get the bean from spring container
				Professor theProfessor = context.getBean("mathProfessor", Professor.class);
				Professor theProfessorEnglish = context.getBean("englishProfessor", Professor.class);
				
				//call a method on the bean
				System.out.println(theProfessor.getDailyNote());
				System.out.println(theProfessorEnglish.getDailyNote());
				
				//Call method to call student register day
				System.out.println(theProfessor.getStudent());
				System.out.println(theProfessorEnglish.getStudent());
				
				
				//close the context
				context.close();

	}

}
