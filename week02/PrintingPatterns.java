package week02;

public class PrintingPatterns {
    public static void main(String[] args) {

        int Size = Integer.parseInt(args[0]);

        for (int i = 0; i < Size; i++) {
            for (int k = 0; k < Size; k++) {
                if ((i + k) / 2 == 0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }       
    }
}
