# Student Database App

## Problem Statement
Console-based Java application using JDBC that allows managing student information in a MySQL database.

## Setup Instructions

1. Install MySQL and create a database named `student_information`.
2. Update the database credentials in `JDBCUtil.java` if necessary.
3. Import the project into your IDE or compile via command line.
4. Follow the console menu to perform CRUD operations.

## Assumptions or Special Notes
- Java 8 or later is required.
- Database connection uses `root` user by default (change in `JDBCUtil.java` accordingly).
- The project uses simple console interaction; no GUI is included.

## Features
- Create, Read, Update, Delete (CRUD) operations on students.
- Console-menu driven using Scanner input.
- Proper use of PreparedStatement for SQL injection safety.
- Exception handling with resource management.
