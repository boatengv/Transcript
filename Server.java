import java.util.HashMap;

public class Server{
    
    HashMap<Integer, Student> database = new HashMap<Integer, Student>();
    int userID = 0;
    
    public Server(){
        
    }
    
    public void addStudentToDatabase(Student s){
        this.database.put(createUserID(), s);
        
    }
    
    public int createUserID(){
        userID =+ 1; 
        return userID;
    }
    
}