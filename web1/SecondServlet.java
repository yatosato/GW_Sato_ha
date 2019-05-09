package web1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//送信されてくるパラメータのエンコーディング HTMLからServletに
		req.setCharacterEncoding("UTF-8");
		//送信したパラメータの取得（文字列）
		String param = req.getParameter("param");
		//以下のコードがHTML形式で出力される部分
		resp.setContentType("text/html; charset = UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>"+param+"</h1>");
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		out.close();

	}
}
