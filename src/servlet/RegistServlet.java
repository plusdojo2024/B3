package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CustomerDAO;
import model.Customer;

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
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
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/regist.jsp");
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

		//リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String created_at = request.getParameter("created_at");
		String updated_at = request.getParameter("update_at");
		String lname_1 = request.getParameter("lname_1");
		String fname_1 = request.getParameter("fname_1");
		String lfurigana_1 = request.getParameter("lfurigana_1");
		String ffurigana_1 = request.getParameter("ffurigana_1");
		String tel_1 = request.getParameter("tel_1");
		String lname_2 = request.getParameter("lname_2");
		String fname_2 = request.getParameter("fname_2");
		String lfurigana_2 = request.getParameter("lfurigana_2");
		String ffurigana_2 = request.getParameter("ffurigana_2");
		String tel_2 = request.getParameter("tel_2");
		String address = request.getParameter("address");
		String thedate = request.getParameter("thedate");
		String memo_id = request.getParameter("memo_id");

		//登録処理を行う
		CustomerDAO cDAO = new CustomerDAO();
		if (cDAO.insert(new Customer(0, created_at, updated_at, lname_1, fname_1, lfurigana_1, ffurigana_1, tel_1,
				lname_2, fname_2, lfurigana_2, ffurigana_2, tel_2, address, thedate, memo_id)));

		//マイページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mypage.jsp");
		dispatcher.forward(request, response);

	}
}
