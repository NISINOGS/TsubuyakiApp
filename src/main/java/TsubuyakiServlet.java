import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;  // 追加
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tsubuyaki")
public class TsubuyakiServlet extends HttpServlet {  // クラス名を修正
    private List<Tsubuyaki> tsubuyakiList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String message = request.getParameter("message");
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        tsubuyakiList.add(new Tsubuyaki(message, timestamp));

        request.setAttribute("tsubuyakiList", tsubuyakiList);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("tsubuyakiList", tsubuyakiList);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
