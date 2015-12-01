import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class JavaSourceBalance
{

	public static String ReadFile(String filename)
	{
		Scanner input = null;
		String fileText = "";
		String braces = "";
	

		try
		{
			File file = new File(filename);
			input = new Scanner(new FileReader(file));
			
			while (input.hasNext())
			{
				fileText += input.next();
			}
		}
		catch(IOException e )
		{
			System.out.println(e);
		}
		finally
		{
			if(input != null)
			input.close();
		}
		
		for(int i = 0; i < fileText.length() ; i++)
		{
			if(fileText.charAt(i) == '{' || fileText.charAt(i) == '}' )
			{
				braces += fileText.charAt(i);
			}
		}
		return braces; 
		
		
	}
	
	


}
