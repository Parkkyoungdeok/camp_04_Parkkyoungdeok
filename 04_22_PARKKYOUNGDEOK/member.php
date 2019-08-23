
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>new account form</title>
</head>
<body>
<body>
	<form method="post" action="member_ok.php">
		<h1>new account form</h1>
			<fieldset>
				<legend>write</legend>
					<table>
						<tr>
							<td>id</td>
							<td><input type="text" size="35" name="userid" placeholder="userid"></td>
						</tr>
						<tr>
							<td>password</td>
							<td><input type="password" size="35" name="userpw" placeholder="userpw"></td>
						</tr>
						<tr>
							<td>name</td>
							<td><input type="text" size="35" name="name" placeholder="name"></td>
						</tr>
						<tr>
							<td>email</td>
							<td><input type="text" name="email">@<select name="emadress"><option value="naver.com">naver.com</option><option value="gmail.com">nate.com</option>
							<option value="yahoo.co.jp">yahoo.co.jp</option><option value="gmail.com">gmail.com</option></select></td>
						</tr>
						<tr>
							<td>address</td>
							<td><input type="text" size="35" name="address" placeholder="address"></td>
						</tr>
						
					</table>

				<input type="submit" value="registration" /><input type="reset" value="rewrite" />
			
		</fieldset>
	</form>    




</body>
</html>