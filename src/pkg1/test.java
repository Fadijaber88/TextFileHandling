package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test 
{
	public void read() throws IOException
	{
		File f1=new File("../TextFileAssignments/fj1.txt");
		FileReader fr=new FileReader(f1);
		BufferedReader br=new BufferedReader(fr);
		File f2=new File("../TextFileAssignments/fj2.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		String s;
		while((s=br.readLine())!=null)
		{
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
	public static void main(String[] args) throws IOException 
	{
		test obj=new test();
		obj.read();
	}
}