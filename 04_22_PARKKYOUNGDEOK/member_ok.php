<?php

    $userid = $_POST['userid'];
    $userpw = password_hash($_POST['userpw'], PASSWORD_DEFAULT);
    $username = $_POST['name'];
    $email = $_POST['email'].'@'.$_POST['emadress'];
    $address = $_POST['address'];


    try {
        $pdo = new PDO('mysql:dbname=chat;charset=utf8;host=localhost','root','');
      } catch (PDOException $e) {
        exit('DbConnectError:'.$e->getMessage());
      }

	$userid = $_POST['userid'];
    $userpw = password_hash($_POST['userpw'], PASSWORD_DEFAULT);
    $email = $_POST['email'].'@'.$_POST['emadress'];
	$username = $_POST['name'];
    $address = $_POST['address'];
    

    $stmt = $pdo->prepare("INSERT INTO chat_table( id, pw, email, name, address)VALUES( :id, :pw, :email, :name, :address)");
    $stmt->bindValue(':id', $userid, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)
    $stmt->bindValue(':pw', $userpw, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)
    $stmt->bindValue(':email', $email, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)
    $stmt->bindValue(':name', $username, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)
    $stmt->bindValue(':address', $address, PDO::PARAM_STR);  //Integer（数値の場合 PDO::PARAM_INT)
    $status = $stmt->execute();

    if($status==false){
        //SQL実行時にエラーがある場合（エラーオブジェクト取得して表示）
        $error = $stmt->errorInfo();
        exit("QueryError:".$error[2]);
      }else{
        //５．index.phpへリダイレクト 書くときにLocation: in この:　のあとは半角スペースがいるので注意！！
        header("Location: index.php");
        exit;
      
      }
?>
<meta charset="utf-8" />
<script type="text/javascript">alert('new account complete');</script>
<meta http-equiv="refresh" content="0 url=index.php">