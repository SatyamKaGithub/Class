/*
Write a java code to demonstrate polymorphism by creating a class BANK and a method Home_Loan_Int_Rate() which will be overridden by four derived classes ICICI(8.98%), SBI(7.61%), UBI(9%) AND UNION (8.02%). Calculate loan interest for amount 90000.
* */
class Bank {
    public void homeLoanIntRate() {
        System.out.println("Generic home loan interest rate is not specified for this bank.");
    }
}

class ICICI extends Bank {
    @Override
    public void homeLoanIntRate() {
        System.out.println("ICICI Bank home loan interest rate: 8.98%");
    }
}

class SBI extends Bank {
    @Override
    public void homeLoanIntRate() {
        System.out.println("SBI Bank home loan interest rate: 7.61%");
    }
}

class UBI extends Bank {
    @Override
    public void homeLoanIntRate() {
        System.out.println("UBI Bank home loan interest rate: 9%");
    }
}

class Union extends Bank {

    @Override
    public void homeLoanIntRate() {
        System.out.println("Union Bank home loan interest rate: 8.02%");
    }
}

class PolymorphismDemo {
    public static void main(String[] args) {
        Bank icici = new ICICI();
        Bank sbi = new SBI();
        Bank ubi = new UBI();
        Bank union = new Union();
        icici.homeLoanIntRate();
        sbi.homeLoanIntRate();
        ubi.homeLoanIntRate();
        union.homeLoanIntRate();
        double loanAmount = 90000;
        System.out.println("ICICI: " + (loanAmount * 8.98 / 100));
        System.out.println("SBI: " + (loanAmount * 7.61 / 100));
        System.out.println("UBI: " + (loanAmount * 9 / 100));
        System.out.println("Union: " + (loanAmount * 8.02 / 100));
    }
}
