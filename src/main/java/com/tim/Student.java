package com.tim;

public class Student {
    String name;
    int eng,math;
    public Student(String name){
        this.name=name;
    }
    public Student(String name,int eng,int math){
        this(name);
        this.eng=eng;
        this.math=math;
    }
    public Student(){
        this("john doe",-1,-1);
 //       name = "john doe";
 //       eng = -1;
 //       math = -1;
    }
    public void print(){
        System.out.println(name + "\t" + eng + "\t" + math);
    }

}
