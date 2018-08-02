import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num=5;
		long factorial=1;
		for(int i = 1;i <= num ; ++i)
		{
			factorial *=i;
		}
		
		System.out.printf("the factorial of %d = %d", num,factorial);
		}
	}
