package com.tim;

public class NiceScoring {
    public static void main(String[] args) {
        Student jack=new Student("jack");
//        jack.name="Jack";
        jack.eng=100;
        jack.math=90;
        Student timmy=new Student("timmy",100,100);
        Student s = new Student();
        jack.print();
        timmy.print();
        s.print();
    }
}
