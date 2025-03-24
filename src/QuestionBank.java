import java.util.*;

public class QuestionBank {
    private Map<JavaTopic, List<Question>> questionsMap;

    public QuestionBank(){
        questionsMap = new HashMap<>();
        for(JavaTopic topic : JavaTopic.values()){
            questionsMap.put(topic, new ArrayList<>());
        }
    }

    public void addQuestion(Question question){
        List<Question> topicQuestions = questionsMap.get(question.getTopic());
        topicQuestions.add(question);
    }

    public Question getRandomQuestion(JavaTopic topic){
        List<Question> topicQuestions = questionsMap.get(topic);
        if(topicQuestions.isEmpty()){
            return null;
        }
        Collections.shuffle(topicQuestions);
        return topicQuestions.get(0);
    }

    public void questionCount(){
        for(JavaTopic topic : JavaTopic.values())
        {
            List<Question> topicQuestions = questionsMap.get(topic);
            System.out.println(topic + ": " + topicQuestions.size() + " domande");
        }
    }
}
