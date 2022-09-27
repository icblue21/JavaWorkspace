package me.usefulClass.ch01;

// Practice Override of Object class toString() method
class Book{
    private String title;
    private String author;

    @Override
    public String toString() {
        return title + ", " + author;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;

    }
}
public class BookTest {
    public static void main(String[] args){

        Book book = new Book("데미안", "헤르만 헤세");

        System.out.println(book);

        String str = new String("test");
        System.out.println(str);

    }
}
