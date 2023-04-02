import java.util.ArrayList;

public class Student{
    
    Course c;
    ArrayList<Module> studentModules = new ArrayList<Module>();
    
    public Student(Course c, ArrayList<Module> mod){
        this.c = c;
        this.studentModules = mod;
    }
    
    public void insertModule(Module m){
        this.studentModules.add(m);
    }
    
    
}