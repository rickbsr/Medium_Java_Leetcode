package com.rick.problems;

public class ImageSmoother {

    public static void main(String[] args) {
        int[][] M = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] res = new ImageSmoother().imageSmoother(M);
        for (int[] arr : res) for (int i : arr) System.out.print(i + " ");
    }

    public int[][] imageSmoother(int[][] M) {
        int n = M.length, m = M[0].length, sum = 0, cnt = 0;
        int[][] res = new int[n][m];
        int[][] dir = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                sum = 0;
                cnt = 0;
                for (int k = 0; k < 9; k++)
                    if (0 <= i + dir[k][0] && i + dir[k][0] < n && 0 <= j + dir[k][1] && j + dir[k][1] < m) {
                        sum = sum + M[i + dir[k][0]][j + dir[k][1]];
                        cnt++;
                    }
                res[i][j] = sum / cnt;
            }
        return res;
    }
}
