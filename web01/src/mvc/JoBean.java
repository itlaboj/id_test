package mvc;

import javax.servlet.http.HttpServletRequest;

public class JoBean implements ID {
	//処理
	@Override
	public String execute(HttpServletRequest request) throws Exception {
		//リクエストを取得
		int x = Integer.parseInt(request.getParameter("DATA1"));
		int y = Integer.parseInt(request.getParameter("DATA2"));

		int result = x - y;

		//計算結果をリクエスト・オブジェクトに設定
		request.setAttribute("RESULT", result);

		return "/mvc/tanaka.jsp";
	}
}
