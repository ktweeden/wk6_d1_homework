import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EightBallTest {

    private ArrayList<String> answers = new ArrayList<>();
    private EightBall eightBall;
    @Before
    public void before() {
        answers.add("No chance");
        answers.add("Maybe");
        answers.add("Oh wow, deffo");
        this.eightBall = new EightBall(answers);
    }

    @Test
    public void canGetFirstAnswer() {
        assertEquals("No chance", this.eightBall.getAnswerAtIndex(0));
    }

    @Test
    public void getAnswer() {
        String answer = eightBall.getAnswer();
        assertTrue(answers.contains(answer));
    }

    @Test
    public void addAnswer() {
        eightBall.addAnswer("probs");
        assertEquals("probs", this.eightBall.getAnswerAtIndex(3));
    }

    @Test
    public void removeAnswer() {
        eightBall.removeAnswer("maybe");
        assertEquals(false, this.answers.contains("maybe"));
    }

}
