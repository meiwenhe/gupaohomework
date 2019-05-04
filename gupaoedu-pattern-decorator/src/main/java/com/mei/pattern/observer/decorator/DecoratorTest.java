package com.mei.pattern.observer.decorator;

public class DecoratorTest {

    public static void main(String[] args){
        IGradeReport gradeReport = new FourGradeReport();
        gradeReport.report();
        //原有的类可以使用，保证兼容性，当需要一种装饰器，只要添加上去就可以，不需要
        //的时候可以无缝拆卸
        System.out.println("\n\n以下是用最高分装饰");
        //将原有对象当作参数传入装饰器
        gradeReport = new HighScoreGradeReportDecorator(gradeReport);
        gradeReport.report();
        System.out.println("\n\n以下是用排名装饰");
        gradeReport = new SortGradeReportDecorator(gradeReport);
        gradeReport.report();
    }
}
