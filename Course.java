public class Course{
    
    int totalCredit; 
    int[] weighting;
    
    public Course(int credits, int[] weights){
        this.totalCredit = credits;
        this.weighting = weights; 
    }
    
    public int[] getWeighting(){
        return weighting; 
    }
    
}