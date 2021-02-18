package By.Kagan.TeleFunctional;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "myServlet", value = "/myServlet")
public class MainClass extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Televisor televisor = applicationContext.getBean("teleBean", Televisor.class);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Now you have televisor" + "</h1>");
        out.println("<h2>" + "Brand: " + televisor.getBrand() + "</h2>");
        out.println("<h2>" + "Specs: " + televisor.getSpecs() + "</h2>");
        out.println("<h2>" + "Cost: " + televisor.getCost() + "$" + "</h2>");
        out.println("<h2>" + "What does the televisor now?" + "</h2>");
        out.println("<h2>" + "" + televisor.getFunction()+ "</h2>");
        out.println("</body></html>");
    }
}
