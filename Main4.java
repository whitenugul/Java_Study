public class Main4 {
    public static void main(String[] args) {
        double[] a = new double[5];
        for (int i = 0; i < 5; i++){
            a[i] = (i+1)*1.1;
        }
        for (int j = 0; j < 5; j++){
            System.out.println("a["+j+"] = "+a[j]);
        }

    }
}
