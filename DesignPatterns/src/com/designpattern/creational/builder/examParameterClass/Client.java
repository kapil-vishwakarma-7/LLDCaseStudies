package com.designpattern.creational.builder.examParameterClass;

public class Client {
    public static void main(String[] args) {

        //
        UserExamParameter parameter = new UserExamParameter();
        parameter.setMathMarks(100);
        parameter.setEnglishMarks(120);
        parameter.setScienceMarks(60);
        parameter.setName("Kapil Vishwakarma");
        UserExam userExam = new UserExam(parameter);

        System.out.println(userExam.toString());
    }
}
