import java.util.ArrayList;

public class Module{
    
    String name; 
    int credit; 
    ArrayList<Content> contents;
    
    public Module(String name, int credit, ArrayList<Content> contents){
        this.name = name;
        this.credit = credit;
        this.contents = contents;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public int getCredit(){
        return this.credit;
    }

}