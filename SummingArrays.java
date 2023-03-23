public class SummingArrays {
    public static int sum(int[][][] cube) {
        int result = 0;
        int size = cube[0][0].length;
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                for (int k=0; k<size; k++){
                    result += cube[i][j][k];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][][] cube1 = {
                {{1, 1}, {1, 1}, {1, 1}},
                {{1, 1}, {1, 1}, {1, 1}},
                {{1, 1}, {1, 1}, {1, 1}}
        };

        System.out.println("Should return 18 for cube1 = " + sum(cube1));

        int[][][] cube2 = {
                {{1, 0}, {1, 0}, {1, 0}},
                {{1, 0}, {1, 0}, {1, 0}},
                {{1, 0}, {1, 0}, {1, 0}},
        };

        System.out.println("Should return 9 for cube2 = " + sum(cube2));
    }
}