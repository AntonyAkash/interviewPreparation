package String;

public class EvenLengthWordsInAString {
 public static void main(String[] args) {
	String a="Hello worldo Hell".toLowerCase();
	for(String s:a.split(" ")) {
		if(s.length()%2==0) {
			System.out.println(s);
		}
	}
}
}
