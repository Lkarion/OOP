package com.company;

public class Main {

    public static void main(String[] args) {
	Computer c1 = new Computer();
    c1.cpu="wqdqw";
    c1.ram=12122;
    c1.hdd=1212;
    c1.price=1256.21;
    Computer c2 = new Computer();
    c2.cpu="wkejf";
    c2.ram=54544;
    c2.hdd=3446;
    c2.price=235.2;
    Computer c3 = new Computer();
    c3.cpu="wödlfmw";
    c3.ram=2356;
    c3.hdd=14321;
    c3.price=1353.22;

    Computer[] arr = {c1,c2,c3};
        for (Computer comp: arr) {
            Computer.printInfo(comp);
        }


    Author author1 = new Author();
    author1.firstName="Ivan";
    author1.lastName="Ivanov";
    author1.yearOfBirth=1963;
    Book book1 = new Book();
    book1.title="Something";
    book1.author=author1;

    Book.printBook(book1);


    }

}
