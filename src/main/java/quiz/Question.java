package quiz;

import java.util.Map;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Question {

    private static final Logger LOGGER = LogManager.getLogger(Question.class);
    private final String questionText;

    private final String defeatStatement;
    private final Map<String, Boolean> answers;

    public String getQuestionText() {
        LOGGER.error("text of question wasn't received");
        return questionText;
    }
    public String getDefeatStatement() {
        LOGGER.error("wrong answer notion wasn't received");
        return defeatStatement;
    }

    public Map<String, Boolean> getAnswers() {
        LOGGER.error("a map of answers wasn't received");
        return answers;
    }

    public Question(String questionText, String defeatStatement, Map<String, Boolean> answers) {
        this.questionText = questionText;
        this.defeatStatement = defeatStatement;
        this.answers = answers;

        LOGGER.info("new question was added; text of question: \'{}\'.", this.getQuestionText());
    }
}
