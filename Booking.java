import java.util.Scanner;
public class Booking extends Information{
    private double cost;
    private String Availability;
    private String Comfirmation;
    public Booking(){
        
    }public Booking(double c,String av,String cmf){
        cost =c;
        Availability = av;
        Comfirmation =cmf;
    }
    public Booking(double cost, String Availability, String Comfirmation,String Address, String Nationality, String Email, String Name){
        super(Address,Nationality,Email,Name);
        this.cost=cost;
        this.Availability=Availability;
        this.Comfirmation=Comfirmation;
    }

    public void setCost(double amount){
        if (cost>=amount){
            this.cost=cost;
        }
        else{
            System.out.println("the cost not enough for booking");
        }
    }
    public double getCost(){
        return cost;
    }
    public void setAvailability(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Available rooms \n1.VIP\n2.ECONOMY");
        int choice=sc.nextInt();
        switch (choice){
            case 1: System.out.println("VIP room is available and its cost is \n$150 or TZS 250,000 per month");
            break;
            case 2: System.out.println("ECONOMY room is available and its cost is \n$50 or TZS 100,000 per month");
            break;
            default: System.out.println("Invalid Choice! ");
        }

        this.Availability=Availability;
    }
    public String getAvailability(){
        return Availability;
    }
    public void setComfirmation(String Comfirmation){
        this.Comfirmation=Comfirmation;
    }
    public String getComfirmation(){
        return Comfirmation;
    }
    public String ToBooking(){
        return "Costs is "+getCost()+"the Space available "+getAvailability()+" "+getComfirmation(); 
    }

}