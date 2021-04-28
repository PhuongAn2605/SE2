package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDAO;
import model.Account;

/**
 * Servlet implementation class AccountServlet
 */
@WebServlet("/accounts")
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountDAO accountDAO;
	
	public void init() {
		accountDAO = new AccountDAO();
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			listAccount(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void listAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Account> listAccount = accountDAO.selectAllAccounts();
		request.setAttribute("listAccount", listAccount);
		RequestDispatcher dispatcher = request.getRequestDispatcher("account-list.jsp");
		dispatcher.forward(request, response);
		
	}
}
