package servlets;


import quiz.Question;
import quiz.QuestionsDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();


        List<Question> questions = new QuestionsDB().getQuestions();
        int index = (Integer) session.getAttribute("index");

        if(!Boolean.parseBoolean(req.getParameter("option"))) {
            String message = questions.get(index).getDefeatStatement();
            session.setAttribute("message", message);
            session.setAttribute("restart", true);
            resp.sendRedirect("/Module3_finalProject/restart.jsp");
            return;
        }

        if (index == questions.size() - 1) {
            String message = "Ви успішно пройшли гру.";
            session.setAttribute("message", message);
            session.setAttribute("restart", true);
            resp.sendRedirect("/Module3_finalProject/restart.jsp");
            return;
        }

        if (index < questions.size() - 1) {
            Question next = questions.get(index + 1);
            session.setAttribute("question", next);
            session.setAttribute("index", index + 1);
        }

        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
