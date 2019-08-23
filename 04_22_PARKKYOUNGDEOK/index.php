<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="style.css">
    <title>チャット</title>
</head>
<body>
<div id="login_box">
		<h1>login</h1>							
			<form method="post" action="login_ok.php">
				<table align="center" border="0" cellspacing="0" width="300">
        			<tr>
            			<td width="130" colspan="1"> 
                	id:<input type="text" name="userid" class="inph">
            		</td>
            		<td rowspan="2" align="center" width="100" > 
                		<button type="submit" id="btn" >login</button>
            		</td>
        		</tr>
        		<tr>
            		<td width="130" colspan="1"> 
               	pw:<input type="password" name="userpw" class="inph">
            	</td>
        	</tr>
        	<tr>
           		<td colspan="3" align="center" class="mem"> 
              	<a href="member.php">new account</a>
           </td>
        </tr>
    </table>
  </form>
</div>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="test.js"></script>

</body>
</html>