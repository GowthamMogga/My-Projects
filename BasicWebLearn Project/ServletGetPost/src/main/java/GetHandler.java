

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetHandler
 */
@WebServlet("/GetHandler")
@WebInitParam(name = "employee",value="gowtham")
public class GetHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ServletContext servtcx = getServletContext();
		String value = servtcx.getInitParameter("mysql");
		//System.out.println(sc.getServletContext().getAttribute("mysql"));
		System.out.println("coming for context param " + value);
		System.out.println("--------------");
		
		ServletConfig sc = getServletConfig();
		 String dbname = sc.getInitParameter("dbname");
		 System.out.println(dbname);
		
		
		
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		pw.println("name = " + name + "<br>address = " + address);
		pw.println("</body></html>");
		System.out.println(name);
		System.out.println(address);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
