$(document).ready(function(){
	
        
	$("#loginbtn").click(function(){
		var u=$("#username").val();
		var p=$("#pass").val();
		
		if(u==""){
			alert("Please Enter username");
			$("#username").focus().css("border-color","red");
		}else if(p==""){
			alert("Please Enter Password");
			$("#pass").focus().css("border-color","red");
		}
              
			$.post("login",{
				username:u,
				pass:p,
			},function(){
				window.location.href="index1.jsp";
			});
			
		
	});

	


	
});

