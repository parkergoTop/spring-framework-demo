package com.parker.spring5;

public class Book {



    private String bname;
    private String author;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void testDemo(){
        System.out.println(bname);
    }
}
