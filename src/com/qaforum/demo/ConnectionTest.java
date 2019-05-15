package com.qaforum.demo;

import java.sql.Connection;
import java.sql.SQLException;

import com.qaforum.utils.ConnectionUtils;

public class ConnectionTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionUtils.getConnection();
		System.out.println(conn);
	}
}
