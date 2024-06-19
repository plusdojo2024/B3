package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Employees;

public class EmployeesDAO {
    // ログインできるならtrueを返す
    public boolean isLoginOK(Employees Employees) {
        Connection conn = null;
        boolean loginResult = false;

        try {
            // JDBCドライバを読み込む
            Class.forName("org.h2.Driver");

            // データベースに接続する
            conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");

            // SELECT文を準備する
            String sql = "SELECT COUNT(*) FROM Employees WHERE user = ? AND pw = ?";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setString(1, Employees.getUser());
            pStmt.setString(2, Employees.getPw());

            // SELECT文を実行し、結果表を取得する
            ResultSet rs = pStmt.executeQuery();

            // ユーザーIDとパスワードが一致するユーザーがいたかどうかをチェックする
            rs.next();
            if (rs.getInt("COUNT(*)") == 1) {
                loginResult = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            loginResult = false;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            loginResult = false;
        } finally {
            // データベースを切断
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                    loginResult = false;
                }
            }
        }

        // 結果を返す
        return loginResult;
    }

    public boolean insert(Employees user) {
        Connection conn = null;
        boolean result = false;

        try {
            // データベースに接続する処理

            // SQL文を準備する
            String sql = "INSERT INTO employees (id,creat_at,updated_at,company_id, user, pw) VALUES (?, ?, ?,?,?,?)";
            conn = DriverManager.getConnection("jdbc:h2:file:C:/pleiades/workspace/data/B3", "sa", "");
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getCompany_id());
            pstmt.setString(2, user.getUser());
            pstmt.setString(3, user.getPw());

            // SQL文を実行し、結果を取得する
            int count = pstmt.executeUpdate();

            // 処理の結果を確認する
            if (count > 0) {
                result = true; // 成功
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // データベース接続をクローズする処理
        	if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }



}
