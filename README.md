# EndTermPracticalBScIT
                                                                    ** SET-A**
Q1. Assume a table "login" with username and password in mysql database "userdetails". Create a Dynamic web project for login page using Servlet.
    
    Instructions for index.html

       Create a form in index.html with following tag

       action="LoginServelt" method="Post"   
       index.html page should have following text filds and button
       for first textfield : input type="text"
       for second textfield : input type="password"
       for button : input type=submit

   Creats Servlet class LoginServlet. Define doPost method in LoginServlet.
   
   Function of doPost() method:
   
   1. Fetch username and password from index.html page.
   2. Establish JDBC connection with database "userdetails"
   3. Fetch records from "login" table
   4. If the entered Username and password matches with "login" table username and password, print valid user
      else invalid user.

Q2. Create two files one.txt and two.txt. Write 5 lines in both files. Now merge the contents of both files into third file three.txt. Print the 
    content of three.txt.

Q3. Create a table "Employee" in mysql database "db1" with following fields.
    1. Name :  varchar
    2. id   : int (Enter ids beetween 101 to 121)
    3. salary: double
    
    Write a JDBC program. Ask a user to enter details using Scanner class. Insert these details in the Employee table using PreparedStatement.
    1. Valid id lies between 101 to 121.
    2. You have to enter 5 employees details of valid ids. 
    2.  if a user entered wrong id then throw user define exception invalid id.
    For example:-> 
                   Valid input:
                               Name : JK
                               id : 102
                               salary: 5000
                  InValid input: 
                                Name: JK
                                id: 500 (Invalid throw exception)
                                salary: 5000
    
                                                                           **SET - B**
Q1. Assume a table "customer" with name, address  and phone number in mysql database "customerdetails". Create a Dynamic web project for Reservation using Servlet.
    
    Instructions for index.html

       Create a form in index.html with following tag

       action="LoginServelt" method="Post"   
       index.html page should have following text filds and button
       for first textfield : input type="text"
       for second textfield : input type="text"
       for third textfield : input type="text"
       for button : input type=submit

   Creats Servlet class ReservationServlet. Define doGet method in ReservationServlet.
   
   Function of doGet() method:
   
   1. Fetch name, address  and phone numberfrom index.html page.
   2. Establish JDBC connection with database "customerdetails"
   3. insert record in "customerdetails"  table
   4. Print Record saved in database

Q2. Create two files one.txt and two.txt. Write 100 to 150 intgeres in one.txt. 
    For example: 
                   one.txt
                   100
                   102
                   103
                   .
                   .
                   150
    Read content from one.txt. And reverse each number and write into two.txt

Q3. Create a table "Student" in mysql database "db1" with following fields.
    1. Name :  varchar
    2. Roll number   : int (valid range is 1 to 63)
    3. percentage: double
    
    Write a JDBC program. Ask a user to enter roll number using Scanner class. Fetch record of specified roll number.
    1. if a entered roll number is not valid then trow userdefine exception invalid student roll number
    
    For example:-> 
                   Valid input:
                               Name : JK
                               Roll Number : 10
                               percentage: 50
                  InValid input: 
                                Name: JK
                                Roll Number : 70(Invalid throw exception)
                                percentage: 50
      
    
       
    
      
