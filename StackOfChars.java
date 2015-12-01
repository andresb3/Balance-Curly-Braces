
public class StackOfChars 
{
	private int topElement;
	private int maxElements;
	private char stackArray[];
	
	public StackOfChars(int m)
	{
		maxElements = m;
		stackArray = new char[m];
		topElement = -1;
	}
	
	public void push(char c)
	{
		stackArray[++topElement] = c;
	}
	
	public char pop()
	{
		return stackArray[topElement--];
	}
	
	public char peek()
	{
		return stackArray[topElement];
	}
	
	public boolean empty()
	{
		/** This is my code. But this is not as efficient as the following.
		if(topElement != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		*/
		
		return(topElement == -1);
		
	}
	
	public boolean isFull()
	{
		return(topElement == maxElements - 1);
	}
	
	
}
