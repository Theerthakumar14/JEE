<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
body{
background-image:url('https://static.toiimg.com/thumb/msid-80608010,width-1070,height-580,imgsize-339204,resizemode-75,overlay-toi_sw,pt-32,y_pad-40/photo.jpg');
background-repeat: no-repeat;
background-attachment: fixed;
background-size: cover;
}
h1{
text-align: center;
font-family:cursive;
font-size:25px;
color: pink;
}
div{
text-align: center;
font-size: 20px;
color: red;
padding-top: 30px;


}
.button{
font-size: 15px;
background-color: green;
color:white;
border: 2px solid;
padding: 5px;
}

</style>
<title>mynthra</title>
</head>
<body >
<h1>Welcome to Mynthra</h1>
<div>
<form action="mynthra" method="post">
<pre>
ProductName:<input type="text" name="product"><br></br>
ProductQty:<input type="text" name="qty"><br>
ProductPrice:<input type="text" name="price"><br>
<input type="submit" value="Submit" class="button" >



</pre>

</form>
</div>

</body>
</html>