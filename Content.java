public class Content{
    
    String name; 
    int weight;
    int grade;
    
    public Content(String name, int weight){
        this.name = name; 
        this.weight = weight;
    }
    
    public String getName(){
        return name;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public void setGrade(int grade){
        this.grade = grade;
    }

}