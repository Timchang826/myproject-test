package com.tim.Scoring;

public class NiceScoring {
    public static void main(String[] args) {
        Student jack=new Student("jack");
//      jack.name="Jack";
        jack.eng=100;
        jack.math=90;
        Student timmy=new Student("timmy",100,100);
        Student s = new Student();
        GraduateStudent jenny = new GraduateStudent("jenny",80,60,50);
        jack.print();
        timmy.print();
        s.print();
        jenny.print();
    }
}
