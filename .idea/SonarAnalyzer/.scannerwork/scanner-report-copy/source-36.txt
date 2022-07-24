package com.designpattern.creational.builder.examParameterClass;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int scienceMarks;
    private int mathMarks;

    private String name;

    public UserExam(final UserExamParameter parameter){
        if (parameter.getEnglishMarks() > 100 || parameter.getMathMarks() > 100 || parameter.getScienceMarks() > 100) {
            throw new InvalidParameterException("Marks Cannot be greater than 100.");
        }
        this.englishMarks = parameter.getEnglishMarks();
        this.mathMarks = parameter.getMathMarks();
        this.scienceMarks = parameter.getScienceMarks();
        this.name = parameter.getName();
    }

    @Override
    public String toString() {
        return "Name : "  +  this.name + ", English : " + this.englishMarks + ", Science : "+ this.scienceMarks + ", Math : " + this.mathMarks;
    }
}
