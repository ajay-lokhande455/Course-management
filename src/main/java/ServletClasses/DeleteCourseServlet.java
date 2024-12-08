package ServletClasses;

import Controller.CourseController;
import Model.Course;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/deleteCourse")
public class DeleteCourseServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        int id = Integer.parseInt(servletRequest.getParameter("id"));

        Course course = Course.builder()
                .id(id)
                .build();

        CourseController courseController = new CourseController();
        courseController.deleteCourse(id);

        PrintWriter writer = servletResponse.getWriter();
        writer.println("<script>alert('record deleted successfully..!!')<script>");
        
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

    }
}
