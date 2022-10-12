package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao{
	public void add (Course course ) {
		System.out.println("Kurs Hibernate ile eklendi" + course.getCourseName());
	};
}
