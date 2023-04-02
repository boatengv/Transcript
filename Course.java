public class Course{
    
    String name; 
    int totalCredit; 
    int[] weighting;
    
    public Course(String name, int credits, int[] weights){
        this.totalCredit = credits;
        this.weighting = weights; 
    }
    
    public int[] getWeighting(){
        return weighting; 
    }
    
}