package com.mei.pattern.tempate.simple;

public class TemplateTest {
    public static void main(String[] args){
        CourseTemplate courseTemplate = new JavaCourse();
        courseTemplate.createCourse();

        courseTemplate = new CCourse();
        courseTemplate.createCourse();
    }
}
