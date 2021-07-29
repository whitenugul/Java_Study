public class Main3 {
    public static void main(String[] args) {
        int[] a = new int[5];
        for (int i = 0; i < 5; i++){
            a[i] = 5-i;
        }
        for (int j = 0; j < 5; j++){
            System.out.println("a["+j+"] = "+a[j]);
        }

    }
}
