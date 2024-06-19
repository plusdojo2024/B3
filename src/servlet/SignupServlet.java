package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeesDAO;
import model.Employees;

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // フォームからのデータを取得
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String company_id = request.getParameter("company_id");
        String user = request.getParameter("user");
        String pw = request.getParameter("pw");
        String confirmPw = request.getParameter("confirmPw");

        // フォームからのデータが空でないかどうかを確認
        if (company_id != null && !company_id.isEmpty() && user != null && !user.isEmpty() && pw != null && !pw.isEmpty() && confirmPw != null && !confirmPw.isEmpty()) {
            // パスワードの一致を確認
            if (!pw.equals(confirmPw)) {
                // パスワードが一致しない場合の処理
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<html><body>");
                out.println("<h1>Error</h1>");
                out.println("<p>パスワードが一致しません</p>");
                out.println("</body></html>");
                return;
            }
        } else {
            // フォームからのデータが欠落している場合の処理
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>Error</h1>");
            out.println("<p>すべての情報を入力してください</p>");
            out.println("</body></html>");
            return;
        }

        // ユーザー登録を行う
        EmployeesDAO employeesDAO = new EmployeesDAO();
        Employees id = new Employees(company_id, user, pw);
        // ユーザーを追加し、結果を取得する
        boolean registrationResult = employeesDAO.insert(id);

        // 登録結果をJSPに送信
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if (registrationResult) {
            out.println("<h1>サインアップが成功しました！</h1>");
        } else {
            out.println("<h1>ユーザー登録に失敗しました</h1>");
        }
        out.println("</body></html>");
    }
}
