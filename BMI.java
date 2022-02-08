import java.lang.Math;

public class BMI {
    private double height;      //height in inches
    private double weight;      //weight in pounds
    private double BMI;
    
    public BMI(double height, double weight){
        this.height = height; 
        this.weight = weight;

    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI(){
        this.BMI = (this.getWeight()*0.45359237)/(Math.pow((this.getHeight()*0.0254),2));
        return this.BMI;
    }



}
