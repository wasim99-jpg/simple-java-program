
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TestClass
{
      
    public static void main(String[] args)
        {
        
        String title=null;
        int yearpub=0;
        double price=0.00;
        String author=null;

        Scanner in = new Scanner(System.in);
        
        System.out.println("title? :");
        title = in.nextLine();
        
        System.out.println("author? :");
        author = in.nextLine();

        System.out.println("year publication? :");
        yearpub = in.nextInt();

        System.out.println("price? :");
        price = in.nextDouble();
        
        Book buku = new Book(title,yearpub,price,author);

        System.out.println(buku.display());

        }   
}
