import java.util.Scanner;  
import java.util.ArrayList;


public class FrontEnd{
    
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    Server server; 

    public FrontEnd(){
        server = new Server();
        System.out.println("Enter your name below:");
        String name = input.nextLine();
        System.out.println("Enter your course name below: ");
        String courseName = input.nextLine();
        System.out.println("Enter your total credits below: ");
        int totalCredits = Integer.parseInt(input.nextLine());
        
        int years = totalCredits/120;
        float weights[] = new float[years];
        
        
        System.out.println( "You are taking a " + years + "-year course");
        
        for(int i = 0; i<years; i++){
            System.out.println("How much does year " + (i+1) + " weigh: ");
            weights[i] = Float.parseFloat(input.nextLine());
            
            System.out.println("How many modules are in year " + (i+1) + ": " );
            int modSize = Integer.parseInt(input.nextLine());
            
            ArrayList<Module> mod = new ArrayList<Module>();

          
            for(int j = 0; j<modSize; j++){
                System.out.println("Enter module name below:");
                String modName = input.nextLine();
                
                System.out.println("Enter module credit" + modName + ": " );
                int modCred = Integer.parseInt(input.nextLine());
                
                System.out.println("How many segments in this module " + modName + ": " );
                int contSize = Integer.parseInt(input.nextLine());
          
                ArrayList<Content> contents = new ArrayList<Content>();
                
                for(int n = 0; n<contSize; n++){
                    System.out.println("Enter content name below:");
                    String contName = input.nextLine();
                    System.out.println("Enter content weight below:");
                    int contWeight = Integer.parseInt(input.nextLine());
                    Content cont = new Content(contName, contWeight);
                    contents.add(cont);
                }
                
                
                Module module = new Module(modName, modCred, contents);
                mod.add(module);
            }
            
            
            Course c = new Course(courseName, totalCredits, weights);
            Student s = new Student(c, mod);
            server.addStudentToDatabase(s);
            server.printTranscript();
        }
        
        
        
        
    }
}