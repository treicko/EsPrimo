package EsPrimo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class EsPrimoServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();
		
		EsPrimo primo = new EsPrimo();
		
		out.println("<h1> Hello word desde Es Primo servlet </h1>");
		String num = request.getParameter("numero");
		boolean resp = primo.EsNumeroPrimo(Integer.parseInt(num));
		
		out.println("<br><br><h1> El numero: "+num+" es primo: "+resp+"</h1>");
		out.close();
	}
}