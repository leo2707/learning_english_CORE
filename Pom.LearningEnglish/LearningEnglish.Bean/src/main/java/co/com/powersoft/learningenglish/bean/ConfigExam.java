package co.com.powersoft.learningenglish.bean;


/**
 * Lesson generated by hbm2java
 */
public class ConfigExam implements java.io.Serializable {

    private String questionLanguaje;
    private String typeQuestion;
    private String typeAnswer;
    private int numberOfQuestion;
    private String orderQuestions;
    private String time;

    public ConfigExam() {
    }

    public String getQuestionLanguaje() {
        return questionLanguaje;
    }

    public void setQuestionLanguaje(String questionLanguaje) {
        this.questionLanguaje = questionLanguaje;
    }

    public String getTypeAnswer() {
        return typeAnswer;
    }

    public void setTypeAnswer(String typeAnswer) {
        this.typeAnswer = typeAnswer;
    }
    
    public String getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(String typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public int getNumberOfQuestion() {
        return numberOfQuestion;
    }

    public void setNumberOfQuestion(int numberOfQuestion) {
        this.numberOfQuestion = numberOfQuestion;
    }

    public String getOrderQuestions() {
        return orderQuestions;
    }

    public void setOrderQuestions(String orderQuestions) {
        this.orderQuestions = orderQuestions;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    
    
    

}
