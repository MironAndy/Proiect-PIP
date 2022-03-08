import java.util.Hashtable;
import java.util.Scanner;

public class AnagramsSolution {
    static boolean isAnagram(String a, String b) {
        Hashtable <Character, Integer> hm1 = new Hashtable<Character, Integer>();
        for (int i = 0; i < a.length(); i++) {
            if (hm1.containsKey(a.charAt(i))) {
                int v = hm1.get(a.charAt(i)) + 1;
                hm1.put(a.charAt(i), v);
            } else {
                hm1.put(a.charAt(i), 1);
            }
        }
        Hashtable<Character, Integer> hm2 = new Hashtable<Character, Integer>();
        for (int i = 0; i < b.length(); i++) {
            if (hm2.containsKey(b.charAt(i))) {
                int v = hm2.get(b.charAt(i)) + 1;
                hm2.put(b.charAt(i), v);
            } else {
                hm2.put(b.charAt(i), 1);
            }
        }
        //am adaugat ceva nou
        return hm1.equals(hm2);// I change "==" with equals
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

