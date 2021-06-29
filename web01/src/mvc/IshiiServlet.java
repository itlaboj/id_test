package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IshiiServlet
 */
@WebServlet("/ishii")
public class IshiiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public IshiiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//文字化け対策
		request.setCharacterEncoding("UTF-8");

		//隠しフィールド「ACTION」のデータを取得
		String action = request.getParameter("ACTION");

		//加算処理
		ID id = null;
		String page = "";

		try {
			if (action.equals("tasu")) {
				id = new OhnoBean();
//				page = o.tasu(request);
			} else if (action.equals("hiku")) {
				id = new JoBean();
//				page = j.hiku(request);
			}

			page = id.execute(request);

		} catch (Exception e) {
			e.printStackTrace();
		}

		//フォワード処理
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
