package BookMyShow;
import java.util.*;
public class BookMyShow {
      
    String emailid="";
    String pwd="";
    boolean login=false;
    int choice;
    String loc="";

    Scanner sc=new Scanner(System.in);

        public void signup()
        {
            System.out.println("Create an account");
            System.out.println("Enter the email id");
            emailid=sc.next();
            System.out.println("Enter your password");
            pwd = sc.next();
            System.out.println("=================");
        }

        public void login()
        {
            System.out.println("do you have an account ?? y/n");
            char accountexist=sc.next().charAt(0);

            if(accountexist == 'y' || accountexist == 'y')
            {
                System.out.println("Login with your details");
                System.out.println("Enter the email id");
                String confirmemailid=sc.next();
                System.out.println("Enter your password");
                String confirmpwd = sc.next();

                if(confirmemailid .equals(emailid) && confirmpwd .equals(pwd))
                {
                    System.out.println("login Sucessful");
                    login = true;
                    System.out.println("======================");
                }
                else{
                    System.out.println("password not correct");
                    login = false;
                    login();
                    System.out.println("========================");
                }
            }
            else if(accountexist == 'n' || accountexist == 'N')
            {
                signup();
                login();
            }
            else
            System.out.println("Please input with Y or N");

        }

        public void selection()
        {
            System.out.println("Enter the chioce");
            System.out.println("1 for monvies, 2 for comedy show, 3 for concerts");
            choice = sc.nextInt();
        }

        public String location(BookMyShow b)
        {
            if(b instanceof Movies)
            {
                Movies m=(Movies)b;
                System.out.println("Enter the city");
                System.out.println("Delhi, Chennai, Bangalore");
                loc=sc.next();
                return loc;
            }
            else if (b instanceof Comedy)
            {
                Comedy c=(Comedy)b;
                System.out.println("Enter the venue");
                System.out.println("Delhi, Gurugram, Ghaziabad");
                loc=sc.next();
                return loc;
            }
            return loc;
        }
    }

