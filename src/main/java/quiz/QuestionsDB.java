package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuestionsDB {
    private final List<Question> questions = new ArrayList<>();

    public List<Question> getQuestions() {
        return questions;
    }

    public QuestionsDB() {
        questions.add(new Question(
                "Ви втрачаєте памʼять. Прийняти виклик НЛО?",
                "Ви відхілили виклик. Поразка",
                new HashMap<>(){{
                    put("Прийняти виклик", true);
                    put("Відхилити виклик", false);
                }}
        ));
        questions.add(new Question(
                "Ви прийняли виклик. Піднятися на капітанський місток?",
                "Ви не пійшли на переговори. Поразка",
                new HashMap<>() {{
                    put("Піднятися на місток", true);
                    put("Відмовитися підніматися на місток", false);
                }}
        ));
        questions.add(new Question(
                "Ви піднялися на місток. Хто ви?",
                "Ваша брехня була викрита. Поразка",
                new HashMap<>() {{
                    put("Розповісти правду про себе", true);
                    put("Збрехати про себе", false);
                }}
        ));
    }
    /*public int getQuestionIndex(Question question) {
        return questions.indexOf(question);
    }*/
}
