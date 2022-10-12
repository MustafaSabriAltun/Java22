package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
	public void add ( ) {}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile eklendi" + instructor.getName());
		
	};
}
