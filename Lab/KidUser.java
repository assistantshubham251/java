package com.company;

public class KidUser implements LibraryUser {
    int age;
    String bookType;

    public KidUser(int age, String bookType){
        super();
        this.age = age;
        this.bookType = bookType;
    }
    public void registerAccount(){
        if(this.age <= 12){
            System.out.println("You have successfully registered undrer a Kids Account");
        }
        else{
            System.out.println("Sorry, age must be less than 12 to registered as a kid ");
        }
    }
    public void requestBook(){
        if(this.bookType.equals("Kids")){
            System.out.println("Book issued successfully,please return the book within 10 days");
        }
        else{
            System.out.println("Oops,you are allow to take only kisd books");
        }
    }

}
