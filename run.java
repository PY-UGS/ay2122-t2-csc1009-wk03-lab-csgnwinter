import java.util.*;

public class run {
    
    public static void main(String[] args) {
        System.out.println("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.println("Enter height in pounds: ");
        double height = input.nextDouble();
        BMI newBMI = new BMI(height, weight);
        System.out.println("BMI is: "+ newBMI.getBMI());
        input.close();

        if (newBMI.getBMI()<18.5){
            System.out.println("Underweight");
        }
        else if (newBMI.getBMI()>=18.5 && newBMI.getBMI()<25.0){
            System.out.println("Normal");
        }
        else if (newBMI.getBMI()>=25.0 && newBMI.getBMI()<30.0){
            System.out.println("Overweight");
        }
        else if (newBMI.getBMI()>=30.0){
            System.out.println("Obese");
        }
        else {
            System.out.println("Error");
        }
        
    }
}
