package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		/*
		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		String company = request.getParameter("company");		//追加項目
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String remarks = request.getParameter("remarks");		//追加項目

		// 検索処理を行う
		BcDAO bDao = new BcDAO();
		//改造済み（company、remarks追加）
		List<Bc> cardList = bDao.select(new Bc(0, company, "", "", name, "",
												address, "", "", "", "", remarks));

		// 検索結果をリクエストスコープに格納する
		request.setAttribute("cardList", cardList);
		*/

		// 結果ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		dispatcher.forward(request, response);
	}
}