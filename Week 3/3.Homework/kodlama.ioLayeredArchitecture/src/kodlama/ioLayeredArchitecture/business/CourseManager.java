package kodlama.ioLayeredArchitecture.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.ioLayeredArchitecture.core.logging.Logger;
import kodlama.ioLayeredArchitecture.dataAccess.CourseDao;
import kodlama.ioLayeredArchitecture.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<String> courseName = new ArrayList<>();

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (courseName.contains(course.getName())) {
			throw new Exception("Kurs ismi tekrar edemez");
		} else if (course.getPrice() < 0) {
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
		} else {
			courseName.add(course.getName());
			courseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
		}
	}
}