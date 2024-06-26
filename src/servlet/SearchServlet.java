package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import model.Customer;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		/*
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/B3/LoginServlet");
			return;
		}
		*/

		// 登録ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/search.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		/*
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/B3/LoginServlet");
			return;
		}
		*/

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
//		String id = request.getParameter("id");
//		String created_at = request.getParameter("created_at");
//		String updated_at = request.getParameter("update_at");
		String lname_1 = request.getParameter("lname_1");
		String fname_1 = request.getParameter("fname_1");
		String lfurigana_1 = request.getParameter("lfurigana_1");
		String ffurigana_1 = request.getParameter("ffurigana_1");
//		String tel_1 = request.getParameter("tel_1");
		String lname_2 = request.getParameter("lname_2");
		String fname_2 = request.getParameter("fname_2");
		String lfurigana_2 = request.getParameter("lfurigana_2");
		String ffurigana_2 = request.getParameter("ffurigana_2");
//		String tel_2 = request.getParameter("tel_2");
//		String address = request.getParameter("address");
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String thedate = year+"-"+month+"-"+day;
		String memo = request.getParameter("memo_id");
		boolean pin = true;

		// 検索処理を行う
		CustomerDAO cDao = new CustomerDAO();
		List<Customer> customerList = cDao.select(new Customer(0, lname_1, fname_1,	//0のとこidにするとエラー
				lfurigana_1, ffurigana_1, "", lname_2, fname_2, lfurigana_2, ffurigana_2, "",
				"", thedate, pin, memo));

		// 検索結果をリクエストスコープに格納する idも
		request.setAttribute("customerList", customerList);

		// 結果ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		dispatcher.forward(request, response);

	}


}
