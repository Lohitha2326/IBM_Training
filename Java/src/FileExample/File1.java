package FileExample;

import java.io.*;
public class File1 {
	public static void main(String[] args) throws IOException
	{
		//FileWriter fw=new FileWriter("one.txt");//file writing
		//fw.write("Welcome");
		FileReader fr=new FileReader("one.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}
