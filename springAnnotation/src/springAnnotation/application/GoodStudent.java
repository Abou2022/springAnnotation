package springAnnotation.application;

import org.springframework.stereotype.Component;

@Component
public class GoodStudent implements SchoolAdmin {

	@Override
	public String getStudent() {
		
		return "Today is your enrollment day!!";
	}

}
