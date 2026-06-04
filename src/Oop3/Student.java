package Oop3;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;
    private static final double PASSING_GRADE = 60;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    private double computeGrades() {
        return grade1 + grade2 + grade3;
    }

    public boolean validateGrades() {
        if (grade1 < 0 || grade2 < 0 || grade3 < 0 || grade1 > 30 || grade2 > 35 || grade3 > 35) {
            return false;
        } else {
            return true;
        }
    }


    public void hasPassed() {
        if (!validateGrades()) {
            System.out.println("One of the grades entered are invalid.");
        } else if (computeGrades() < PASSING_GRADE) {
            System.out.printf("%s%n%s%n", "FAILED", PASSING_GRADE - computeGrades()  + " NEEDED TO PASS");
        } else {
            System.out.println("FINAL GRADE: " + computeGrades());
            System.out.println("PASS");
        }


    }


}
