package pkg1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readbyRowNo 
{
	public void ReadData(int rd) throws IOException
	{
		
	
		File f=new File("../TextFileAssignments/fj1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String a;
		int rownumber=0;
		while((a=br.readLine())!=null)
		{
			rownumber=rownumber+1;
			if (rownumber==rd)
			{
			System.out.println(a);
			break;
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		readbyRowNo r=new readbyRowNo();
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter line number");
		int a=s.nextInt();
		r.ReadData(a);
		
	}

}
