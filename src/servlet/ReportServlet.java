package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReportServlet
 */
@WebServlet("/ReportServlet")
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 報告書画面にフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/report.jsp");
		dispatcher.forward(request, response);
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

/*
// リクエストパラメータを取得する
	request.setCharacterEncoding("UTF-8");
// 改造（ここから）
	String company = request.getParameter("company");
	String department = request.getParameter("department");
	String position = request.getParameter("position");
	String name = request.getParameter("name");
	String zipcode = request.getParameter("zipcode");
	String address = request.getParameter("address");
	String phone = request.getParameter("phone");
	String fax = request.getParameter("fax");
	String email = request.getParameter("email");
	String remarks = request.getParameter("remarks");
// 改造（ここまで）

// 登録処理を行う
	ReportDao bDao = new ReportDao();
// 改造（ここから）
	if (bDao.insert(new Report(0, company, department, position, name, zipcode,
		address, phone, fax,email, remarks))) {	// 登録成功
	// 改造（ここまで）
	request.setAttribute("result",
	new Result("Registration Success", "レコードを登録しました。", "/B3/MypageServlet"));
}
	else {												// 登録失敗
	request.setAttribute("result",
	new Result("Resistration Failed", "レコードを登録できませんでした。", "/B3/ReportServlet"));
}

// 結果ページにフォワードする
	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/mypage.jsp");
	dispatcher.forward(request, response);
}
}
*/