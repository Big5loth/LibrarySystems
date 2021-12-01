//very cringe code,bing quilin, -1000 social credit
//i kid,  it aight
package com.company;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    private static File myFile = new File("LibrarbyBooks.txt");
    private static ArrayList<String> bookDetails = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many books do you want to add?");
        int numberOfBooks = s.nextInt();
        for (int i = 0; i < numberOfBooks; i++) {
            bookDetails.add(getBookDetails());
        }
        System.out.println(bookDetails);
    }

    public static String getBookDetails() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Book Title, ISBN, Author, and Genre. (In that order)> ");
        String bookTitle = s.next();
        String ISBN = s.next();
        String author = s.next();
        String genre = s.next();
        return (bookTitle + "," + ISBN + "," + author + "," + genre + ",");
    }

    public static void makeFile() {
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred" + e);
        }
    }
}
