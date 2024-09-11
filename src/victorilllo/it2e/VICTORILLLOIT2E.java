
package victorilllo.it2e;

import java.util.Scanner;


public class VICTORILLLOIT2E {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        loan manager = new loan();

        while (true) {
            System.out.println("1. Add Loan Application");
            System.out.println("2. View Loan Applications");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Monthly Income: ");
                    double income = scanner.nextDouble();

                    System.out.print("Enter Credit Score: ");
                    int creditScore = scanner.nextInt();

                    System.out.print("Enter Number of Existing Loans: ");
                    int existingLoans = scanner.nextInt();
                    scanner.nextLine();  

                    manager.addLoanApplication(id, name, income, creditScore, existingLoans);
                    break;

                case 2:
                    manager.viewLoanApplications();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    
            loan[i] = new loan (id,)
                    
             System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
            "ID", "Name", "mI", "cS", "eL");
            }
        }
    }
}