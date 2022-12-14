package springAnnotation.application;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomSchoolAdmin implements SchoolAdmin {
	
	//Create an array of strings
	private String[] data = {
			"Always start on time",
			"Be polite with everyone",
			"Make sure all student are present"
	};
	
	//Create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getStudent() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theSchool = data[index];
		return theSchool;
	}

}
