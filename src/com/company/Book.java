package com.company;

public class Book {
    //2.
    //Make class Book. It should contain two fields: author and title. The author is a Class with the
    // following field firstName, lastName, yearOfBirth. Implement the method of printing the Book
    Author author;
    String title;

    public static void printBook(Book book){
        System.out.println("Book title is "+book.title+
                             "\nAuthor is "+book.author.firstName+" "+
                                            book.author.lastName+", "+
                                            book.author.yearOfBirth);
    }
}
