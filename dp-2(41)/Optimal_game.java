public class Optimal_game {

    public static void main(String[] args) {

        int[] arr = { 2, 1, 13, 4 };
        System.out.println(Optimal_game_strategy(arr, 0, arr.length - 1));

    }

    public static int Optimal_game_strategy(int arr[], int i, int j) {
        if (i > j) {
            return 0;
        }
        int f = arr[i] + Math.min(Optimal_game_strategy(arr, i + 2, j), Optimal_game_strategy(arr, i + 1, j - 1));
        int l = arr[i] + Math.min(Optimal_game_strategy(arr, i + 1, j - 1), Optimal_game_strategy(arr, i, j - 2));

        return Math.max(f, l);
    }
}