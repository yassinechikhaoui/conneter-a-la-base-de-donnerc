<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion de client</title>
</head>

<style>

fieldset {
  border: 1px solid gray;
  background-color: white;
  padding: 10px;
}
button {
 position: absolute;
  background-color: blue;
  color: white;
  border-radius: 5px;
  border: none;
  padding: 10px 20px;
  font-size: 16px;
}
legend{
color: blue;

}
input[type="text"] {
  border-radius:5px;
  border: 1px solid gray;
  box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.1);
  padding: 2px;
  font-size: 15px;
  width: 200px;
}


</style>
<body>

<form action="AjouterClientServlet" method="post">
<fieldset>
<legend><h2>Gestion de client</h2></legend>

<b>Nom</b> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="nom" placeholder="Entrer votre Nom   "><br><br>
<b>Adresse</b> &nbsp&nbsp<input type="text" name="adresse" placeholder="Entrer votre Adresse  "><br><br>
<b>Email</b> &nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="email" placeholder="Entrer votre Email  "><br><br>
   
<input type="submit"  value="Envoyer" name="button">&nbsp&nbsp<input type="reset" value="Retablier">


</fieldset>
</form>

</body>
</html>