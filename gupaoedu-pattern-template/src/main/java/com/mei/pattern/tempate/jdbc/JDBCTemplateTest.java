package com.mei.pattern.tempate.jdbc;

public class JDBCTemplateTest {
    public static void main(String[] args){
        MemberDao dao = new MemberDao(null);
        dao.selectAll();
    }
}
