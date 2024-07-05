package servlets;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

@WebServlet(name = "InitServlet", value = "/start")
public class InitServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);

        List<Question> questions = new QuestionsDB().getQuestions();

        Question question = questions.get(0);

        session.setAttribute("question", question);
        session.setAttribute("index", 0);

        getServletContext().getRequestDispatcher("/quiz.jsp").forward(req, resp);
    }
}

