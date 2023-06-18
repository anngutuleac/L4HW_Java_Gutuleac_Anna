public class SquareAreaCalc {
    public static void main(String args[]) {
        Square sqObj = new Square(16);
        System.out.println("Площадь квадрата со стороной "
                + sqObj.side
                + " равна "
                + sqObj.squareArea()
        );
    }
}
class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }

    int squareArea() {
        int square = side * side;
        return square;
    }
}

