package springAnnotation.application;

import org.springframework.stereotype.Component;

@Component
public class HappySchoolAdmin implements SchoolAdmin {

	@Override
	public String getStudent() {
		
		return "Today is your enrollment day!!";
	}

}
