/**
 * program
 */

public class program {
public static void main(String[] args) {
    var s = System.currentTimeMillis();


   StringBuilder sb = new StringBuilder();
   for (int i = 0; i < 100000000; i++) {
        sb.append("+");
    }
    System.out.println(System.currentTimeMillis() - s);
    }
}