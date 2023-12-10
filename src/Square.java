public class Square {
    public boolean isBlack;
    public int number;
    public Square(boolean isBlack, int number)
    {
        this.number=number;
        this.isBlack=isBlack;

    }

    public boolean isBlack() {
        return isBlack;
    }

    public int getNum() {
        return number;
    }
}