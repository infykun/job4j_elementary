package ru.job4j.pojo;

import javax.xml.namespace.QName;

public class Library {
    public static void main(String[] args) {
        Book asm = new Book("Asm", 1000);
        Book java = new Book("Java", 500);
        Book cpp = new Book("cpp", 100);
        Book cc = new Book("Clean code", 200);
        Book[] books = new Book[4];
        books[0] = asm;
        books[1] = java;
        books[2] = cpp;
        books[3] = cc;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getSize());
        }
        Book tmp = books[3];
        books[3] = books[0];
        books[0] = tmp;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getName() + " - " + books[index].getSize());
        }
        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                System.out.println(books[index].getName() + " - " + books[index].getSize());
            }
        }
    }
}
