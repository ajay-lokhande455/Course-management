package Dao;

import Model.Course;
import Util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {

    public void addCourse(Course course){
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into courses(course_name, description, duration, fees) values(?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setString(3, course.getDuration());
            preparedStatement.setInt(4, course.getFees());
            preparedStatement.executeUpdate();

            System.out.println("Course Added Successfully...!!!");

        } catch (SQLException e) {
            System.out.println();
        }
    }

    public void editCourse(Course course) {


        Connection connection = ConnectionUtil.getConnection();
        String query = "update courses set course_name = ?, description = ?, duration = ?, fees= ? where id = ?;";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, course.getName());
            preparedStatement.setString(2, course.getDescription());
            preparedStatement.setString(3, course.getDuration());
            preparedStatement.setInt(4, course.getFees());
            preparedStatement.setInt(5, course.getId());

            preparedStatement.executeUpdate();
            System.out.println("Course updated successfully");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void deleteCourse(int courseID){
        Connection connection = ConnectionUtil.getConnection();
        String query = "delete from courses where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, courseID);
            preparedStatement.executeUpdate();
            System.out.println("course deleted ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


    public List<Course> getAllCourses(){
        Connection connection = ConnectionUtil.getConnection();
        List<Course> courseList = new ArrayList<>();
        String query = "select * from courses;";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);


            while (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt(1));
                course.setName(resultSet.getString(2));
                course.setDescription(resultSet.getString(3));
                course.setDuration(resultSet.getString(4));
                course.setFees(resultSet.getInt(5));
                courseList.add(course);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return courseList;
    }

}
