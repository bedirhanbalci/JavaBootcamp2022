package kodlama.ioLayeredArchitecture.dataAccess;

import kodlama.ioLayeredArchitecture.entities.Category;
import kodlama.ioLayeredArchitecture.entities.Course;
import kodlama.ioLayeredArchitecture.entities.Instructor;

public class HibernateDao implements CategoryDao, CourseDao, InstructorDao {

	@Override
	public void add(Course course) {

		System.out.println("Kurs Hibernate ile veri tabanına eklendi");

	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Eğitmen Hibernate ile veri tabanına eklendi");

	}

	@Override
	public void add(Category category) {
		System.out.println("Kategori Hibernate ile veri tabanına eklendi");

	}

}
