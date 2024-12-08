package ServletClasses;

import Controller.CourseController;
import Model.Course;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/allCourse")
public class AllCourseServlet implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        CourseController courseController = new CourseController();
        List<Course> courses = courseController.getAllCourses();


        // Write response
        PrintWriter writer = servletResponse.getWriter();
        writer.println(courses);


    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
