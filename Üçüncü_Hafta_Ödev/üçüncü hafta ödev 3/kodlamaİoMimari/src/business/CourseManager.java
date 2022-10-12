package business;

import java.util.ArrayList;
import java.util.List;

import core.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	List<Course> courses = new ArrayList<Course>();

	public void add(Course course) throws Exception {
		for (Course course1 : courses) {
			if (course1.getCourseName() == course.getCourseName()) {
				throw new Exception("Kategori isimleri aynı. Lütfen değiştirin. ");

			}

		}
		if (course.getPrice() <= 0) {
			throw new Exception("Kurs ücreti giriniz!");
		}

		courseDao.add(course);

		for (Logger logger : loggers) {// [db, mail]
			logger.log(course.getCourseName());
		}

	}

}
