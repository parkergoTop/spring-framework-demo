package com.parker.spring5;

public class Order {

    /*
    使用有参数的constructor
     */

    private String oName;
    private String address;

    public Order(String oName, String address){
        this.oName = oName;
        this.address=address;
    }

    public void printOrder(){
        System.out.println(oName + "" +address );
    }
}
