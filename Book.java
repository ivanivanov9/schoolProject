package tema17;
import java.util.ArrayList;
import java.util.Arrays;

class Book {
	String ISBN;
	Author author;
	Library library;
	ArrayList <Chapter> chapters;
	

	Book() {
		chapters = new ArrayList <Chapter> (Arrays.asList(
				new Chapter(1),
		        new Chapter(2),
		        new Chapter(3)));
		
	}

}
