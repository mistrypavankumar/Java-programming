package javaDifferent_progrmming_concepts;

class Square{
    int side;

    Square(int side){
        this.side = side;
    }

    // Passing object as an argument in the getArea() method
    void getArea(Square sq){
        int area = 4 * sq.side;
        System.out.println("Square area: " + area);
    }
}

public class ObjectPassedInMethod {
    public static void main(String[] args) {
        Square sq = new Square(5);

        // Here we are passing object as a parameter
        sq.getArea(sq);
    }
}
