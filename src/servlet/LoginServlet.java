package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.EmployeesDAO;
import model.Employees;
import model.LoginUser;
import model.Result;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ログインページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを取得する
				request.setCharacterEncoding("UTF-8");
				String user = request.getParameter("user");
				String pw = request.getParameter("pw");

				// ログイン処理を行う
				EmployeesDAO iDao = new EmployeesDAO();
				if (iDao.isLoginOK(new Employees(0,user, pw))) {	// ログイン成功
					// セッションスコープにIDを格納する
					HttpSession session = request.getSession();
					session.setAttribute("user", new LoginUser(user));

					// メニューサーブレットにリダイレクトする
					response.sendRedirect("/B3/HomeServlet");
				}
				else {									// ログイン失敗
					// リクエストスコープに、タイトル、メッセージ、戻り先を格納する
					request.setAttribute("result",
					new Result("ログイン失敗！", "ユーザー名またはパスワードに間違いがあります。", "/B3/LoginServlet"));

					// 結果ページにフォワードする
					RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/loginresult.jsp");
					dispatcher.forward(request, response);
				}

	}

}
