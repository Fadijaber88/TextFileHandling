package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeInRange
{
	public void WriteDataInRange(int a, int b) throws IOException
	{
		int rowcount=a;
		File f=new File("../TextFileAssignments/fj1.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the data");
		
		for(int i=1;i<=b;i++)
		{
			if(i>=a)
			{
			rowcount=rowcount+1;
			String x=s.next();
			bw.write(x);
			bw.newLine();
			}
			
			
			else
				bw.newLine();
			
		}
		bw.close();
		System.out.println("Thank you");
	}
	public static void main(String[] args) throws IOException 
	{
		writeInRange w=new writeInRange();
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the row range");
		int x=s.nextInt();
		int y=s.nextInt();
		w.WriteDataInRange(x,y);
		
	}

}
