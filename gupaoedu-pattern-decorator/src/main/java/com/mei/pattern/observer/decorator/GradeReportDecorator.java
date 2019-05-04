package com.mei.pattern.observer.decorator;

public abstract class GradeReportDecorator implements IGradeReport{
    private IGradeReport gradeReport;//一定需要只想目标对象的引用
    public void GradeReportDecorator(IGradeReport gradeReport){
        this.gradeReport = gradeReport;
    };
    public void report(){
        gradeReport.report();
    }
    public void sign(String name){
        gradeReport.sign(name);
    }
}
