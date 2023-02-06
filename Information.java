import java.util.Scanner;
public class Information{
    private String Name;
    private String Address;
    private String Nationality;
    private String Email;
    public Information(){

    }
    public Information(String Address, String Nationality, String Email, String Name){
        this.Name=Name;
        this.Address=Address;
        this.Nationality=Nationality;
        this.Email=Email;
    }
    public void setName(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String Name=sc.nextLine();
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public void setAddress(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Address");
        String Address=sc.nextLine();
        this.Address=Address;
    }
    public String getAddress(){
        return Address;
    }
    public void setEmail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your email");
        String Email=sc.nextLine();
        this.Email=Email;
    }
    public String getEmail(){
        return Email;
    }
    public void setNationality(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Nationality ID");
        String Nationality=sc.nextLine();
        this.Nationality=Nationality;
    }
    public String getNationality(){
        return Nationality;
    }
    public String ToInfo(){
        return "The Tourist name is " +getName() +"\nThe Address is "+getAddress()+"\nThe Nationality is " +getNationality()+"\nEmail is "+getEmail();
    }
}