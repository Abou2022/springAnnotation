package springAnnotation.application;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class MathProfessor implements Professor {
	
	private SchoolAdmin schoolAdmin;
	
	//define a default constructor
	public MathProfessor() {
		System.out.println("... MathProfessor: inside default constructor");
	}
	
	//define a setter method
	/*
	@Autowired
	public void setSchoolAdmin(SchoolAdmin theSchoolAdmin) {
		System.out.println("... MathProfessor: inside setSchoolAdmin() method");
		schoolAdmin = theSchoolAdmin;
	}
	*/
	@Autowired
	public void doSomeCrazyStuff(SchoolAdmin theSchoolAdmin) {
		System.out.println("... MathProfessor: inside doSomeCrazyStuff() method");
		schoolAdmin = theSchoolAdmin;
	}
	
	
	//added Constructor method
	
	/*
	@Autowired
	public MathProfessor(SchoolAdmin theSchoolAdmin) {
		schoolAdmin = theSchoolAdmin;
	}
	*/

	@Override
	public String getDailyNote() {
		
		return "Do your Mathematic homework everyday will help you";
	}

	@Override
	public String getStudent() {
		return schoolAdmin.getStudent();
	}

}
