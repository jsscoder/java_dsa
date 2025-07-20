import java.util.Arrays;

public class ValentineRussia {
    public static void main(String[] args) {

        int[] boys = { 2, 11, 3 };
        int[] girls = { 5, 7, 3, 2 };
        
        Arrays.sort(boys);
        Arrays.sort(girls);
        System.out.println(Valentine(boys, girls, 0, 0));

    }

    public static int Valentine(int[] boys, int[] girls, int i, int j) {
        if(i==boys.length){
            return 0;
        }if(j==girls.length){
            return 9998788;
        }
        int selection = Math.abs(boys[i] - girls[j]) + Valentine(boys, girls, i + 1, j + 1);
        int rejection = Valentine(boys, girls, i, j + 1);
        return Math.min(selection, rejection);
    }
}
