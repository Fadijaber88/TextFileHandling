package pkg1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readf1writef2 
{
	public void rowrange(int rr1, int rr2) throws IOException
	{
		int rownumber=rr1;
		File f=new File("../TextFileAssignments/fj1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		
		
		File f2=new File("../TextFileAssignments/fj2.txt");
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw=new BufferedWriter(fw);
		String a;
		while((a=br.readLine())!=null)
		{
			bw.write(a);
			bw.newLine();
			System.out.println("sss");
		}
		bw.close();
		br.close();

	}

	public static void main(String[] args) throws IOException 
	{
		readf1writef2 r=new readf1writef2();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the start line");
		int x=s.nextInt();
		
		System.out.println("Please enter the end line");
		int y=s.nextInt();
		
		r.rowrange(x, y);
		
	}

}
