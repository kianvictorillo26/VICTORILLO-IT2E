
package victorilllo.it2e;
import java.util.ArrayList;
import java.util.Scanner;

public class loans {
    private ArrayList<LoanApplication> applications;

    public loans() {
        applications = new ArrayList<>();
    }

    public void addLoanApplication(int id, String name, double mI, int cS, int eL) {
        LoanApplication application = new LoanApplication(id, name, mI, cS, eL);
        applications.add(application);
        System.out.println("Loan application added successfully!");
    }

    public void viewLoanApplications() {
        if (applications.isEmpty()) {
            System.out.println("No loan applications to display.");
            return;
        }
        for (LoanApplication app : applications) {
            System.out.println(app);
        }
    }
}

   