package part5.task24;

public class Task24 {
    public static void main(String[] args) {
        int bf[][] = new int[5][5];
        int i, j;


        for (i = 0; i < bf.length / 2 + 1; i++) {
            for (j = 0; j < bf[i].length; j++) {
                if ((j < i) || (j >= (bf[i].length - i))) {
                    bf[i][j] = 0;
                } else {
                    bf[i][j] = 1;
                }
            }

        }
        for (i = bf.length - 1; i >= bf.length / 2; i--) {
            for (j = 0; j < bf[i].length; j++) {
                if ((j < (bf[i].length - 1 - i)) || (j > i)) {
                    bf[i][j] = 0;
                } else {
                    bf[i][j] = 1;
                }
            }
        }
        for (i = 0; i < bf.length; i++) {
            for (j = 0; j < bf[i].length; j++) {
                System.out.print(bf[i][j]);
            }
            System.out.println(" ");
        }
    }
}
