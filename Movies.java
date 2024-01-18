package BookMyShow;
import java.util.*;
public class Movies extends BookMyShow {
     int amount, seatqty, popcornqty, cokeqty, nachosqty,qty;
     String moviename, seattype, popcorntype, nachoatype="", coketype;

    Scanner sc=new Scanner (System.in);
     
    public void selection()
    {
        selectMovie();
        seatSelection();
        Addons();

        System.out.println("Enjoy watching" +moviename+"Movie");
        System.out.println("Booking Details");
        System.out.println("-----------------");
        System.out.print("movie name           : "+moviename);
        System.out.println("seat type            : "+seatqty + "*"+seattype);
        System.out.println("popcorn                : "+ popcornqty+"*"+popcorntype);
        System.out.println("Coke           : "+cokeqty+"*"+coketype);
        System.out.println("Nachos            : "+nachosqty+"*"+nachoatype);
        System.out.println("the total amount of booking is "+amount);

    }

    public void selectMovie()
    {
        String loc =location(new Movies());
        if(loc.equalsIgnoreCase("Delhi"))
        {
    System.out.println("Enter the language choice");
    System.out.println("Enter 1 for English, 2 for hindi, 3 for panjabi, 4 kannada");
    int choice =sc.nextInt();
    if(choice == 1)
    {
        System.out.println("Select the english movie");
        englishMovies();
    }
    else if(choice == 2)
    {
        System.out.println("Select the hindi movie");
         hindimovies();
    }
    else if(choice == 3)
     {
        System.out.println("Select the panjabi movie");
        panjabiMovies();
     }

     else if(choice == 4)
     {
        System.out.println("Select the kannada movie");
        kannadaMovies();
     }
     else{
        System.out.println("Invalid Choice/ re-enter");
        selectMovie();
     }

    }

    else if(loc.equalsIgnoreCase("Bangalore"))
    {
   System.out.println("Enter the language choice");
    System.out.println("Enter 1 for English, 2 for hindi, 3 for panjabi, 4 kannada");
    int choice =sc.nextInt();
    if(choice == 1)
    {
        System.out.println("Select the english movie");
        englishMovies();
    }
    else if(choice == 2)
    {
        System.out.println("Select the hindi movie");
         hindimovies();
    }
    else if(choice == 3)
     {
        System.out.println("Select the panjabi movie");
        panjabiMovies();
     }

     else if(choice == 4)
     {
        System.out.println("Select the kannada movie");
        kannadaMovies();
     }
     else{
        System.out.println("Invalid Choice/ re-enter");
        selectMovie();
     }
    }
    else if(loc.equalsIgnoreCase("Channi"))
    {
        System.out.println("Enter the language choice");
    System.out.println("Enter 1 for English, 2 for hindi, 3 for panjabi, 4 kannada");
    int choice =sc.nextInt();
    if(choice == 1)
    {
        System.out.println("Select the english movie");
        englishMovies();
    }
    else if(choice == 2)
    {
        System.out.println("Select the hindi movie");
         hindimovies();
    }
    else if(choice == 3)
     {
        System.out.println("Select the panjabi movie");
        panjabiMovies();
     }

     else if(choice == 4)
     {
        System.out.println("Select the kannada movie");
        kannadaMovies();
     }
     else{
        System.out.println("Invalid Choice/ re-enter");
        selectMovie();
     }
    }
}
  public void hindimovies()
  {
     System.out.println("Select the movie");
        
        System.out.println("press 1 for jawan");
        System.out.println("press 2 for furkey ");
        System.out.println("press 3 for tiger-3");

         int movie =sc.nextInt();

         if(movie == 1)
        {
            System.out.println("Enjoy watching jawan");
        }
        else if(movie == 2)
        {
            System.out.println("Enjoy watching furkey");
        }
        else if(movie == 3)
        {
            System.out.println("Enjoy watching tiger-3");
        }
        else
        {
            System.out.println("give proper selection");
            hindimovies();
        }
  }

  public void englishMovies()
  {
      System.out.println("Select the movie");
        System.out.println("press 1 for fast-x");
        System.out.println("press 2 for barbie");
        System.out.println("press 3 for oppenheimer");

        int movie =sc.nextInt();

        if(movie == 1)
        {
            System.out.println("Enjoy watching fast-x");
        }
        else if(movie == 2)
        {
            System.out.println("Enjoy watching barbie");
        }
        else if(movie == 3)
        {
            System.out.println("Enjoy watching oppenheimer");
        }
        else
        {
            System.out.println("give proper selection");
            englishMovies();
        }
  }

  public void panjabiMovies()
  {
      System.out.println("Select the movie");
        System.out.println("press 1 for Angrej");
        System.out.println("press 2 for Qismat");
        System.out.println("press 3 for Ardass Karaan");

        int movie =sc.nextInt();

        if(movie == 1)
        {
            System.out.println("Enjoy watching Angrej");
        }
        else if(movie == 2)
        {
            System.out.println("Enjoy watching Qismat");
        }
        else if(movie == 3)
        {
            System.out.println("Enjoy watching Ardass Karaan");
        }
        else{
            System.out.println("Enter proper selection");
            panjabiMovies();
        }
  }

  public void kannadaMovies()
  {
      System.out.println("Select the movie");
        System.out.println("press 1 for Ganpath");
        System.out.println("press 2 for Old Monk");
        System.out.println("press 3 for James");

        int movie =sc.nextInt();

        if(movie == 1)
        {
            System.out.println("Enjoy watching Ganpathi");
        }
        else if(movie == 2)
        {
            System.out.println("Enjoy watching Old Monk");
        }
        else if(movie == 3)
        {
            System.out.println("Enjoy watching James");
        }
        else{
            System.out.println("Enter proper selection");
            kannadaMovies();
        }
  }

  public void seatSelection()
  {
    System.out.println("Enter the type of seat");
    System.out.println("1 for normal 200rs");
    System.out.println("2 for executive 300rs");
    System.out.println("3 for recliner 600rs");

    int n=sc.nextInt();

    int seatqty=sc.nextInt();

    if(n == 1)
    {
     amount=amount +(seatqty*200);
     System.out.println("amount of normal seats"+ amount);
     seattype="Normal";
    }
    else if (n==2)
    {
        amount=(amount)+(seatqty * 300);
        System.out.println("amount of executive seats"+ amount);
        seattype="Executive";
    }
    else if(n==3)
    {
        amount=amount+ (seatqty*600);
        System.out.println("amount of recliner seats"+ amount);
        seattype="Recliner";
    }
    else
    {
        System.out.println("Enter correct input");
        seatSelection();
    }
  }
 public void Addons()
 {
    System.out.println("Do you want addons?  1 for yes, 2 for no");

    int add=sc.nextInt();
    if(add == 1){
        System.out.println("Choose your addon 1 for pop corn, 2 for soft drink, 3 for snakes");

        int pop=sc.nextInt();
        if(pop == 1)
        {
            System.out.println("1 for small 70rs");
            System.out.println("2 for large 120rs ");
            System.out.println("3 for x-large");

            int n=sc.nextInt();
            System.out.println("Enter the quantity");
            int qty=sc.nextInt();
            if(n==1)
            {
              amount += 70*qty;
              System.out.println("for " + qty + "total amount is" + amount);
            }
            else if(n==2){
                amount += 120*qty;
                 System.out.println("for " + qty + "total amount is" + amount);
            }
            else if(n==3){
                amount += 150*qty;
                 System.out.println("for " + qty + "total amount is" + amount);
            }
            else{
                System.out.println("have a nice day");
            }
        }

        if(pop == 2)
        {
             System.out.println("choice your type of soft drink");
           System.out.println("1 for small 70rs");
            System.out.println("2 for large 120rs ");
            System.out.println("3 for x-large");

            int n=sc.nextInt();
            System.out.println("Enter the quantity");
            int qty=sc.nextInt();
            if(n==1)
            {
              amount += 70*qty;
            }
            else if(n==2){
                amount += 120*qty;
                 System.out.println("for " + qty + "total amount is" + amount);
            }
            else if(n==3){
                amount += 150*qty;
                 System.out.println("for " + qty + "total amount is" + amount);
            }
            else{
                System.out.println("have a nice day");
            }
        }

        if(pop == 3)
        {
            System.out.println("choice your type of snakes pack");
            System.out.println("1 for small 70rs");
            System.out.println("2 for large 120rs ");
            System.out.println("3 for x-large");

            int n=sc.nextInt();
            System.out.println("Enter the quantity");
            int qty=sc.nextInt();
            if(n==1)
            {
              amount += 70*qty;
               System.out.println("for " + qty + "total amount is" + amount);
            }
            else if(n==2){
                amount += 120*qty;
                 System.out.println("for " + qty + "total amount is" + amount);
            }
            else if(n==3){
                amount += 150*qty;
                 System.out.println("for " + qty + "total amount is" + amount);
            }
            else{
                System.out.println("have a nice day");
            }
        }
    }

    if(add == 2)
    {
        System.out.println("Have a nice day");
    }
 }

}
