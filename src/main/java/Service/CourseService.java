package Service;

import Dao.CourseDao;
import Model.Course;

import java.util.List;

public class CourseService {

    CourseDao courseDao = new CourseDao();
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    public void editCourse(Course course) {
        courseDao.editCourse(course);
    }

    public void deleteCourse(int courseId) {
        courseDao.deleteCourse(courseId);
    }

    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}