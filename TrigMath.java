import java.util.Scanner;

public class TrigMath {

	public static void main(String[] args)
	{
 
	   
	        double num;   Scanner sc= new Scanner(System.in);
	 
	        System.out.print("Enter a number: ");
	        num = sc.nextDouble();
	        
	
	
	        
	       //Square root method to get square root of given number 
	        Double squareroot = Math.pow(num, 0.5);
	        System.out.println("The Square root of a Given Number  " + num + "  =  " + squareroot);
	        
	        //Method to get the sin value
	        Double sinMath = Math.sin(num);
	        System.out.println("The Sin of a Given Number  " + num + "  =  " + sinMath);
	        
	        //Method to get the cosine value
	        Double cosinMath = Math.cos(num);
	        System.out.println("The Cosine of a Given Number  " + num + "  =  " + cosinMath);
	        
	        //cos() method to get the tangent value
	        Double radians = Math.toRadians(num); 
	        Double tanMath = Math.tan(radians);
	        System.out.println("The tan of a Given Number  " + num + "  =  " + tanMath);
	        
	        
	        
	
	   }
	    }
	

