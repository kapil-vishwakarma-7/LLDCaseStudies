package com.designpattern.creational.builder.examBuilderClass;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int scienceMarks;
    private int mathMarks;
    private String name;

    private UserExam(UserExamBuilder userExamBuilder){
        this.englishMarks = userExamBuilder.getEnglishMarks();
        this.scienceMarks = userExamBuilder.getScienceMarks();
        this.mathMarks = userExamBuilder.getEnglishMarks();
        this.name = userExamBuilder.getName();
    }

    @Override
    public String toString() {
        return "Name : "  +  this.name + ", English : " + this.englishMarks + ", Science : "+ this.scienceMarks + ", Math : " + this.mathMarks;
    }

    public static UserExamBuilder getBuilder(){
        return new UserExamBuilder();
    }


     static class UserExamBuilder {
        private int englishMarks;
        private int scienceMarks;
        private int mathMarks;
        private String name;

        public int getEnglishMarks() {
            return englishMarks;
        }

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public int getScienceMarks() {
            return scienceMarks;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public int getMathMarks() {
            return mathMarks;
        }

        public UserExamBuilder setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
            return this;
        }

        public String getName() {
            return name;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build(){
            if (this.getEnglishMarks() > 100 || this.getMathMarks() > 100 || this.getScienceMarks() > 100) {
                throw new InvalidParameterException("Marks Cannot have more than 100.");
            }
            return new UserExam(this);
        }
    }
}
