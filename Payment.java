import java.util.Scanner;
public class Payment extends Booking{
    private String payment;

    public Payment(){
    }
    public Payment(String payment, double cost, String Availability, String Comfirmation){
        super(cost,Availability,Comfirmation);
        this.payment=payment;
    }
    public void setPaymentMethods(){
        Scanner sc = new Scanner (System.in);
        System.out.println(" Please choose payment method \n1.BANK ACCOUNT\n2.MOBILE");
        int choice = sc.nextInt();
        switch (choice){
            case 1: System.out.println("Bank Account Number is \n015638867900");
            break;
            case 2: System.out.println("Mobile number is \n+255778909750/+255678909030");
            break;
            default: System.out.println("invalid choice!");
        }
        this.payment=payment;
    }
    public String getPaymentMethods(){
        return payment;
    }
    
}