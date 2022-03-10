package com.cerner.demo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is soumen");
        Student obj1= Student.getInstance();
        Student obj2= Student.getInstance();
        Student obj3= Student.getInstance();

    }

}

class Student{

    static  Student st=new Student();

    private Student(){
        System.out.println("This is from Private constructor from Student class");

    }
    public static Student getInstance(){
        return st;
    }

}
