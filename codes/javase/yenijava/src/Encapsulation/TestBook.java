package Encapsulation;

public class TestBook {
    public static void main(String[] args) {

        Book book=new Book("Programming Book","\nJames Gossling");
        System.out.println(book.getTitle()+" "+book.getAuthor());

    }
}
