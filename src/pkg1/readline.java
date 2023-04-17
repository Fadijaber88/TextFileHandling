package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readline 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../TextFileAssignments/fj1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String a;
		while((a=br.readLine())!=null)
		{
			System.out.println("test"+a);
		}
		
		
		
	}

}
