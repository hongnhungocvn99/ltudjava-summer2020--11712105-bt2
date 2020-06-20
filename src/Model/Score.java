package Model;
// Generated Jun 15, 2020 12:25:44 PM by Hibernate Tools 4.3.1


public class Score  implements java.io.Serializable {


     private Integer no;
     private String studentId;
     private String fullname;
     private Float middleExam;
     private Float finalExam;
     private Float plusExam;
     private Float avgScore;
     private String subjectId;

    public Score() {
    }
      public Score(String studentId) {
        this.studentId = studentId;
    }

    public Score(String studentId, String fullname, Float middleExam, Float finalExam, Float plusExam, Float avgScore, String subjectId) {
       this.studentId = studentId;
       this.fullname = fullname;
       this.middleExam = middleExam;
       this.finalExam = finalExam;
       this.plusExam = plusExam;
       this.avgScore = avgScore;
       this.subjectId = subjectId;
    }

  /*  public Score(String studentID, String fullName, Float midExam, Float finalExam, Float plusExam, Float avgExam, String className) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
   
    public Integer getNo() {
        return this.no;
    }
    
    public void setNo(Integer no) {
        this.no = no;
    }
    public String getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getFullname() {
        return this.fullname;
    }
    
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public Float getMiddleExam() {
        return this.middleExam;
    }
    
    public void setMiddleExam(Float middleExam) {
        this.middleExam = middleExam;
    }
    public Float getFinalExam() {
        return this.finalExam;
    }
    
    public void setFinalExam(Float finalExam) {
        this.finalExam = finalExam;
    }
    public Float getPlusExam() {
        return this.plusExam;
    }
    
    public void setPlusExam(Float plusExam) {
        this.plusExam = plusExam;
    }
    public Float getAvgScore() {
        return this.avgScore;
    }
    
    public void setAvgScore(Float avgScore) {
        this.avgScore = avgScore;
    }
    public String getSubjectId() {
        return this.subjectId;
    }
    
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }




}


