package com.board.www;

import java.sql.Connection;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.board.www.dao.mapper.PostMapper;
import com.board.www.dto.PostVO;

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
	
	@Autowired
	PostMapper postMapper;
	
	@Test @Ignore
	public void testDeleteMapper() {
		selectPost(3);
		postMapper.deletePost(3);
		selectPost(3);
	}
	
	@Test @Ignore
	public void testUpdateMapper() {
		PostVO post = new PostVO();
		post.setPostId(3);
		post.setTitle("수정된 타이틀");
		post.setContents("수정된 내용");
		boolean sucess = postMapper.updatePost(post);
		System.out.println("sucess : "+sucess);
		selectPost(3);
		post.setTitle("타이틀");
		post.setContents("내용");
		sucess = postMapper.updatePost(post);
		System.out.println("sucess : "+sucess);
		selectPost(3);
	}
	@Test@Ignore
	public void testInserMapper() {
		PostVO post = new PostVO();
		post.setUserLoginId("test");
		post.setTitle("inser mapper test");
		post.setContents("~~testContents~~");
		boolean sucess = postMapper.insertPost(post);
		System.out.println(sucess);
		testSelectPostList();
	}
	
	@Test //@Ignore
	public void testSelectPostList() {
		System.out.println("Hello");
		List<PostVO> postList = postMapper.selectPostList();
		System.out.println("postList size : "+postList.size());
		if(postList.size()>0) {
			System.out.println("=========");
			for (PostVO postVO : postList) {
				System.out.println(postVO.toString());
				System.out.println("===============");
			}
		}
		else {
			System.out.println("PostList Size < 0");
			
		}
	} 
	@Test @Ignore
	public void testSelectPost() {
		selectPost(3);
	}
	public void selectPost(int i) {

		System.out.println("SELECT ~~~~ WHERE postId="+i+";");
		PostVO post = postMapper.selectPost(i);
		if(post!=null) {
			System.out.println(post);
			System.out.println("===============");
		} else {
			System.out.println("post IS NULL");
		}
	}
	
	@Test
	@Ignore
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
