import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getAnswerAtIndex(int index) {
        return this.answers.get(index);
    }

    public String getAnswer() {
        Collections.shuffle(this.answers);
        return getAnswerAtIndex(0);
    }

    public void addAnswer(String answer) {
        this.answers.add(answer);
    }

    public void removeAnswer(String answer) {
        this.answers.remove(answer);
    }
}
