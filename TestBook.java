public class TestBook{
public static void main(String[] args){
    Author au1 = new Author("DinhHoang", "Dhoang@gmail.com", 'h');
    System.out.println(au1.toString());
    
    Book b1 = new Book("Java for me", au1, 19.95, 99);
    System.out.println(b1);

    b1.setPrice(25.05);
    b1.setQty(28);
    System.out.println("Name is: " + b1.getName());
    System.out.println("Price is: " + b1.getPrice());
    System.out.println("Qty is: " + b1.getQty());
    System.out.println("Author is: " + b1.getAuthor());
    System.out.println("Author's name is: " + b1.getAuthor().getName());
    System.out.println("Author's email is: " + b1.getAuthor().getEmail());


    Book ao1 = new Book("more Java", new Author("dh","dh@gmail.com", 'h'), 29.95);
    System.out.println(ao1);


    }
}