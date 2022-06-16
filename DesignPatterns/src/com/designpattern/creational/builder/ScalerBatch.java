package com.designpattern.creational.builder;

import java.util.List;

/**
 *  We want to have some validation before creating the object
 *      1. Batch Must have a type of Batch
 *      2. batchName should be unique
 *      3.
 */
public class ScalerBatch {
    private String batchName;
    private List<Student> studentList;
    private BatchType batchType;
    private Course course;

    public ScalerBatch(final Parameter parameter){

    }
}

class Parameter{
    private String batchName;
    private List<Student> studentList;
    private BatchType batchType;
    private Course course;

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public BatchType getBatchType() {
        return batchType;
    }

    public void setBatchType(BatchType batchType) {
        this.batchType = batchType;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

class Student {

}

class Session {

}

class Course{

}

enum BatchType {
    BEGINNER,
    INTERMEDIATE,
    ADVANCE
}