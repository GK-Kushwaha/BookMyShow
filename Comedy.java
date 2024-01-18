package BookMyShow;

public class Comedy extends BookMyShow{
    int Amount;
    String seattype="";
    
    public void Comedy()
    {
      System.out.println("Select Comedy Show");
      System.out.println("1 for Bassi");
      System.out.println("2 for Gaurav");
      System.out.println("3 for Akash Gupta");

      int c=sc.nextInt();
      if(c==1)
      {
        System.out.println("Enjoy Show of 'Bassi'");
      }
      else if(c == 2)
      {
        System.out.println("Enjoy the show of 'Gaurav'");
      }
      else if(c == 3)
      {
        System.out.println("Enjoy the Show of 'Akash Gupta");
      }
      else
      {
        System.out.println("Invalid Choice");
      }
    }

    public void Noida()
    {
        System.out.println("Select comedy show in Noida");
        System.out.println("Select 1 for Munavrana");
        System.out.println("Select 2 for Zakir");

        int n=sc.nextInt();
        if (n==1)
        {
            System.out.println("Enjoy Show of Munavrana");
        }
        else if (n==2)
        {
            System.out.println("Enjoy Show of Zakir");
        }
        else{
            System.out.println("Invalid Choice");
        }
    }

    public void Gurugram()
    {
        System.out.println("Select Show of Gurugram");
        System.out.println("Select 1 for Bhuvan Bam");
        System.out.println("Select 2 for Gaurav Kapoor");

        int g=sc.nextInt();

        if(g == 1)
        {
            System.out.println("Enjoy Show of Bhuvan Bam");
        }
        else if(g == 2)
        {
             System.out.println("Enjoy Show of Gaurav Kapoor");
        }
    }

    public void Bookseat()
    {
        System.out.println("Enter the type of seat");
        System.out.println(" Select 1 for VIP 2000rs");
        System.out.println("Select  2 for executive 1500rs");
        System.out.println("Select 2 for normal 999rs");
        System.out.println("Select 4 for stands 500rs");

        int n=sc.nextInt();

        int seatno =sc.nextInt();

        if(n ==1)
        {
          Amount=Amount+(seatno*2000);
          System.out.println("Amount for VIP seats"+ Amount);
          seattype="VIP";
        }
        else if(n == 2)
        {
            Amount=Amount+(seatno*1500);
            System.out.println("Amount for Executive seats"+ Amount);
            seattype="Executive";
        }
        else if(n == 3)
        {
            Amount=Amount+(seatno*999);
            System.out.println("Amount for Normal seats"+ Amount);
            seattype="Normal";
        }
        else if(n == 4)
        {
            Amount=Amount+(seatno*500);
            System.out.println("Amount for Stands "+Amount);
            seattype="Stands";
        }
    }

    public void Addons()
    {
        System.out.println("Do you like order addons ? 1 for 'Y'/ 2 for 'N' ");
        int add=sc.nextInt();
        if (add==1)
        {
            System.out.println("Chose your addons, 1 for popcorn , 2 for coke, 3 for Whishky");

            int ad=sc.nextInt();
            if(ad == 1)
            {
                System.out.print("Select your popcorn, Please");
              System.out.println("Select 1 for small");
              System.out.println("Select 2 for large");
              System.out.println("Select 3 for x-large");
              int size=sc.nextInt();
              if(size==1){
                System.out.println("Enjoy your small size popcorn. Sir!");
              }
              else if(size==2){
                System.out.println("Enjoy your Large size popcorn. Sir!");
            }
            else if(size == 3){
                System.out.println("Enjoy your X-Large size popcorn. Sir!");
        }
    }
    else if(ad == 2)
    {
      System.out.print("Select your Coke, Please");
      System.out.println("Select 1 for small");
      System.out.println("Select 2 for large");
      System.out.println("Select 3 for x-large");

      int size=sc.nextInt();
              if(size==1){
                System.out.println("Enjoy your small size popcorn. Sir!");
              }
              else if(size==2){
                System.out.println("Enjoy your Large size popcorn. Sir!");
            }
            else if(size == 3){
                System.out.println("Enjoy your X-Large size popcorn. Sir!");
    }
}

  else if (ad==3)
  {
    System.out.println("Select your pack, please");
    System.out.println("Select 1 for 50ml");
    System.out.println("Select 2 for 75ml");
    System.out.println("Select 3 for 100ml");
    int size=sc.nextInt();
    if(size==1){
        System.out.println("Enjoy your 50ml whiskey. Sir!");
    }
    else if(size==2){
        System.out.println("Enjoy your 75ml whiskey. Sir!");
    }
    else if(size == 3){
        System.out.println("Enjoy your 100ml whiskey. Sir!");
    }
    else{
        System.out.println("Invalid selection! Try again.");
    }
  }

    }
}
}

