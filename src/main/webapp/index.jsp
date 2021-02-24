<%@ page import="java.util.Date" %>
<%@ page import="java.util.Timer" %>
<html>
<body>
<h2>Hello Daniel!</h2>
<%java.util.Date nowData = new Date();
java.util.Timer timer = new Timer();
%>
<%="Today is " + nowData%>
<a href="myServlet">What about tele?</a>
</body>
</html>
