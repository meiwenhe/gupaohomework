package com.mei.pattern.observer.decorator;

public class SortGradeReportDecorator extends GradeReportDecorator {
    public  SortGradeReportDecorator(IGradeReport gradeReport){
        super.GradeReportDecorator(gradeReport);
    }
    private  void sortReport(){
        System.out.println("我的语文全班排名18，数学排名28，英语排名38");
    }
    public void report(){
        this.sortReport();
        super.report();
    }

}
