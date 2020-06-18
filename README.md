# Login
It is simple user authentication using jsp and servlets

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
       1.controller:- It exist in src/com/authentication, It consist class LoginController.java this class extends HttpServlet class, In the  class LoginController.java there is two method doGet() and doPst() from which we called the method loginProcess() it takes the username and password from login.js and it call the dao class method which return Login class(model class) object if the  Login class object is null this means the given username and password does not exist in database otherwise it returns the Login class object and we create the session login.
       
