import java.util.Scanner;

class Account {
    int bal;

    Account(int b) {
        bal = b;
    }

    boolean isSufficientBal(int w) {
        return bal > w;
    }

    void withdraw(int amt, String name) {
        bal = bal - amt;
        System.out.println(name + " Transaction Successful!");
        System.out.println(name + " Current Balance is: " + bal);
    }
}

class Customer implements Runnable {
    String name;
    Account acc;

    Customer(Account a, String n) {
        acc = a;
        name = n;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        synchronized (acc) {
            System.out.print("Enter amount to withdraw for " + name + ": ");
            int amt = sc.nextInt();

            if (acc.isSufficientBal(amt)) {
                acc.withdraw(amt, name);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }
}

public class ThreadSyn {
    public static void main(String[] args) {
        Account a1 = new Account(5000);

        Customer c1 = new Customer(a1, "Akshay");
        Customer c2 = new Customer(a1, "Sumit");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
