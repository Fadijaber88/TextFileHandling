package pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writeRowCount 
{
	public void rowcount(int rc) throws IOException
	{
		int rowcount=0;
		File f=new File("../TextFileAssignments/fj1.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the data");
		
		while(rowcount<=rc)
		{
			rowcount=rowcount+1;
			String x=s.next();
			bw.write(x);
			bw.newLine();
			
		}
		bw.close();
		System.out.println("Thank you");
	}
	public static void main(String[] args) throws IOException 
	{
		writeRowCount w=new writeRowCount();
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the end rownumber");
		int y=s.nextInt();
		w.rowcount(y);
		
	}

}
