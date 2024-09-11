
 import java.util.ArrayList;
import java.util.Scanner;
public class loans {   
class LoanApplication {
    private int id;
    private String name;
    private double monthlyIncome;
    private int creditScore;
    private int existingLoans;

    public LoanApplication(int id, String name, double monthlyIncome, int creditScore, int existingLoans) {
        this.id = id;
        this.name = name;
        this.monthlyIncome = monthlyIncome;
        this.creditScore = creditScore;
        this.existingLoans = existingLoans;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public int getExistingLoans() {
        return existingLoans;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Monthly Income: $" + monthlyIncome +
               ", Credit Score: " + creditScore +
               ", Existing Loans: " + existingLoans;
    }
}
    
}
