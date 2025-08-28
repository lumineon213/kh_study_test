package work_java;

public class test
{
    public static void main(String[] args) {
        int[][] tab = new int[3][4];
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                int value = (int)Math.round(Math.random() * 9); // 0~9 난수
                tab[i][j] = value;
                System.out.print(tab[i][j] + "\t");
                sum += tab[i][j];
            }
            System.out.println();
        }
        System.out.println("합은 " + sum);
    }
}
