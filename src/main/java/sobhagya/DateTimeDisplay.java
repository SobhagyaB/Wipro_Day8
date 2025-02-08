package sobhagya;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DateTimeDisplay")
public class DateTimeDisplay extends HttpServlet {
//    private static final long serialVersionUID = 1L;

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	resp.setContentType("text/html");
    	PrintWriter out = resp.getWriter();
    	
    	LocalDateTime currentdatetime = LocalDateTime.now();
    	
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    	String formattedDateTime = currentdatetime.format(formatter);
    	
    	out.println("<h2>Current Date & Time</h2>");
    	out.println("Date & Time : "+formattedDateTime);

    }
}
