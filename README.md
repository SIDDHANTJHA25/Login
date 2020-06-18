# Login
It is simple user authentication using jsp and servlets

The whole project structure is.

![project(structure)](https://user-images.githubusercontent.com/66818761/85008948-4c743780-b17b-11ea-86d5-8d9f4b9c4f22.png)
 
 
# Maven:- It is maven based project and all the dependencies is pom.xml.
This Project Contains Two Main Folder 
# 1.WebContent :- It contains all the Frontend File including Login page,js ,css images files.

# 2.src :- It contains all the backend code of Servlets class,Model class,Dao class(Database),Utility(maintaining the log).


# WebContent(Frontend):
       1.The login page is index.jsp.
![Index](https://user-images.githubusercontent.com/66818761/85000724-6ceac480-b170-11ea-9c63-8e1a9bab13a2.png)

       2.If The User not provide any data then it shows warning message.
![warning](https://user-images.githubusercontent.com/66818761/85001474-53964800-b171-11ea-9d67-21133e04ba35.png)
 
       3.If user successfully login and all credentials matched with the database then.
![successfull](https://user-images.githubusercontent.com/66818761/85003042-4e39fd00-b173-11ea-8799-ce271b162d24.png)

       4.If user authentictaion failed then it come back to the index.jsp page.
       
       5.When Signin button clicked then jquery execute WebContent/js/login.js.
       
       
 # src(Backend): It contains four packages.
       1.controller:- It exist in src/com/authentication, It consist class LoginController.java this class extends HttpServlet class, In the  class LoginController.java there is two method doGet() and doPost() from which we called the method loginProcess() it takes the username and password from login.js and it call the dao class method which return Login class(model class) object if the  Login class object is null this means the given username and password does not exist in database otherwise it returns the Login class object and we create the session login.
       
       2.dao:- It exist in src/com/authentication,It consist two clsses
               1.Dao.java:- In this class we create the Connection object through jdbc with mysql database there is method getMyConnection() method which return the Connection object.
               
               the table(LOGINTEST)schema is:
 ![table](https://user-images.githubusercontent.com/66818761/85006140-614ecc00-b177-11ea-9914-9f40d01c5ca5.png)
     
               2.LoginDao:-In this class we take all the data from the database  and check store it in the model class,the object of LoginDao follow singelton pattern
                the data of table that i used:
 ![data](https://user-images.githubusercontent.com/66818761/85006960-78da8480-b178-11ea-8b27-34d8920f0146.png)

               
       3.model:- It exist in src/com/authentication ,It consist one class Login.java in which there are two string variable 
                 1.String name
                 2.String pass
 through this class we can store and retrieve username and password wherever we required.
 
       4.utility:- It exist in src/com/authentication ,It consist one class Utility.java in this class there is one method logFile() which print the exception and error occur in which method and what is the exception we can use this class to easily trace the exception and to maintain log.
       
      
