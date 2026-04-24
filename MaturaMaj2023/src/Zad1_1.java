public class Zad1_1 {


    public static boolean alg(int[][] A, int n, int m){
        boolean[][] P = new boolean[n][m];
        P[0][0] = true;
        for (int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(A[i][j]==0){
                    P[i][j] = false;
                }else{
                    if(i==0 && j!=0){
                        P[i][j] = P[i][j-1];
                    }else if(i!=0 && j==0){
                        P[i][j] = P[i - 1][j];
                    }else if(i!=0 && j!=0){
                        P[i][j] = P[i][j - 1] || P[i - 1][j];
                    }
                }
            }
        }
        return P[n-1][m-1];
    }

    public static void main(String[] args) {
        int[][] A = {
            {1,1,1}, {0,1,0}, {1,1,1}
        };
        System.out.println(alg(A, 3,3));
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
        int[][] B = {
                {1,1,1}, {0,0,1}, {1,1,1}, {1,0,0}, {1,1,1}
        };
        System.out.println(alg(B, 5,3));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
        int[][] C = {
                {1,0,0,0}, {1,0,0,0}, {1,0,0,0}, {1,1,1,1}
        };
        System.out.println(alg(C, 4,4));

    }
}
