class Solution {
    public int solution(int[][] triangle) {
        
        int height = triangle.length;
        
        for(int i= 1; i<height; i++) {
            for(int j=0; j<triangle[i].length; j++) {
                if(j==0) {
                    triangle[i][j] += triangle[i-1][j];
                } else if(j==i) {
                    triangle[i][j] += triangle[i-1][j-1];
                } else {
                    triangle[i][j] = Math.max(triangle[i][j] + triangle[i-1][j-1], triangle[i][j] + triangle[i-1][j]);
                }
            }
        }
        int max=0;
        for(int i=0; i<triangle[height-1].length; i++) {
            if(max < triangle[height-1][i]) {
                max = triangle[height-1][i];
            }
        }
        return max;
    }
}