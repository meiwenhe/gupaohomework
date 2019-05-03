package com.mei.pattern.tempate.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JDBCTemplate {
    private DataSource dataSource ;
    public JDBCTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public List<?> executeQuery(String sql,IRowMapper rowMapper,Object[] objects){
        Connection connection = null;
        List list = null;
        try{
            //1.获取连接
            connection = dataSource.getConnection();
            //2.创建语句集
            PreparedStatement preparedStatement = createPrepareStatement(connection,sql);
            //3.执行语句
            ResultSet resultSet = executePreparedStatement(preparedStatement,objects);
            //4.处理结果集
            list = dealResultSet(resultSet,rowMapper);
            //5.关闭结果集
            clseResultSet(resultSet);
            //6.关闭语句集
            closePrepareStatement(preparedStatement);



        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                //7.关闭连接
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return list;
    }

    private void clseResultSet(ResultSet resultSet) throws SQLException {
        resultSet.close();
    }
    private void closePrepareStatement(PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.close();
    }

    private List dealResultSet(ResultSet resultSet, IRowMapper rowMapper) throws SQLException {
        List list = new ArrayList();
        int num = 1;
        while (resultSet.next()){
            list.add(rowMapper.mapper(resultSet,num++));
        }
        return list;
    }

    private ResultSet executePreparedStatement(PreparedStatement preparedStatement,Object[] objects) throws SQLException {
        for (int i=0;i<objects.length;i++){
            preparedStatement.setObject(i,objects[i]);
        }
        return preparedStatement.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection connection,String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }
}
