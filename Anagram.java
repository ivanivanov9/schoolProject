import java.util.Scanner;
public class Anagram {
public Anagram() {
// TODO Auto-generated constructor stub
}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner a = new Scanner(System.in);
String string1 = a.nextLine();
String string2 = a.nextLine();
a.close();
boolean anagram = true;
String copyString2 = string2;
int lengthString1 = string1.length();
for(int i = 0; i < lengthString1; i++) {
	char charInString1 = string1.charAt(i);
	if (charInString1 >= 'a' && charInString1 <= 'z' || charInString1 >= 'A' && charInString1 <= 'Z') {
		int positionInString2 = copyString2.indexOf(charInString1);
		if(positionInString2 == -1) {
			anagram = false;
			break;
		} else {
			copyString2 = copyString2.substring(0, positionInString2) + copyString2.substring(positionInString2 + 1);
			System.out.println(copyString2);
		}
	}
}
if(anagram) {
	int charsLeftString2 = copyString2.length();
	for (int i = 0; i < charsLeftString2; i++) {
		char currentChar = copyString2.charAt(i);
		if(currentChar >= 'a' && currentChar <= 'z' || currentChar >= 'A' && currentChar <= 'Z') {
			anagram = false;
			break;
		}
	}
}
System.out.println(anagram ? "is an anagram" : "isn't an anagram");
	}

}
