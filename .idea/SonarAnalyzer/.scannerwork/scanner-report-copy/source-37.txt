package com.designpattern.creational.builder.examBuilderClass;

public class Client {
    public static void main(String[] args) {
        UserExam userExam1 = UserExam.getBuilder()
                .setName("Kapil ")
                .setEnglishMarks(100)
                .setScienceMarks(100)
                .setMathMarks(90)
                .build();
        System.out.println(userExam1);
    }
}
