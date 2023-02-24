package books;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            bookList.add(new Book(title, pages, year));
        }
        System.out.println("");

        System.out.print("What information will be printed? ");
        String answerInput = scanner.nextLine();
        if (answerInput.equals("everything")) {
            for (Book book : bookList) {
                System.out.println(book);
            }
        }

        if (answerInput.equals("name")) {
            for (Book book : bookList) {
                System.out.println(book.getTitle());
            }
        }
    }
}
