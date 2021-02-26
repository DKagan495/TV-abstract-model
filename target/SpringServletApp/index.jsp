<%@ page import="java.util.Date" %>
<%@ page import="java.util.Timer" %>
<html>
<body>
<h2>Hello Daniel!</h2>
<%java.util.Date nowData = new Date();
java.util.Timer timer = new Timer();
%>
<%="Today is " + nowData%>
<br> <a href="myServlet">What about tele?</a><br>
<a href="index.jsp">Obratno naxui</a><br>
<a href="Imaenit.jsp">Povezlo povezlo</a><br>
<a href="PozhialayRifma.jsp">Почитать пожилой стишок</a>
</body>
</html>
