package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SimulationCakesDAO;
import dao.SimulationCaketopsDAO;
import dao.SimulationChairsDAO;
import dao.SimulationClothesDAO;
import dao.SimulationFlowersDAO;
import dao.SimulationInvitationsDAO;
import dao.SimulationNameplatesDAO;
import dao.SimulationNapkinsDAO;
import dao.SimulationResultDAO;
import dao.SimulationTablecoversDAO;
import dao.SimulationTablemembersDAO;
import dao.SimulationTablesDAO;
import model.SimulationCaketops;
import model.SimulationCommon;
import model.SimulationResult;
import model.SimulationTablemembers;

/**
 * Servlet implementation class SimulationServlet
 */
@WebServlet("/SimulationServlet")
public class SimulationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		/*
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/B3/LoginServlet");
			return;
		}
		*/

		// シミュレーションページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/simulation.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/B3/LoginServlet");
			return;
		}

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		int customer_id = Integer.parseInt(request.getParameter("customer_id"));

		// 検索処理を行う
		SimulationResultDAO srDao = new SimulationResultDAO();
		List<SimulationResult> resultList = srDao.select(new SimulationResult(customer_id));

		// 各シミュレーションの要素の取り出しを行う
		SimulationTablesDAO stDao = new SimulationTablesDAO();
		List<SimulationCommon> stList = stDao.select(new SimulationCommon(resultList.get(3).getTable_id()));
		SimulationTablecoversDAO stcDao = new SimulationTablecoversDAO();
		List<SimulationCommon> stcList = stcDao.select(new SimulationCommon(resultList.get(4).getTablecover_id()));
		SimulationNapkinsDAO snDao = new SimulationNapkinsDAO();
		List<SimulationCommon> snList = snDao.select(new SimulationCommon(resultList.get(6).getNapkin_id()));
		SimulationChairsDAO scDao = new SimulationChairsDAO();
		List<SimulationCommon> scList = scDao.select(new SimulationCommon(resultList.get(5).getChair_id()));
		SimulationFlowersDAO sfDao = new SimulationFlowersDAO();
		List<SimulationCommon> sfList = sfDao.select(new SimulationCommon(resultList.get(7).getFlower_id()));
		SimulationClothesDAO sclDao = new SimulationClothesDAO();
		List<SimulationCommon> sclList1 = sclDao.select(new SimulationCommon(resultList.get(8).getClothes_id1()));
		List<SimulationCommon> sclList2 = sclDao.select(new SimulationCommon(resultList.get(9).getClothes_id2()));
		SimulationCakesDAO sckDao = new SimulationCakesDAO();
		List<SimulationCommon> sckList = sckDao.select(new SimulationCommon(resultList.get(10).getCake_id()));
		SimulationCaketopsDAO sctDao = new SimulationCaketopsDAO();
		List<SimulationCaketops> sctList = sctDao.select(new SimulationCaketops(resultList.get(11).getCaketop_id(),""));
		SimulationInvitationsDAO siDao = new SimulationInvitationsDAO();
		List<SimulationCommon> siList = siDao.select(new SimulationCommon(resultList.get(12).getInvitation_id()));
		SimulationNameplatesDAO snpDao = new SimulationNameplatesDAO();
		List<SimulationCommon> snpList = snpDao.select(new SimulationCommon(resultList.get(13).getNameplate_id()));
		SimulationTablemembersDAO stmDao = new SimulationTablemembersDAO();
		List<SimulationTablemembers> stmList = stmDao.select(new SimulationTablemembers(resultList.get(14).getTablemember_id(),0,""));

		// 検索結果をリクエストスコープに格納する
		request.setAttribute("stList", stList);
		request.setAttribute("stcList", stcList);
		request.setAttribute("snList", snList);
		request.setAttribute("scList", scList);
		request.setAttribute("sfList", sfList);
		request.setAttribute("sclList1", sclList1);
		request.setAttribute("sclList2", sclList2);
		request.setAttribute("sckList", sckList);
		request.setAttribute("sckList", sctList);
		request.setAttribute("siList", siList);
		request.setAttribute("snpList", snpList);
		request.setAttribute("stmList", stmList);

		// 結果ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/simulation.jsp");
		dispatcher.forward(request, response);
	}
}
