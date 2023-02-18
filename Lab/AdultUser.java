package com.company;

public  class AdultUser implements LibraryUser {
    int age;
    String bookType;

    public AdultUser(int age, String bookType){
        super();
        this.age = age;
        this.bookType = bookType;
    }
    public void registereAccount(){
        if(this.age >= 12){
            System.out.println("You have successfully registered under an adult account");
        }
        else{
            System.out.println("Sorry,age must be greater than 12 to registered as an adult");
        }
    }

    @Override
    public void registerAccount() {

    }

    public void requestBook(){
        if(this.bookType.equals("Fiction")){
            System.out.println("Book issued successfully please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }


}
