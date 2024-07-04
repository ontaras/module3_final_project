package quiz;

import java.util.Map;
import java.util.Objects;

public class Question {
    private final String questionText;

    private final String defeatStatement;
    private final Map<String, Boolean> answers;

    public String getQuestionText() {
        return questionText;
    }
    public String getDefeatStatement() {
        return defeatStatement;
    }

    public Map<String, Boolean> getAnswers() {
        return answers;
    }

    public Question(String questionText, String defeatStatement, Map<String, Boolean> answers) {
        this.questionText = questionText;
        this.defeatStatement = defeatStatement;
        this.answers = answers;
    }
}
