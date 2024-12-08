
package Util;

import Constants.MySql;
import lombok.Getter;

import java.sql.*;

import static Constants.MySql.*;


public class ConnectionUtil {
    @Getter
    private static Connection connection;
    static {
        try {
            Class.forName(DRIVER_NAME);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            System.out.println("Issue in connection");
        }
    }
}
