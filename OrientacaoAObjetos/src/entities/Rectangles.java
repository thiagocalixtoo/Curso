package entities;

public class Rectangles {
    private String nameRectangle;
    private double height;
    private double width;

    public Rectangles (String name, double height, double width){
        nameRectangle = name;
        this.height = height;
        this.width = width;
    }

    public String getNameRectangle() {
        return nameRectangle;
    }
    public void setNameRectangle(String nameRectangle) {
        this.nameRectangle = nameRectangle;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return getHeight()*getWidth();
    }
    public double perimeter(){
        return 2*(getHeight()+getWidth());
    }
    public double diagonal(){
        return Math.sqrt(getHeight()*getHeight()+getWidth()*getWidth());
    }

    public String toString(){
        return String.format("\nName of rectangle: %s  |  Height: %.2f  |  Width: %.2f\nArea: %.2f\nPerimeter: %.2f\nDiagonal: %.2f", getNameRectangle(), getHeight(), getWidth(), area(), perimeter(), diagonal());
    }
}
