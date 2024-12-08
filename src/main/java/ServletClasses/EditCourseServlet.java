package ServletClasses;

import Controller.CourseController;
import Model.Course;
import Service.CourseService;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

@WebServlet("/editCourse")
public class EditCourseServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("EditServlet :: init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int id = Integer.parseInt(servletRequest.getParameter("id"));
        String name = servletRequest.getParameter("name");
        String description = servletRequest.getParameter("description");
        String duration = servletRequest.getParameter("duration");
        int fees = Integer.parseInt(servletRequest.getParameter("fees"));

        Course course = Course.builder()
                .id(id)
                .name(name)
                .description(description)
                .duration(duration)
                .fees(fees)
                .build();

        CourseController courseController = new CourseController();
        courseController.editCourse(course);

        PrintWriter writer =servletResponse.getWriter();
        writer.println("<script>alert('record Edited successfully..!!')<script>");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
