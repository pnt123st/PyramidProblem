package exercises;

public class PyramidProblems2 {

    public static void main(String[] args) {

        for (int i = 0; i < 15; i++){
            for (int x =14; x >= i; x--){
                System.out.print(" ");
            }
            for (int y =0; y <= i; y++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
