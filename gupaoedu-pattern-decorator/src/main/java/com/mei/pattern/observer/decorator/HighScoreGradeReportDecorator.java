package com.mei.pattern.observer.decorator;

public class HighScoreGradeReportDecorator extends GradeReportDecorator {

    public  HighScoreGradeReportDecorator(IGradeReport gradeReport){
        super.GradeReportDecorator(gradeReport);
    }
    private  void highScore(){
        System.out.println("我班上语文最高分90，数学最高分80，英语最高分70");
    }
    public void report(){
        this.highScore();
        super.report();
    }

}
