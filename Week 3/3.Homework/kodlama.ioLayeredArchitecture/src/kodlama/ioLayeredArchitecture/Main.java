package kodlama.ioLayeredArchitecture;

import kodlama.ioLayeredArchitecture.business.CategoryManager;
import kodlama.ioLayeredArchitecture.business.CourseManager;
import kodlama.ioLayeredArchitecture.business.InstructorManager;
import kodlama.ioLayeredArchitecture.core.logging.DatabaseLogger;
import kodlama.ioLayeredArchitecture.core.logging.FileLogger;
import kodlama.ioLayeredArchitecture.core.logging.Logger;
import kodlama.ioLayeredArchitecture.core.logging.MailLogger;
import kodlama.ioLayeredArchitecture.dataAccess.HibernateDao;
import kodlama.ioLayeredArchitecture.dataAccess.JdbcDao;
import kodlama.ioLayeredArchitecture.entities.Category;
import kodlama.ioLayeredArchitecture.entities.Course;
import kodlama.ioLayeredArchitecture.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, 500, "JAVA", "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA");

		Category category1 = new Category(5, "Programlama");
		Category category2 = new Category(5, "Programlama");

		Instructor instructor1 = new Instructor(0, "Engin Demiroğ");

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		CourseManager courseManager = new CourseManager(new HibernateDao(), loggers);
		courseManager.add(course1);

		CategoryManager categoryManager = new CategoryManager(new JdbcDao(), loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);

		InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers);
		instructorManager.add(instructor1);

	}

}