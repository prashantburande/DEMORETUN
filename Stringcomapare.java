//Q 2 wap to ask two string values from user and check if they are equal or not 
package string1;
import java.util.Scanner;
public class Stringcomapare
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String s1=sc.next(); 
		System.out.println("Enter a name");
		String s2=sc.next();
		
		if(s1.equals(s2))
		
			System.out.println("Stering value are same");
		}
		else
		{
			System.out.println("Stering value are not same");
		}

	}

}
