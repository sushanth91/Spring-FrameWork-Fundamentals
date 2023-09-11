package com.beanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {
	private Connection con;
	private Statement stmt;

	private String driver;
	private String url;
	private String userName;
	private String password;

	public void setDriver(String driver) {
		this.driver = driver;
		System.out.println("Setting Driver");
	}

	public void setUrl(String url) {
		this.url = url;
		System.out.println("Setting URL");
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println("Setting User Name");
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println("Setting Password");
		System.out.println();
	}

	@PostConstruct
	private void init() throws SQLException, ClassNotFoundException {
		System.out.println("StudentDAO object dependencies are injected."
				+ " StudentDAO onject is constructed");
		System.out.println();
		System.out.println("init() method called ");
		System.out.println();
		createStudentDBConnection();
	}

	// Here the createStudentDBConnection() is the init method for us.
	// Annotate a method with @PostConstruct to use it as a init method
	// We don't need to call init method, Our framework will call it for us.
	// @PostConstruct
	public void createStudentDBConnection() throws SQLException, ClassNotFoundException {
		System.out.println("createStudentDBConnection() method called ");
		Class.forName(driver);
		con = DriverManager.getConnection(url, userName, password);
		stmt = con.createStatement();

	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		System.out.println("Retrieving all students data...");
		ResultSet rs = stmt.executeQuery("SELECT * fROM esnew.HostelStudentInfo");

		while (rs.next()) {

			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			double hostelFees = rs.getDouble(3);
			String foodType = rs.getString(4);
			System.out.println(studentId + " " + studentName + " " + hostelFees + " " + foodType);
		}
	}

	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {
		System.out.println("Deleting student with student id = " + studentId);

		int rowsAffected = stmt.executeUpdate("DELETE FROM ESNew.HostelStudentInfo WHERE studentId = " + studentId);
		System.out.println(rowsAffected + " record(s) deleted");
	}
	
   @PreDestroy
	private void preDestroy() throws SQLException {
		System.out.println();
		System.out.println("@PreDestroy() method which has to be called before the container is destroyed");
		System.out.println("Before your container object will destroy, spring will call your custom destroy method");
		System.out.println("Destroy method will be called before the bean is removed from the container");
		closeConnection();
	}
	
	private void closeConnection() throws SQLException {
		con.close();
		System.out.println();
		System.out.println("Database Connection closed");
	}

}
