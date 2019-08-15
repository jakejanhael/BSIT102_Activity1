import java.io.*;

							//Jake Janhael Hapita & Vincent Delos Reyes
public class basicCalcu 
{
    
    public static void main(String[] args) throws Exception
    {
    	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    		
    		int firstNum;
    		int secondNum;
    		
    		
    		System.out.println("Hello, User!");
    		
    		System.out.println("Input your first number: ");
    		firstNum = Integer.parseInt(br.readLine());
    		
    		System.out.println("Input your second number: ");
    		secondNum = Integer.parseInt(br.readLine());
    		
    		System.out.println( "The sum of " + firstNum + " and " + secondNum + " is " + (firstNum+secondNum));
    		System.out.println( "The difference of " + firstNum + " and " + secondNum + " is " + (firstNum-secondNum));
    		System.out.println( "The product of " + firstNum + " and " + secondNum + " is " + (firstNum*secondNum));
    		System.out.println( "The qoutient of " + firstNum + " and " + secondNum + " is " + (firstNum/secondNum));
    		
    }
}
