public class Majority_Element {
    public static void main(String[] args) {

    }

    public static int moore_voting(int arr[]) {
        int e = arr[0];
        int vote = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == e) {
                vote++;
            } else {
                vote--;
                if (vote == 0) {
                    e = arr[i];
                    vote = 1;
                }
            }
        }
        return e;
    }
}
