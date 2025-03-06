public class Main14 {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] result = createArray(5, 10);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}