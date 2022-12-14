package springAnnotation.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnglishProfessor implements Professor {
	
	private SchoolAdmin schoolAdmin;
	
	@Autowired
	//added constructor method
	public EnglishProfessor(SchoolAdmin theSchoolAdmin) {
		this.schoolAdmin = theSchoolAdmin;
	}

	@Override
	public String getDailyNote() {
		
		return "Read 5 paragraph will help you with your vocabular";
	}

	@Override
	public String getStudent() {
		
		return schoolAdmin.getStudent();
	}

}
