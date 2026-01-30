public class Method {
    public int SubNumber(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int SubNumber(int a, int b, int c) {
        int sub = a + c;
        return sub;
    }

    public static void main(String[] args) {
        Method m = new Method();
        System.out.println(m.SubNumber(4, 2, 4));
    }
}
