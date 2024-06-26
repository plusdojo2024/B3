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
		// もしもお客様が確定していなかったらお客様検索サーブレットにリダイレクトする
//		HttpSession session = request.getSession();
//		if (session.getAttribute("id") == null) {
//			response.sendRedirect("/B3/LoginServlet");
//			return;
//		} else if (session.getAttribute("customer_id") == null) {
//			response.sendRedirect("/B3/SearchServlet");
//			return;
//		}
//
//		// セッションパラメータを取得する
//		int customer_id = (int) session.getAttribute("customer_id");

				// セッションパラメータを取得する
				int customer_id = 1;

		// 検索処理を行う
		SimulationResultDAO srDao = new SimulationResultDAO();
		List<SimulationResult> resultList = srDao.select(new SimulationResult(customer_id));
		if (resultList == null || resultList.size() == 0) {
			srDao.insert(new SimulationResult(0, customer_id, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
		} else {
			SimulationResult result = resultList.get(0);

			// 各シミュレーションの要素の取り出しを行う
			SimulationTablesDAO stDao = new SimulationTablesDAO();
			SimulationCommon st = stDao.select(new SimulationCommon(result.getTable_id())).get(0);
			SimulationTablecoversDAO stcDao = new SimulationTablecoversDAO();
			SimulationCommon stc = stcDao.select(new SimulationCommon(result.getTablecover_id())).get(0);
			SimulationNapkinsDAO snDao = new SimulationNapkinsDAO();
			SimulationCommon sn = snDao.select(new SimulationCommon(result.getNapkin_id())).get(0);
			SimulationChairsDAO scDao = new SimulationChairsDAO();
			SimulationCommon sc = scDao.select(new SimulationCommon(result.getChair_id())).get(0);
			SimulationFlowersDAO sfDao = new SimulationFlowersDAO();
			SimulationCommon sf = sfDao.select(new SimulationCommon(result.getFlower_id())).get(0);
			SimulationClothesDAO sclDao = new SimulationClothesDAO();
			SimulationCommon scl1 = sclDao.select(new SimulationCommon(result.getClothes_id1())).get(0);
			SimulationCommon scl2 = sclDao.select(new SimulationCommon(result.getClothes_id2())).get(0);
			SimulationCakesDAO sckDao = new SimulationCakesDAO();
			SimulationCommon sck = sckDao.select(new SimulationCommon(result.getCake_id())).get(0);
			SimulationCaketopsDAO sctDao = new SimulationCaketopsDAO();
			SimulationCaketops sct = sctDao.select(new SimulationCaketops(result.getCaketop_id(), "")).get(0);
			SimulationInvitationsDAO siDao = new SimulationInvitationsDAO();
			SimulationCommon si = siDao.select(new SimulationCommon(result.getInvitation_id())).get(0);
			SimulationNameplatesDAO snpDao = new SimulationNameplatesDAO();
			SimulationCommon snp = snpDao.select(new SimulationCommon(result.getNameplate_id())).get(0);
			SimulationTablemembersDAO stmDao = new SimulationTablemembersDAO();
			SimulationTablemembers stm = stmDao.select(new SimulationTablemembers(result.getTablemember_id(), 0, "")).get(0);

			// 検索結果をリクエストスコープに格納する
			request.setAttribute("st", st);
			request.setAttribute("stc", stc);
			request.setAttribute("sn", sn);
			request.setAttribute("sc", sc);
			request.setAttribute("sf", sf);
			request.setAttribute("scl1", scl1);
			request.setAttribute("scl2", scl2);
			request.setAttribute("sck", sck);
			request.setAttribute("sct", sct);
			request.setAttribute("si", si);
			request.setAttribute("snp", snp);
			request.setAttribute("stm", stm);
		}

		// シミュレーションの素材画像をリスト化して取り出す
		SimulationTablesDAO stDao = new SimulationTablesDAO();
		List<SimulationCommon> stList = stDao.allselect();
		SimulationTablecoversDAO stcDao = new SimulationTablecoversDAO();
		List<SimulationCommon> stcList = stcDao.allselect();
		SimulationChairsDAO scDao = new SimulationChairsDAO();
		List<SimulationCommon> scList = scDao.allselect();
		SimulationNapkinsDAO snDao = new SimulationNapkinsDAO();
		List<SimulationCommon> snList = snDao.allselect();
		SimulationFlowersDAO sfDao = new SimulationFlowersDAO();
		List<SimulationCommon> sfList = sfDao.allselect();
		SimulationClothesDAO sclDao = new SimulationClothesDAO();
		List<SimulationCommon> sclList = sclDao.allselect();
		SimulationCakesDAO sckDao = new SimulationCakesDAO();
		List<SimulationCommon> sckList = sckDao.allselect();
		SimulationInvitationsDAO siDao = new SimulationInvitationsDAO();
		List<SimulationCommon> siList = siDao.allselect();
		SimulationNameplatesDAO snpDao = new SimulationNameplatesDAO();
		List<SimulationCommon> snpList = snpDao.allselect();

		// 検索結果をリクエストスコープに格納する
		request.setAttribute("stList", stList);
		request.setAttribute("stcList", stcList);
		request.setAttribute("snList", snList);
		request.setAttribute("scList", scList);
		request.setAttribute("sfList", sfList);
		request.setAttribute("sclList", sclList);
		request.setAttribute("sckList", sckList);
		request.setAttribute("siList", siList);
		request.setAttribute("snpList", snpList);

		// シミュレーションページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/simulation.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// もしもログインしていなかったらログインサーブレットにリダイレクトする
		// もしもお客様が確定していなかったらお客様検索サーブレットにリダイレクトする
		HttpSession session = request.getSession();
		if (session.getAttribute("id") == null) {
			response.sendRedirect("/B3/LoginServlet");
			return;
		} else if (session.getAttribute("customer_id") == null) {
			response.sendRedirect("/B3/SearchServlet");
			return;
		}

		// セッションパラメータを取得する
		int customer_id = (int) session.getAttribute("customer_id");

		// リクエストパラメータを取得する
		request.setCharacterEncoding("UTF-8");
		int table_id = Integer.parseInt(request.getParameter("table_id"));
		int tablecover_id = Integer.parseInt(request.getParameter("tablecover_id"));
		int chair_id = Integer.parseInt(request.getParameter("chair_id"));
		int napkin_id = Integer.parseInt(request.getParameter("napkin_id"));
		int flower_id = Integer.parseInt(request.getParameter("flower_id"));
		int clothes_id1 = Integer.parseInt(request.getParameter("clothes_id1"));
		int clothes_id2 = Integer.parseInt(request.getParameter("clothes_id2"));
		int cake_id = Integer.parseInt(request.getParameter("cake_id"));
		int caketop_id = Integer.parseInt(request.getParameter("caketop_id"));
		int invitation_id = Integer.parseInt(request.getParameter("invitation_id"));
		int nameplate_id = Integer.parseInt(request.getParameter("nameplate_id"));
		int tablemember_id = Integer.parseInt(request.getParameter("tablemember_id"));

		// 検索処理を行う
		SimulationResultDAO srDao = new SimulationResultDAO();
		SimulationResult result = srDao.select(new SimulationResult(customer_id)).get(0);

		// 各シミュレーションの要素の取り出しを行う
		SimulationTablesDAO stDao = new SimulationTablesDAO();
		SimulationCommon st = stDao.select(new SimulationCommon(result.getTable_id())).get(0);
		SimulationTablecoversDAO stcDao = new SimulationTablecoversDAO();
		SimulationCommon stc = stcDao.select(new SimulationCommon(result.getTablecover_id())).get(0);
		SimulationNapkinsDAO snDao = new SimulationNapkinsDAO();
		SimulationCommon sn = snDao.select(new SimulationCommon(result.getNapkin_id())).get(0);
		SimulationChairsDAO scDao = new SimulationChairsDAO();
		SimulationCommon sc = scDao.select(new SimulationCommon(result.getChair_id())).get(0);
		SimulationFlowersDAO sfDao = new SimulationFlowersDAO();
		SimulationCommon sf = sfDao.select(new SimulationCommon(result.getFlower_id())).get(0);
		SimulationClothesDAO sclDao = new SimulationClothesDAO();
		SimulationCommon scl1 = sclDao.select(new SimulationCommon(result.getClothes_id1())).get(0);
		SimulationCommon scl2 = sclDao.select(new SimulationCommon(result.getClothes_id2())).get(0);
		SimulationCakesDAO sckDao = new SimulationCakesDAO();
		SimulationCommon sck = sckDao.select(new SimulationCommon(result.getCake_id())).get(0);
		SimulationCaketopsDAO sctDao = new SimulationCaketopsDAO();
		SimulationCaketops sct = sctDao.select(new SimulationCaketops(result.getCaketop_id(), "")).get(0);
		SimulationInvitationsDAO siDao = new SimulationInvitationsDAO();
		SimulationCommon si = siDao.select(new SimulationCommon(result.getInvitation_id())).get(0);
		SimulationNameplatesDAO snpDao = new SimulationNameplatesDAO();
		SimulationCommon snp = snpDao.select(new SimulationCommon(result.getNameplate_id())).get(0);
		SimulationTablemembersDAO stmDao = new SimulationTablemembersDAO();
		SimulationTablemembers stm = stmDao.select(new SimulationTablemembers(result.getTablemember_id(), 0, "")).get(0);

		// 検索結果をリクエストスコープに格納する
		// もしすべての項目が空欄の場合、リクエストパラメータをDBに登録する
		request.setAttribute("st", st);
		request.setAttribute("stc", stc);
		request.setAttribute("sn", sn);
		request.setAttribute("sc", sc);
		request.setAttribute("sf", sf);
		request.setAttribute("scl1", scl1);
		request.setAttribute("scl2", scl2);
		request.setAttribute("sck", sck);
		request.setAttribute("sck", sct);
		request.setAttribute("si", si);
		request.setAttribute("snp", snp);
		request.setAttribute("stm", stm);

		// 総合結果テーブルに入っている各シミュレーションIDとリクエストパラメータのIDに違いがある場合、更新する
		if (st.getId() != table_id || stc.getId() != tablecover_id || sn.getId() != napkin_id || sc.getId() != chair_id
				|| sf.getId() != flower_id || scl1.getId() != clothes_id1 || scl2.getId() != clothes_id2
				|| sck.getId() != cake_id || sct.getId() != caketop_id || si.getId() != invitation_id
				|| snp.getId() != nameplate_id || stm.getId() != tablemember_id) {
			srDao.update(new SimulationResult(0, customer_id, table_id, tablecover_id, chair_id, napkin_id, flower_id,
					clothes_id1, clothes_id2, cake_id, caketop_id, invitation_id, nameplate_id, tablemember_id));

			// 検索結果の更新を行う
			// 検索処理を行う
			result = srDao.select(new SimulationResult(customer_id)).get(0);
			st = stDao.select(new SimulationCommon(result.getTable_id())).get(0);
			stc = stcDao.select(new SimulationCommon(result.getTablecover_id())).get(0);
			sn = snDao.select(new SimulationCommon(result.getNapkin_id())).get(0);
			sc = scDao.select(new SimulationCommon(result.getChair_id())).get(0);
			sf = sfDao.select(new SimulationCommon(result.getFlower_id())).get(0);
			scl1 = sclDao.select(new SimulationCommon(result.getClothes_id1())).get(0);
			scl2 = sclDao.select(new SimulationCommon(result.getClothes_id2())).get(0);
			sck = sckDao.select(new SimulationCommon(result.getCake_id())).get(0);
			sct = sctDao.select(new SimulationCaketops(result.getCaketop_id(), "")).get(0);
			si = siDao.select(new SimulationCommon(result.getInvitation_id())).get(0);
			snp = snpDao.select(new SimulationCommon(result.getNameplate_id())).get(0);
			stm = stmDao.select(new SimulationTablemembers(result.getTablemember_id(), 0, "")).get(0);

			// 検索結果をリクエストスコープに格納する
			request.setAttribute("st", st);
			request.setAttribute("stc", stc);
			request.setAttribute("sn", sn);
			request.setAttribute("sc", sc);
			request.setAttribute("sf", sf);
			request.setAttribute("scl1", scl1);
			request.setAttribute("scl2", scl2);
			request.setAttribute("sck", sck);
			request.setAttribute("sck", sct);
			request.setAttribute("si", si);
			request.setAttribute("snp", snp);
			request.setAttribute("stm", stm);
		}

		// 結果ページにフォワードする
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/simulation.jsp");
		dispatcher.forward(request, response);
	}
}
