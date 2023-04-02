public class Course{
    
    String name; 
    int totalCredit; 
    float[] weighting;
    
    public Course(String name, int credits, float[] weights){
        this.totalCredit = credits;
        this.weighting = weights; 
    }
    
    public float[] getWeighting(){
        return weighting; 
    }
    
}