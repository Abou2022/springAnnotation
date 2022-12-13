package springAnnotation.application;

import org.springframework.stereotype.Component;

@Component("thatMathProfessor")
public class MathProfessor implements Professor {

	@Override
	public String getDailyNote() {
		
		return "Do your Mathematic homework everyday will help you";
	}

}