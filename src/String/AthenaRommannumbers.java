package String;
public class AthenaRommannumbers {
	public static void main(String[] args) throws Exception {
		char[] romanchars= {'I','V'};
		String result="";
		for(char c:romanchars) {
			  result+=String.valueOf(getRomanNumbers(c));
			}
		System.out.println(result);
		}
	
	//static method
	private static int getRomanNumbers(char c) throws Exception {
		switch(c) {
		
		case 'I' : return 1;
		case 'V' : return 5;
		case 'X' : return 10;
		case 'L' : return 100;
		case 'C' : return 1000;
		case 'D' : return 10000;
		default : throw new IllegalAccessException("Invald roman character : "+c);
		   
		}
	}
}