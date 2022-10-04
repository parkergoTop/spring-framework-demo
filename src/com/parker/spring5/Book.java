package com.parker.spring5;

public class Book {



    private String bname;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public static void main(String[] args){
        Book book = new Book();
        book.setBname("abc");
    }


    public void testDemo(){
        System.out.println(bname);
    }
}
