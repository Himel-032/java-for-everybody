
public class Grade {

    public String getGrade(int marks) {
        if (marks >= 80) {
            return "A+"; 
        }else if (marks >= 70) {
            return "A"; 
        }else if (marks >= 60) {
            return "B"; 
        }else if (marks >= 50) {
            return "C"; 
        }else {
            return "F";
        }
    }
}
