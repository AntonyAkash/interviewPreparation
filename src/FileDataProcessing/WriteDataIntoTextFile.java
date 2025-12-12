package FileDataProcessing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {
	public static void main(String[] args) throws IOException {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Temp\\testFile.txt"))){
			bw.write("Anda Pathri Gnanamma of Kilachery is remembered as a devout and selfless Catholic woman known for her deep faith and service.\r\n"
					+ "\r\n"
					+ "She dedicated her life to prayer, charity, and helping the needy in her community. \r\n"
					+ "\r\n"
					+ "Her contributions to spiritual life in the region made her a respected figure among the faithful, \r\n"
					+ "\r\n"
					+ "and she continues to be honored for her holiness and humble service.");
			bw.write("\t thank you");
		}
	}

}
