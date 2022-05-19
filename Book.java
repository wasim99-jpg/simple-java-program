

public class Book
{
    // instance variables
    private String title;
    private int yearpub;
    private double price;
    private String author;
    

    //constructor have parameter
    public Book(String t,int y,double p,String a)
    {
        title = t;
        yearpub = y;
        price = p;
        author = a;
    }
    
    //setter
    public void setTitle(String t)
    {
        title = t;
    }
    
    public void setYearpub(int y)
    {
        yearpub = y;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    public void setAuthor(String a)
    {
        author = a;
    }
    
    //return OR getter
    public String getTitle()
    {
        return title;
    }
    
    public int getYearpub()
    {
        return yearpub;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String display()
    {
        return "\nBook title :"+getTitle()+"\nYear Published :"+getYearpub()+"\nBook Price :"+getPrice()+"\nAuthor :"+getAuthor();
    }
}


