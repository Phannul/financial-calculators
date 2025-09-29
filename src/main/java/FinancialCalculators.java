import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello, What do you want to calculate today?\n 1.Mortgage\n 2. Future Value \n 3. Present Value of an annuity");
        String Input = myScanner.nextLine();
        double calculatorChoice = Double.parseDouble(Input);
        mortgageCalculator(myScanner);

    }
    public static void mortgageCalculator (Scanner mortgageScanner){
        System.out.println(" Enter the principal here: ");
        String Input = mortgageScanner.nextLine();
        double principal = Double.parseDouble(Input);

        System.out.println("Enter the Interest rate here: ");
        Input = mortgageScanner.nextLine();
        double interestRate = Double.parseDouble(Input);

        System.out.println("Enter the Loan Length here");
        Input = mortgageScanner.nextLine();
        double loanLength = Double.parseDouble(Input);

        double monthlyInterestRate = interestRate / 12;
        double numberOfMonthlyPayments = loanLength * 12;
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),numberOfMonthlyPayments) / Math.pow((1 + monthlyInterestRate),numberOfMonthlyPayments));
        double totalInterest = (monthlyPayment * numberOfMonthlyPayments) - principal;
        System.out.printf("Your Monthly payment is %.2f and the total interest pay is %.2f", monthlyPayment,totalInterest);

    }


}
