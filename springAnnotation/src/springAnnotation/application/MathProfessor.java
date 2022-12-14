package springAnnotation.application;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class MathProfessor implements Professor {
	
	private SchoolAdmin schoolAdmin;
	
	//added Constructor method
	@Autowired
	public MathProfessor(SchoolAdmin theSchoolAdmin) {
		schoolAdmin = theSchoolAdmin;
	}

	@Override
	public String getDailyNote() {
		
		return "Do your Mathematic homework everyday will help you";
	}

	@Override
	public String getStudent() {
		return schoolAdmin.getStudent();
	}

}
