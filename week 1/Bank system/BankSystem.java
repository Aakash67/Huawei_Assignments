/*
 * Huawei Assignment
 * author @ Aakash R
 * Java program to create a bank system and find the interest and repayment day
 * using inheritance and polymorphism
 *  
 * */
import java.util.*;
import java.util.Calendar;

// class declaration
// Bank is the parent class
// The derived classes are IndianBank class, StateBank class, CanaraBank class and ICICI class
// Relation between base class and derivered classes are Heriarchy inheritance
class Bank {

    public void BankType() {
        // Try block is used to Handle the exception
        try (Scanner sc = new Scanner(System.in)) {
            // Geting the name from the user
            System.out.println("Enter your Name :");
            String n = sc.nextLine();
            System.out.println("Greetings " + n + "!!!");

            // Select a bank 
            System.out.println((" Select a bank"));
            System.out.println("\n1. Indian bank\n2. State bank\n3. canara bank\n4. ICICI bank");
            int s = sc.nextInt();
            switch (s) {
                case 1:
                    System.out.println(" you Have selected Indian Bank");
                    // using constructor to call the specific funtion
                    IndianBank IB = new IndianBank();
                    IB.typeofloan();
                    break;
                case 2:
                    System.out.println(" you Have selected State Bank");
                    StateBank SB = new StateBank();
                    SB.typeofloan();
                    break;
                case 3:
                    System.out.println(" you Have selected canara Bank");
                    CanaraBank CB = new CanaraBank();
                    CB.typeofloan();
                    break;
                case 4:
                    System.out.println(" you Have selected IcIcI Bank");
                    ICICI IC = new ICICI();
                    IC.typeofloan();
                    break;
                default:
                    System.out.println(" Enter a valid choice");
                    break;
            }
        }
    }
}

// inherit from Bank
// Derivered class 1

class IndianBank extends Bank {
    public void typeofloan() {
        System.out.println("Select the type of loan");
        System.out.println("\n1.Personal loan \n2.Housing loan\n3.Educational loan\n4.Gold loan");
        int c = sc.nextInt();

        // Creating the constructor for the class
        IndianBank IB = new IndianBank();
        switch (c) {
            case 1:
                System.out.println("You have selected  personal loan");
                IB.PersonalLoan();
                break;
            case 2:
                System.out.println("You have selected Housing loan");
                IB.HousingLoan();
                break;
            case 3:
                System.out.println("You have selected Educational loan");
                IB.EducationLoan();
                break;
            case 4:
                System.out.println("You have selected the Gold loan");
                IB.GoldLoan();
                break;
            default:
                System.out.println("enter a valid choice");
                break;
        }
    }

    Scanner sc = new Scanner(System.in);
    // new method in subclass
    public void PersonalLoan() {

        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.14;
        double si = (p * r * t) / 100;

        // printing the emi amount for a month
        System.out.println("The interest amount is" + si);
    }
    public void HousingLoan() {
        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.16;
        double si = (p * r * t) / 100;

        // printing the emi amount for a month
        System.out.println("The interest amount is" + si);

    }
    public void EducationLoan() {
        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.8;
        double si = (p * r * t) / 100;

        // printing the emi amount for a month
        System.out.println("The interest amount is" + si);
    }
    public void GoldLoan() {
        System.out.println("Enter number of Grams");
        long p = sc.nextLong();
        p = p * 5500;
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.8;
        double si = (p * r * t) / 100;

        // printing the emi amount for a month
        System.out.println("The interest amount is" + si);

    }
}

// Same functions name are used for the derived 
// This lets to function Overloading
// polymorphism


// inherit from Bank
// Derivered class 2

class StateBank extends Bank {
    Scanner sc = new Scanner(System.in);
    public void typeofloan() {
        System.out.println("Select the type of loan");
        System.out.println("\n1.Personal loan \n2.Housing loan\n3.Educational loan\n4.Gold loan");
        int c = sc.nextInt();
        StateBank SB = new StateBank();
        switch (c) {
            case 1:
                System.out.println("You have selected  personal loan");
                SB.PersonalLoan();
                break;

            case 2:
                System.out.println("You have selected Housing loan");
                SB.HousingLoan();
                break;
            case 3:
                System.out.println("You have selected Educational loan");
                SB.EducationLoan();
                break;
            case 4:
                System.out.println("You have selected the Gold loan");
                SB.GoldLoan();
                break;
            default:
                System.out.println("enter a valid choice");
                break;
        }
    }

    // new method in subclass
    public void PersonalLoan() {

        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.12;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);
    }
    public void HousingLoan() {
        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.9;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);

    }
    public void EducationLoan() {
        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.5;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);
    }
    public void GoldLoan() {
        System.out.println("Enter number of Grams");
        long p = sc.nextLong();
        p = p * 5500;
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.5;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);

    }
}

// Same functions name are used for the derived 
// This lets to function Overloading
// polymorphism


// inherit from Bank
// Derivered class 3

class CanaraBank extends Bank {
    public void typeofloan() {
        System.out.println("Select the type of loan");
        System.out.println("\n1.Personal loan \n2.Housing loan\n3.Educational loan\n4.Gold loan");
        int c = sc.nextInt();
        CanaraBank CB = new CanaraBank();
        switch (c) {
            case 1:
                System.out.println("You have selected  personal loan");
                CB.PersonalLoan();
                break;
            case 2:
                System.out.println("You have selected Housing loan");
                CB.HousingLoan();
                break;
            case 3:
                System.out.println("You have selected Educational loan");
                CB.EducationLoan();
                break;
            case 4:
                System.out.println("You have selected the Gold loan");
                CB.GoldLoan();
                break;
            default:
                System.out.println("enter a valid choice");
                break;
        }
    }
    Scanner sc = new Scanner(System.in);

    // new method in subclass
    public void PersonalLoan() {

        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.13;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);
    }
    public void HousingLoan() {
        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.11;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);

    }
    public void EducationLoan() {
        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.8;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);
    }
    public void GoldLoan() {
        System.out.println("Enter number of Grams");
        long p = sc.nextLong();
        p = p * 5500;
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.9;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);

    }
}

// Same functions name are used for the derived 
// This lets to function Overloading
// polymorphism


// inherit from Bank
// Derivered class 4

class ICICI extends Bank {

    public void typeofloan() {
        System.out.println("Select the type of loan");
        System.out.println("\n1.Personal loan \n2.Housing loan\n3.Educational loan\n4.Gold loan");
        int c = sc.nextInt();
        ICICI IC = new ICICI();
        switch (c) {
            case 1:
                System.out.println("You have selected  personal loan");
                IC.PersonalLoan();
                break;
            case 2:
                System.out.println("You have selected Housing loan");
                IC.HousingLoan();
                break;
            case 3:
                System.out.println("You have selected Educational loan");
                IC.EducationLoan();
                break;
            case 4:
                System.out.println("You have selected the Gold loan");
                IC.GoldLoan();
                break;
            default:
                System.out.println("enter a valid choice");
                break;
        }
    }

    Scanner sc = new Scanner(System.in);
    // new method in subclass
    public void PersonalLoan() {

        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.16;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);
    }
    public void HousingLoan() {
        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.11;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);
    }
    public void EducationLoan() {
        System.out.println("Enter the prinicipal amount");
        long p = sc.nextLong();
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.9;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);
    }
    public void GoldLoan() {
        System.out.println("Enter number of Grams");
        long p = sc.nextLong();
        p = p * 5500;
        System.out.println("Enter the Loan tenture");
        int t = sc.nextInt();
        double r = 0.7;
        double si = (p * r * t) / 100;
        System.out.println("The interest amount is" + si);


    }
}


// Main driver function

class BankSystem {
    public static void main(String[] args) {

        // create an object of the subclass
        Bank B = new Bank();

        // access field of superclass
        // call method of superclass
        // using object of subclass
        B.BankType();

        // printing the current date 

        Calendar calendar = Calendar.getInstance();
        System.out.println("Current Date = " + calendar.getTime());
        // Add 1 months to current date
        // To get the EMI date for next month
        calendar.add(Calendar.MONTH, 1);
        System.out.println("The Next EMI date " + calendar.getTime());

    }
}
// End of the program