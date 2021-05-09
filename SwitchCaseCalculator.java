package Calculator;
import java.util.*;
public class SwitchCaseCalculator {
	public static void main(String args[]) {
		//getting two operands from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		float a = sc.nextFloat(); //why float?
		
		System.out.println("Enter number 2");
		float b = sc.nextFloat(); //because we are providing Divide Operation
		
		//Result variable 
		float result = 0f;
		
		//Getting operators
		System.out.println("Enter the Operations ");
		
		
		char operator = sc.next().charAt(0);
		
		//Now Operations based on operators
		switch(operator) {
		case '+':
			
			result = a+b;
			break;
			
		case '-' :
			result = a-b;
			
			break;
			
		case '*' :
			result = a*b;
			
			break;
			
		case '/' :
			result = (float)a/b;
			
			break;
			
		default:
			System.out.println("Invalid Operation");
		}
		if(a == (int)a  || b == (int)b) {
			
			
			System.out.println("The Answer is "+ (int)result);
			
		}
		else {
			
			System.out.println("The Answer is "+ result);
			
			
		}
		
		
		
	}

}
