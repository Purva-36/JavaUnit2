public class CallByValue {
    public static void main(String[] args) {
        System.out.println("CallByVal: ");
        int n = 23;
        changee(n);
        System.out.println(n);
    }

    private static void changee(int n) {
        n = n+1;

    }
}
