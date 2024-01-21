/**
 * program
 */

public class program {
public static void main(string[] args) {
    var s = System.currentTimeMillis();


   StringBuilder sb = new StringBuilder();
   for (i = 0; i < 1000; i++) {
        sb.append("+");
    }
    System.out.println(System.currentTimeMillis() - s);
    }
}