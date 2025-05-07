class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        int x = 0, y = 0, dir = 0;
        for (int i = 1; i <= n * n; i++) {
            arr[x][y] = i;
            visited[x][y] = true;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || nx >= n || ny < 0 || ny >= n || visited[nx][ny]) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            x = nx;
            y = ny;
        }

        return arr;
    
        
    }
}