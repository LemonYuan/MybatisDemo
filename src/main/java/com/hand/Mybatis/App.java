package com.hand.Mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hand.Mybatis.dao.StudentDAO;
import com.hand.Mybatis.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws IOException
	{
		System.out.println( "Hello World!" );
		String resource="config.xml";
		Reader reader=Resources.getResourceAsReader(resource);
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=sessionFactory.openSession();
		StudentDAO studentDAO=new StudentDAO();
		Student student=new Student();
//		student.setId(16);
//		student.setName("frank");
//		student.setAge(19);
		student=studentDAO.getStudent(session, 1);
		//    studentDAO.insertStudent(session,student);
//		studentDAO.deleteStudent(session, student);
	}
}
