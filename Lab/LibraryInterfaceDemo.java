package com.company;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser ku1 = new KidUser(10, "kids");
        ku1.registerAccount();
        ku1.requestBook();
        KidUser ku2 = new KidUser(18, "Fiction");
        ku2.registerAccount();
        ku2.requestBook();
        AdultUser au1 = new AdultUser(5, "Kids");
        au1.registereAccount();
        au1.requestBook();
        AdultUser au2 = new AdultUser(23,"Fiction");
        au2.registereAccount();
        au2.requestBook();


    }
}
