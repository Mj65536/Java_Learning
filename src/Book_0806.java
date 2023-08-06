public class Book_0806
{
    private String bookname;
    private String author;
    private Double price;

    public String getBookname()
    {
        return bookname;
    }

    public void setBookname(String bn)
    {
        bookname = bn;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String a)
    {
        author = a;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double p)
    {
        price = p;
    }

    public String showInfo()
    {
        return "bookname="+bookname+",author"+author+",price="+price;
    }


}
