import java.lang.Math;
import java.util.*;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate = new Date();

    public Loan(double interestRate, double loanAmount, int numYears ){
        this.annualInterestRate = interestRate/100;
        this.loanAmount = loanAmount;
        this.numberOfYears = numYears;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public java.util.Date getLoanDate() {
        return this.loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate/100;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = getAnnualInterestRate()/12;
        double top = getLoanAmount()*monthlyInterestRate;
        double bottom = 1/(Math.pow((1+monthlyInterestRate),(getNumberOfYears()*12)));
        double monthlyPayment = top/(1-bottom);
        return monthlyPayment;

        

    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment()*getNumberOfYears()*12;
        return totalPayment;
    }
}
