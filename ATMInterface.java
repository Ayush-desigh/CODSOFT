  import java.util.*;
  
  public class ATMInterface 
  {

    private int balance=1000;
    private Scanner sc=new Scanner(System.in);

    public void run ()
    {
        while (true) 
        {
            System.out.println("//ATM INTEFACE//");   
            System.out.println("Press 1 for checking  Your total bank balance");
            System.out.println("Press 2 for Withdraw Cash");
            System.out.println("Press 3 for Deposit Cash");
            System.out.println("Press 4 for Exit");

            System.out.println("Please Enter your choice for further move...");
            int choice=sc.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                    case 2:
                    WithdrawCash();
                    break;
                    case 3:
                    depositCash();
                    break;
                    case 4:
                    System.out.println("Succesfully Exixting...");
                    return;
                default:
                System.out.println("Invalid choice ! please Try Again...");
            }

            }
            
            
            
        }

        private void checkBalance()
        {
            System.out.println("\n Your current balance is :"+balance);
        }


        private void WithdrawCash()
        {
            System.out.println("\n Enter The amount of withdraw: ");
            int amount=sc.nextInt();

            if(amount>balance)
            {
                System.out.println("Insufficient Funds ! please try again...");

            }
            else{
                balance -=amount;
                System.out.println("\n Withdraw Successful. Your balance is: +balance");

            }
        }

        private void depositCash()
        {
            System.out.println("\n Enter the amount to depost:");
            int amount=sc.nextInt();
            balance +=amount;
            System.out.println("Deposit successful. your balance is :"+balance);

        }

        public static void main(String[] args) {
            ATMInterface atm=new ATMInterface();
            atm.run();
        }


    }

