package edu.eci.cvds;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		if (args.length == 2){
			System.out.println("Hello"+" "+args[0]+" "+args[1]+"!");
		}
		else if (args.length == 1){
			System.out.println("Hello"+" "+args[0]+"!");
		}
		else{
			System.out.println("Hello World!");
		}
    }
}
