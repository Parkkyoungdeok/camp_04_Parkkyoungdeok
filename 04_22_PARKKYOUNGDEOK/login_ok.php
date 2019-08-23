
<?php	
$con=mysqli_connect("localhost","root","","chat");
// Check connection
if (mysqli_connect_errno())
  {
  echo "Failed to connect to MySQL: " . mysqli_connect_error();
  }
 
	
	if($_POST["userid"] == "" || $_POST["userpw"] == ""){
		echo '<script> alert("id,password check"); history.back(); </script>';
	}else{
	
		
	$password = $_POST['userpw'];
	$sql = "SELECT * FROM member WHERE id='".$_POST['userid']."'";

	$chat_table = mysqli_fetch_array($sql);
	$hash_pw = $chat_table['pw']; //

	if(password_verify($password, $hash_pw)) //
	{
		$_SESSION['userid'] = $chat_table["id"];
		$_SESSION['userpw'] = $chat_table["pw"];

		echo "<script>alert('login complete.'); location.href='main.php';</script>";
	}else{ //
		echo "<script>alert('id,password is wrong.'); history.back();</script>";
	}
}
?>


