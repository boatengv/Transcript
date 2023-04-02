import java.util.Scanner;  



public class FrontEnd{
    
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    Server s; 

    public FrontEnd(){
        s = new Server();
        System.out.println("Enter your name below:");
        String name = input.nextLine();
        System.out.println("Enter your course name below: ");
        String courseName = input.nextLine();
        System.out.println("Enter your total credits below: ");
        int totalCredits = Integer.parseInt(input.nextLine());
        
        int years = totalCredits/120;
        
        System.out.println( "You are taking a " + years + "-year course");
        
        //System.out.println("Enter your year  name below: ")
        //String courseName = input.nextLine   
        

    }
}