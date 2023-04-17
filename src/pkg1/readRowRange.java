package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readRowRange 
{
	public void rowrange(int rr1, int rr2) throws IOException
	{
		int rownumber=0;
		File f=new File("../TextFileAssignments/fj1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String a;
		while((a=br.readLine())!=null)
		{
			rownumber=rownumber+1;
			if(rownumber>=rr1 && rownumber<=rr2)
			{
				System.out.println(a);
			}
		}
		
	}
	public static void main(String[] args) throws IOException 
	{
		readRowRange r=new readRowRange();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the start line");
		int x=s.nextInt();
		
		System.out.println("Please enter the end line");
		int y=s.nextInt();
		
		r.rowrange(x, y);
		
	}

}
