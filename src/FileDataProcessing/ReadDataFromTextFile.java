package FileDataProcessing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadDataFromTextFile {
	public static void main(String[] args) throws Exception {
        // fileReader and Bufferedreader approach 
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Temp\\testFile.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str + "\n");
            }
        }
        
        System.out.println("-----------------------------------------------------------------------------------");
        
        //fileReader andScanner approach
        try(Scanner sc=new Scanner(new FileReader("C:\\Temp\\testFile.txt"))){
        	while(sc.hasNextLine())
        		System.out.println(sc.nextLine()+"\n");
        }
    }
}
