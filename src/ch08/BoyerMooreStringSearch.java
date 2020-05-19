public class BoyerMooreStringSearch {
    public static void main(String[] abc) {
        System.out.println("Mencoba Boyer Moore String Search");
        test("abc", "a", 0);
        test("abc", "b", 1);
        test("abc", "c", 2);
        test("abc", "d", -1);
        test("catdog", "tdo", 2);
        test("ratatat", "at", 1);
        test("foo", "", 0);
        test("", "bar", -1);
    }

    public static void test(String text, String word, int exp) {
        char[] textC = text.toCharArray();
        char[] wordC = word.toCharArray();
        int result = 0;
        if (result == exp)
            System.out.println("LEWAT");
        else {
            System.out.println("GAGAL");
            System.out.println("\ttext: " + text);
            System.out.println("\tword: " + word);
            System.out.println("\texp: " + exp + ", res: " + result);
        }
    }
}