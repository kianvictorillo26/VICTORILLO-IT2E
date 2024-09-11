
package victorilllo.it2e;

import java.util.ArrayList;
import java.util.Scanner;

class LoanApplication {
    private int id;
    private String name;
    private double my;
    private int cS;
    private int eL;
    private final double mI;

    public LoanApplication(int id, String name, double mI, int cS, int eL) {
        this.id = id;
        this.name = name;
        this.mI = mI;
        this.cS = cS;
        this.eL = eL;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMonthlyIncome() {
        return mI;
    }

    public int getCreditScore() {
        return cS;
    }

    public int getExistingLoans() {
        return eL;
    }
    
    }

