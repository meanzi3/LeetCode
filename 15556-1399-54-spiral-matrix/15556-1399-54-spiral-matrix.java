import java.util.*;

class Solution {

    private static int[] dr = {0, 1, 0, -1};
    private static int[] dc = {1, 0, -1, 0};

    private static boolean[][] visited;

    public List<Integer> spiralOrder(int[][] matrix) {
      int m = matrix.length;
      int n = matrix[0].length;

      visited = new boolean[m][n];

      List<Integer> answer = new ArrayList<>();

      int cnt = 0;
      int matrixSize = m * n;

      int r = 0;
      int c = 0;
      int d = 0;

      while(cnt < matrixSize){
        answer.add(matrix[r][c]);
        visited[r][c] = true;

        int nr = r + dr[d];
        int nc = c + dc[d];

        // 꺾어야 하는 부분인지 확인
        if(nr < 0 || nr >= m || nc < 0 || nc >= n || visited[nr][nc]){
          d = (d + 1) % 4;
        }

        r = r + dr[d];
        c = c + dc[d];

        cnt++;
      }

      return answer;

    }
}