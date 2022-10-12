package kodlamaİoMimari;

import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.DatabaseLogger;
import core.FileLogger;
import core.Logger;
import core.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);

		Category category1 = new Category("Müthiş harika DEVASA Programlama");
		categoryManager.add(category1);

		Category category2 = new Category("Müthiş   Programlama");
		categoryManager.add(category2);

		System.out.println("-----////-----////-----////-----");

		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		Instructor instructor1 = new Instructor(1, "Mustafa", "ALTUN");
		instructorManager.add(instructor1);

		Instructor instructor2 = new Instructor(2, "Osman", "ALTUN");
		instructorManager.add(instructor2);

		System.out.println("-----////-----////-----////-----");

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		Course course1 = new Course("Java kursu", 333);
		courseManager.add(course1);

		Course course2 = new Course("C#", 5);
		courseManager.add(course2);

		System.out.println("---FİNİTTO---////---FİNİTTO---////---FİNİTTO---////---FİNİTTO---////");

	}

}
