public class Student {
    private String name;
    private int study_year;
    private int score = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudyYear(int study_year) {
        this.study_year = study_year;
    }

    public int getStudyYear() {
        return study_year;
    }

    public int getScore() {
        return score;
    }

    public void addPoint(int point) {
        this.score += point;
        System.out.println(name + " got " + point + " points");
    }

    public String getGrade() {
        if (score >= 80) return "A";
        if (score >= 70) return "B";
        if (score >= 60) return "C";
        return "F";
    }
}
