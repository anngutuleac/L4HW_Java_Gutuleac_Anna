import java.util.Scanner;
public class SquareAreaCalc {
    public static void main(String args[]) {
        System.out.print("Введите длину стороны квадрата: ");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        Square sqObj = new Square(side);
        System.out.println("Площадь квадрата со стороной "
                + side
                + " равна "
                + sqObj.squareArea()
        );
    }
}
class Square {
    int side;

    public Square(int side) throws IllegalArgumentException {
        if (side < 0) {
            throw new IllegalArgumentException("Длина должна быть неотрицательной!");
        }
        this.side = side;
    }

    int squareArea() {
        return side * side;
    }
}

