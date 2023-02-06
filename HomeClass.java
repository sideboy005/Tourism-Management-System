import java.util.Scanner;
public class HomeClass{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Information info=new Information();
        Booking book=new Booking();
        Payment pay = new Payment();
        int Choice;
        System.out.println("Welcome to our Tourisim Management System \n in this Systeme we can Allow you to enter your information\n and declear other information provided by Administrator \n \t \t \tTHANK YOU \n please \n1.enter your information");
        Choice=sc.nextInt();
        switch(Choice){
            case 1:info.setName();
                info.setAddress();
                info.setEmail();
                info.setNationality();
                System.out.println(info.ToInfo());
                book.setAvailability();
                pay.setPaymentMethods(); 
        }

    }
    
}