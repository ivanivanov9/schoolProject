package tema19;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("Ivan",
				"Mladost 1",
				"0876544568",
				"iuhcvbn@abv.bg");
		Student s1 = new Student("Sofia",
				"Mladost 1a",
				"0986543344",
				"sofi16@abv.bg",
				Student.SOPHOMORE);
		Employee e1 = new Employee("Nikol",
				"Mladost 4",
				"0986542344",
				"nikol13@abv.bg",
				"Office 26",
				2500);
		Faculty f1 = new Faculty("Daniel",
				"Ovcha kupel",
				"0986542323",
				"danko3@abv.bg",
				"Office 3",
				2000,
				"7 - 17",
				"Rank 2");
		Staff staff1 = new Staff("Momchil",
				"Drujba",
				"0982222344",
				"mom3@abv.bg",
				"Office 31",
			    3000,
				"Executive director");
	
	System.out.println(p1.toString());
	System.out.println(s1.toString());
	System.out.println(e1.toString());
	System.out.println(f1.toString());
	System.out.println(staff1.toString());
	}
}
