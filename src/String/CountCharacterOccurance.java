package String;

public class CountCharacterOccurance {
	public static void main(String[] args) {
		String s="Antony Immanuel Akash";
		int toltallength=s.length();
	    int finallength=s.toLowerCase().replace("a","").length();
	    int count=toltallength-finallength;
	    System.out.println(count);
	}

}
