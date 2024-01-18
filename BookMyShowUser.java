package BookMyShow;
public class BookMyShowUser {
    public static void main(String[] args)
    {

        BookMyShow b=new BookMyShow();
       
        System.out.println("Welcome in Book my Show");
        
        b.login();

        if(b.login == true)
        {
            b.selection();
            if(b.choice == 1)
            {
                b= new Movies();
                b.selection();
            }
        }
    }
}
