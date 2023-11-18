package part2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("a1", "a2");
        Book book1 = new Book("title1", 1000, a1);
        Book book3 = new Book("title1", 1000, a1);
        Book book2 = new Book("title2", 2022, new Author("a3", "a4"));

        System.out.println(book1);
        System.out.println(book1.getTitle() + " - " + book1.getAuthor().getFirstName()
                           + " " + book1.getAuthor().getLastName() + ". " + book1.getYear());

        System.out.println(book1.getTitle() + " - " + a1.getFirstName()
                           + " " + a1.getLastName() + ". " + book1.getYear());

        System.out.println(book1);
        System.out.println(book1.getYear());
        book1.setYear(9112);
        System.out.println(book1.getYear());

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}
