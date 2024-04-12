public class Grade{
    private String Subject;
    private double Score;

    Grade(String Subject, double Score){
        this.Subject = Subject;
        this.Score = Score;
    }

    Grade(Grade grade){
        this(grade.getSubject(),grade.getScore());
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }
}
