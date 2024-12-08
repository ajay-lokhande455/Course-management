package ServletClasses;
import Controller.CourseController;
import Dao.CourseDao;
import Model.Course;
import Service.CourseService;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/addCourse")
public class AddCourseServlet implements Servlet{
    public AddCourseServlet(){
        System.out.println("AddCourseServlet :: Constructor");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("AddCourseServlet::init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String description = servletRequest.getParameter("description");
        String duration = servletRequest.getParameter("duration");
        int fees = Integer.parseInt(servletRequest.getParameter("fees"));

        Course course = Course.builder()
                .name(name)
                .description(description)
                .duration(duration)
                .fees(fees)
                .build();

        CourseController courseController = new CourseController();
        courseController.addCourse(course);

        System.out.println("AddCourseServlet::service");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<script>Course added Successfully..!</script>");

    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("AddCourseServlet::destroy");
    }
}