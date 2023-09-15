public class BookProperties {
    public static void main(String[] args) {

        Book myBook = new Book();
        myBook.id=123456789;
        myBook.name="Programmers";
        myBook.description="This is one of the best classic books for beginners and will teach you all tricks and patterns of writing good and clean code.";
        myBook.author="Mahmud Bairamov";
        myBook.pageCount=850;
        myBook.makeComment();


        Book yourBook = new Book();
        myBook.id=345687458;
        myBook.name="Best Man";
        myBook.description="Look, I know I’m coming out of the gate strong with this one. But this list is arranged from newest to oldest, and anyway—trust me";
        myBook.author="Richard Peck";
        myBook.pageCount=666;
        myBook.makeComment2();

    }
}
