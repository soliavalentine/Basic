public class Rectangle {
    private int doubleLength;
    private int doubleWidth;

    public Rectangle(int doubleLength, int doubleWidth) {
        this.doubleLength = doubleLength;
        this.doubleWidth = doubleWidth;
    }

    public int getLength() {
        return doubleLength;
    }

    public void setLength(int doubleLength) {
        this.doubleLength = doubleLength;
    }

    public int getWidth() {
        return doubleWidth;
    }

    public void setWidth(int doubleWidth) {
        this.doubleWidth = doubleWidth;
    }

    public int getArea(int doubleLength, int doubleWidth){
        int area = doubleLength*doubleWidth;
        return area;
    }
    public int getDiagonal(int doubleLength, int doubleWidth){
        int x = (doubleLength^2+doubleWidth^2);
        int y = (x^(1/2));
        return y;
    }

    public boolean isSquare(int doubleLength, int doubleWidth){
        boolean z = false;
        if(doubleLength==doubleWidth){
            z = true;
        }
        return z;
    }

    public String toString(){
        return
                "This rectangle is " +
                        this.getLength() + " inches long, and " +
                        this.getWidth() + " inches wides. " +
                        "It has an area of " +
                        this.getArea(getLength(), getWidth()) +
                        " and the diagonal length is " +
                        this.getDiagonal(getLength(),getWidth()) +
                        ". This rectangle is a square:" +
                        this.isSquare(getLength(),getWidth());
    }
}
