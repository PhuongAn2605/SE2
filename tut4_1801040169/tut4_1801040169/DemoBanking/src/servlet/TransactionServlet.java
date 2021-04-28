package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TransactionDAO;
import model.Transaction;

/**
 * Servlet implementation class TransactionServlet
 */
@WebServlet("/transactions")
public class TransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TransactionDAO transactionDAO;

	public void init() {
		transactionDAO = new TransactionDAO();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			listTransaction(request, response);
		}catch(Exception e) {
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
	
	private void listTransaction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Transaction> listTransaction = transactionDAO.selectAllTransactions();
		request.setAttribute("listTransaction", listTransaction);
		RequestDispatcher dispatcher = request.getRequestDispatcher("transaction-list.jsp");
		dispatcher.forward(request, response);
	}

}
