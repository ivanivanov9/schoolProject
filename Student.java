package tema19;

public class Student extends Person {
	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	
	private int classStatus;

	public int getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}
	
	public Student(String name, String address, String phoneNumber, String email, int classStatus) {
		super(name, address, phoneNumber, email);
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return super.toString() + "Class status; " + classStatus; 
	}
}
