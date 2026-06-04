package Oop1;

public class Rectangle {
    private double width;
    private double height;


    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return width + width + height + height;
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public boolean isValid() {
        return width > 0 && height > 0;
    }

    public void showInfo() {
        if (!isValid()) {
            System.out.println("Invalid");
        } else {
            System.out.printf("AREA = %.2f%n", area());
            System.out.printf("PERIMETER = %.2f%n", perimeter());
            System.out.printf("DIAGONAL = %.2f%n", diagonal());
        }
    }


}
