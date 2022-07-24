import java.util.Arrays;

public class PartitionPilindromII {
    public static void main(String[] args) {


        String s = "abccbc";

        int n = s.length();
        boolean[][] dp1 = new boolean[n][n];
        for(int g=0; g<n; g++){
            for(int i=0, j=g; j<n; i++, j++) {
                if (i == j){
                    dp1[i][j] = true;
                }else if(s.charAt(i) == s.charAt(j)) {
                    if (Math.abs(i - j) > 1) {
                        dp1[i][j] = dp1[i + 1][j - 1];
                    } else {
                        dp1[i][j] = true;
                    }
                }
//                System.out.print(" (" + i + ", " + j + ") -> "+ dp1[i][j]);
            }
//            System.out.println("");
        }
        int[][] dp2 = new int[n][n];
        for (int g=0; g<n; g++){
            for(int i=0, j=g; j<n; j++, i++){
                for(int k=0; k<n; k++){



                }
            }
        }

        for (boolean[] d: dp1){
            System.out.println(Arrays.toString(d));
        }
        int[] a = {1,2,3, 4};

        Arrays.stream(a).sum();

    }
}
