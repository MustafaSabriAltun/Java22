package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs Jdbc ile eklendi" + course.getCourseName());
		
	}

}
