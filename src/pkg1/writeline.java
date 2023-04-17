package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeline 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../TextFileAssignments/fj1.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("third line");
		bw.newLine();
		bw.write("fourth line");
		bw.close();
		
	}

}
