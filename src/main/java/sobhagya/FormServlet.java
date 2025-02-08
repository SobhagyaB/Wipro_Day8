package sobhagya;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class FormServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieving form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Displaying the data on a response page
        out.println("<html><head><title>Form Submission</title></head><body>");
        out.println("<h2>Thank You, " + name + "!</h2>");
        out.println("<p>Your details have been received:</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Message:</strong> " + message + "</p>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}
