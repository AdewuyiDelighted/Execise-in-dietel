package Chapter4;

public class AsterisksSquare {
    public static void main(String[] args) {

        for (int row = 1; row <=4 ; row++) {
            for (int column = 1; column <= 8; column++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.print(" ");
            for (int column = 1; column <= 8; column++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }
}