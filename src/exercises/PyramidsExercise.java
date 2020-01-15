package exercises;

public class PyramidsExercise {

    //implement a pyramid with 6 * 6 stars(*) and space after each stars

    public static void main(String[] args) {

        //for spaces
        //for stars

        for (int i = 0; i<6; i ++){
            for (int x = 5; x >=i; x--){
                System.out.print(" ");
            }
            for (int y = 0; y <=i; y++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
