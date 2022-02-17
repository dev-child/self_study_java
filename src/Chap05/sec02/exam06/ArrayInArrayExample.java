package Chap05.sec02.exam06;

public class ArrayInArrayExample {
    public static void main(String[] args) {

        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            for (int k = 0; k < mathScores[i].length; k++) {
                System.out.println("mathScores[" + i + "][" + k + "]=" + mathScores[i][k]);
            }
        }
        System.out.println();

        int[][] englishscores = new int[2][];
        englishscores[0] = new int[2];
        englishscores[1] = new int[3];
        for (int i = 0; i < englishscores.length; i++) {
            for (int k = 0; k < englishscores[i].length; k++) {
                System.out.println("englishScores[" + i + "][" + k + "]=" + englishscores[i][k]);
            }
        }
        System.out.println();

        int[][] javaScores = {{95, 80}, {92, 96, 90}};
        for (int i = 0; i < javaScores.length; i++) {
            for (int k = 0; k < javaScores[i].length; k++) {
                System.out.println("javaScores[" + i + "][" + k + "]=" + javaScores[i][k]);
            }
        }
    }
}
