package springAnnotation.application;

public class GoodStudent implements SchoolAdmin {

	@Override
	public String getStudent() {
		
		return "Today is your enrollment day!!";
	}

}
