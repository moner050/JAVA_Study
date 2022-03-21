package fileIOSentence;

import java.io.FileWriter;

public class FileSaveSentence {

	public static void main(String[] args) {
		
		// ±èÃ¶¼ö/20,ÀÌ¸¸¼ö/30,ÀÌ¿µÈñ/40

		String[] names = { "±èÃ¶¼ö", "ÀÌ¸¸¼ö", "ÀÌ¿µÈñ" };
		int[] ages = { 20, 30, 40 };

		String fileName = "fileTest01.txt";

		String data = "";
		
		for(int i = 0; i < names.length; i++)
		{
			data += names[i];
			data += "/";
			data += ages[i];
			if(i < names.length - 1) data += ",";
		}
		
		System.out.println(data);
		FileWriter fw = null;
		
		try
		{
			fw = new FileWriter(fileName);
			fw.write(data);
			fw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
