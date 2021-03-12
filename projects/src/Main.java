public class Main {
    public static void main(String[] args) {
        Loan loan = new Loan();//creating the objects requested
        Loan loan2;
        Loan loan3 = new Loan();
        loan2 = Loan.read();
        Loan.print(loan);
        Loan.print(loan2);
        Loan.print(loan3);

        Loan [] bank = new Loan[10];//created bank array
        for(int i = 0; i < bank.length; i++){ //asking the clients info (the remainder is calculated automatically on Loan's constructor)
            bank[i] = Loan.read();
        }
        for (Loan value : bank) { // printing the bank's elements
            Loan.print(value);
        }
        double max = Double.MIN_VALUE; //in order to get max value initializing the variable
        for (Loan value : bank) {
            if (value.getRemainder() > max) {    // if the max value is bigger than max, obviously becomes bank's max remainder value
                max = value.getRemainder();
            }
        }
       System.out.println("Max value is "+max+"!");

    }
}