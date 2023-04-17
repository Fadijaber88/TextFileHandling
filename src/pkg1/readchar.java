package pkg1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readchar 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../TextFileAssignments/fj1.txt");
		FileReader fr=new FileReader(f);
		
		int a;
		while((a=fr.read())!=-1)
        {
        	System.out.println((char)a);
        }
				
	}

}
