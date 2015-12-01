
public class Balanced 
{
	//TODO First learn how to read from a file. then you can code this!
	public static void balanceFile()
	{

	}

	/*
	 * balance is a method which helps you determine if the amount of left curly braces is 
	 * the equivalent to the amount of right curly braces. This is why is called balanced.
	 * 
	 */
	public static void balance(String braces)
	{
		char leftCB = '{'; //leftCB = left curly brace.
		char rightCB = '}'; //rightCB =right curly brace.
		int countRightBraces = 0; //this will help to keep track of the right curly braces in the string
		int countLeftBraces = 0; // this will help to keep track of the left curly braces in the string
		
		StackOfChars myStack = new StackOfChars(braces.length());
		
		for(int j = 0 ; j < braces.length(); j++)
		{
			myStack.push(braces.charAt(j));
			if(myStack.peek() == leftCB)
			{
				countLeftBraces ++;
			}
			else
			{
				countRightBraces ++;
			}
		}

		
		/*
		 * the following for loop will help to go through each element of the string of curly braces. 
		 * 
		 * After reaching the if statements countLeftBraces and countRightBraces will be incremented depending on 
		 * what braces.charAt(i) is a the moment
		 */
//		for(int i = 0 ; i < braces.length(); i++)
//		{
//			if(braces.charAt(i) == leftCB ) 
//			{
//				countLeftBraces ++;
//			}
//			else if (braces.charAt(i) == rightCB)
//			{
//				countRightBraces ++;
//			}
//		}

		if (countRightBraces == countLeftBraces)
		{
			System.out.println("curly braces are balanced");
		}
		else if(countRightBraces < countLeftBraces)
		{
			System.out.println("curly braces are unbalanced (missing right curly brace(s))");
		}
		else
		{
			System.out.println("curly braces are unbalanced (missing left curly brace(s))");
		}

	}

	public static void main(String[] args) 
	{
		String braces = "{}{}{}{{{}}}"; //this is balanced!
		String braces2 = "{}{}{}{{}}}"; // missing a left curly brace
		String braces3 = "{}{}{}{{{}}";// missing a right curly brace

		System.out.println("the next should print: curly braces are balanced");
		balance(braces);

		System.out.println("the next should print: curly braces are unbalanced (missing left curly brace(s))");
		balance(braces2);

		System.out.println("the next should print: curly braces are unbalanced (missing right curly brace(s))");
		balance(braces3);
		
		String x = JavaSourceBalance.ReadFile("/students/home/abeltre/workspace/Lab 6/src/Curly Braces");
		balance(x);


	}

}
