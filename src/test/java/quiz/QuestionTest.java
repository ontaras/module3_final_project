package quiz;

import junit.framework.TestCase;
import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;


public class QuestionTest extends TestCase {
    @Test
    public void testGetQuestionText() {

        String qText = "question text";

        Question question = new Question(qText, null, null);

        assertEquals("question text", question.getQuestionText());
    }

    public void testGetDefeatStatement() {

        String qDefeat = "defeat text";

        Question question = new Question(null, qDefeat, null);

        assertEquals("defeat text", question.getDefeatStatement());
    }

    public void testGetAnswers() {

        Map<String, Boolean> map = new HashMap<>();
        map.put("positive", true);
        map.put("negative", false);

        Question question = new Question(null, null, map);

        assertThat(map, is(question.getAnswers()));
    }
}