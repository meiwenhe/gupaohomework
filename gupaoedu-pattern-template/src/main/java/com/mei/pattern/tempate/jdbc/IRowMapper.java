package com.mei.pattern.tempate.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IRowMapper<T> {
    T mapper(ResultSet resultSet,int num) throws SQLException;
}
