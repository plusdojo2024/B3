package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

import dao.OrderlistDao;
import model.Orderlist;

/**
 * Servlet implementation class OrderlistServlet
 */
@WebServlet("/OrderlistServlet")
public class OrderlistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 // もしもログインしていなかったらログインサーブレットにリダイレクトする
				HttpSession session = request.getSession();
				if (session.getAttribute("id") == null) {
					response.sendRedirect("/B3/LoginServlet");
					return;
				}
				*/

		// 発注リストにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/orderlist.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
		response.setCharacterEncoding("utf-8");

		 //送信されたデータの取得
		//data1は期日、data2は人数、data3はメモ
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3 = request.getParameter("data3");

		OrderlistDao aDao = new OrderlistDao();
		aDao.insert(new Orderlist(data1,Integer.parseInt(data2),Integer.parseInt(data3));


		//ArrayListをインスタンス化
		ArrayList<Orderlist> list = new ArrayList<>();

		//date型の用意
		try {
		SimpleDateFormat setDeadlines = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

		//適当な値を突っ込む
		for(int i=0;i<5;i++) {
			Orderlist jub = new Orderlist();
			jub.setDeadlines((SimpleDateFormat.parse(data1));
			jub.setNumber(Integer.parseInt(data2));
			jub.setMemo_id(Integer.parseInt(data3));
			list.add(jub);
		}
		}
		catch (ParseException e) {
	        //例外処理
	    }

	}
}
