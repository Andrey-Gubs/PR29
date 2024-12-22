import java.util.Scanner;

public class MilkyWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N == 0) {
            System.out.println(0);
            return;}

        int[][] adjacencyMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                adjacencyMatrix[i][j] = scanner.nextInt();}}

        int roadsCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    roadsCount++;}}}

        System.out.println(roadsCount);
        scanner.close();
    }}
