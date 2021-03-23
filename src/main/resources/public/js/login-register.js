function validate() {
	var email = document.myform.txt_email;
	var password = document.myform.txt_password;
	if (email.value == null || email.value == "") //check email textbox not blank
	{
		window.alert("please enter email ?"); //alert message
		email.style.background = '#f08080';
		email.focus();
		return false;
	}
	if (password.value == null || password.value == "") //check password textbox not blank
	{
		window.alert("please enter password ?"); //alert message
		password.style.background = '#f08080';
		password.focus();
		return false;
	}
}