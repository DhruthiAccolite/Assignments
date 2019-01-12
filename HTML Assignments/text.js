function signup(){
    var username = document.getElementById('username').value;
	var password = document.getElementById('password').value;
    localStorage.setItem('username',username);
    localStorage.setItem('password', password);
	document.getElementById('username').value="";
	document.getElementById('password').value="";
	alert('Signup Successful');
}
function signin(){
    var usernameenteredd = document.getElementById('username').value;
    var passwordentered = document.getElementById('password').value;
    var storeduser=localStorage.getItem("username");
    var storedpass=localStorage.getItem("password");
    if(usernameenteredd==storeduser && passwordentered==storedpass){
        window.location.replace("yourtube.html");
    }
    else{
        alert("Try Again");
    }
}