public class Module{
    
    String name; 
    int credit; 
    Content content;
    
    public Module(String name, int credit, Content content){
        this.name = name;
        this.credit = credit;
        this.content = content;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    public int getCredit(){
        return this.credit;
    }

}