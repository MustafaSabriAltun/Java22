package business;

import core.Logger;
import dataAccess.InstructorDao;
import entities.Instructor;


public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger [] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	public void add (Instructor instructor) {
		
	instructorDao.add(instructor);
	
	for (Logger logger : loggers) {// [db, mail]
		logger.log(instructor.getName());
	}
	}
	
	
	
}
