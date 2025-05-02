class Bank {    
    static class Transaction {
        void process() {
            System.out.println("Transaction Successful.");
        }
    }
}

class nestedClass1 {
    public static void main(String[] args) {
        Bank.Transaction obj = new Bank.Transaction();
        obj.process(); 
    }
}
