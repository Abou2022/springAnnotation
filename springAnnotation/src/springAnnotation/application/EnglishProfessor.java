package springAnnotation.application;

import org.springframework.stereotype.Component;

@Component
public class EnglishProfessor implements Professor {
	
	private SchoolAdmin schoolAdmin;

	@Override
	public String getDailyNote() {
		
		return "Read 5 paragraph will help you with your vocabular";
	}

	@Override
	public String getStudent() {
		
		return schoolAdmin.getStudent();
	}

}
