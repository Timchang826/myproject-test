package com.tim.Shop;

public class Shop {
    public static void main(String[] args) {
        Vipnormal one = new Vipnormal("0001",1000);
        Vipnormal two = new Vipnormal("0002",900);
        VipAg three = new VipAg("0003", 2000);
        one.print();
        two.print();
        three.print();
    }
}
