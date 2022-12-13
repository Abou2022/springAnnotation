package springAnnotation.application;

import org.springframework.stereotype.Component;

@Component
public class EnglishProfessor implements Professor {

	@Override
	public String getDailyNote() {
		
		return "Read 5 paragraph will help you with your vocabular";
	}

}
