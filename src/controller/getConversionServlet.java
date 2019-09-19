package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EuroConverter;

/**
 * Servlet implementation class getConversionServlet
 */
@WebServlet("/getConversionServlet")
public class getConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getConversionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userDollars = request.getParameter("usDollar");
		
		EuroConverter userMoney = new
		EuroConverter(Double.parseDouble(userDollars));
		
		request.setAttribute("userMoneyClip", userMoney);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		
		
		/*PrintWriter writer = response.getWriter();
		writer.println(userMoney.toString());
		writer.close();*/
	}

}
