package com.board.www;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class SettingTest {
	
	@Autowired
	DataSource ds;
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testDBConnection() {
		testDataSource();
		testSqlSessionFactoryAndSqlSession();
	}
	
	@Test
	@Ignore
	public void testDataSource() {
		System.out.println("Test Start\n");
		try(Connection con = ds.getConnection()){
			System.out.println("connection >> "+ds);
			System.out.println("DataSource Connection Sucess");
		} catch(Exception e) {
			System.out.println("Connection failed"+e.toString());
		}
		
	}
	
	@Test
	@Ignore
	public void testSqlSessionFactoryAndSqlSession() {
		System.out.println("\nsqlSessionFactory >> "+sqlSessionFactory+"\n");
		
		try(SqlSession session = sqlSessionFactory.openSession()){
			System.out.println("SqlSession >> "+session+"\n");
		}
		
	}

}
