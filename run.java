import java.util.*;
import java.lang.Math;

public class run {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 12000.90: ");
        double loanAmount = input.nextDouble();
        input.close();
        Loan loan = new Loan(interestRate, loanAmount, numberOfYears);
        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is "+ Math.round(loan.getMonthlyPayment()*100.0)/100.0);
        System.out.println("The total payment is "+Math.round(loan.getTotalPayment()*100.0)/100.0);

    }
}
