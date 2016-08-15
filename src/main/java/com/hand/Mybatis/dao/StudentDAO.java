package com.hand.Mybatis.dao;

import org.apache.ibatis.session.SqlSession;

import com.hand.Mybatis.entity.Student;

public class StudentDAO {
       public Student getStudent(SqlSession session,int id){
   		String statement="com.hand.Mybatis.dao.studentMapper.getStudent";
   		Student student=session.selectOne(statement,1);
   		System.out.println(student.getName());
   		return student;
       }
       public void insertStudent(SqlSession session,Student student){
    	   String statement="com.hand.Mybatis.dao.studentMapper.insertStudent";
           session.insert(statement,student);
           session.commit();
    	   System.out.println("insert successfully");
       }
       public void deleteStudent(SqlSession session,Student student){
    	   String statement="com.hand.Mybatis.dao.studentMapper.deleteStudent";
    	   session.delete(statement,student);
    	   session.commit();
    	   System.out.println("delete successfully");
       }
}
