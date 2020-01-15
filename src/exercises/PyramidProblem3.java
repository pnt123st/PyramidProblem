package exercises;

public class PyramidProblem3 {

    public static void main(String[] args) {

        for(int i = 0; i <6; i ++){
            for (int x = 5; x >i; x --){
                System.out.println("");
            }
            for (int y = 0; y <=i; y ++){
                System.out.println("* ");
            }
            System.out.println(" ");
        }

    }
}
