public class Question {
    private String questionText;
    private String answerText;
    private JavaTopic topic;

    public Question(String questionText, String answerText, JavaTopic topic) {
        this.questionText = questionText;
        this.answerText = answerText;
        this.topic = topic;
    }

    public Question(){}

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public JavaTopic getTopic() {
        return topic;
    }

    public void setTopic(JavaTopic topic) {
        this.topic = topic;
    }
}
