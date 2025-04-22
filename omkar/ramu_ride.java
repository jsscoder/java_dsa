import java.util.*;

public class ramu_ride {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] rickshaw = new int[n];
            int[] cab = new int[m];
            for (int i = 0; i < rickshaw.length; i++) {
                rickshaw[i] = sc.nextInt();
            }
            for (int i = 0; i < cab.length; i++) {
                cab[i] = sc.nextInt();
            }
            System.out.println(min_sum(c1, c2, c3, c4, rickshaw, cab));

            sc.close();
            t--;
        }

    }

    public static int min_sum(int c1, int c2, int c3, int c4, int[] rickshaw, int[] cab) {
        int rickshaw_cost = 0;
        int control_cost = 0;
        for (int i = 0; i < rickshaw.length; i++) {
            rickshaw_cost = rickshaw_cost + Math.min(rickshaw[i] * c1, c2);
        }
        rickshaw_cost = Math.min(rickshaw_cost, c3);
        int cab_cost = 0;
        for (int i = 0; i < cab.length; i++) {
            cab_cost = cab_cost + Math.min(cab[i] * c1, c2);
        }
        cab_cost = Math.min(cab_cost, c3);
        int total_cost = rickshaw_cost + cab_cost;
        return Math.min(total_cost, c4);

    }

}
