import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class opg_4 {

    /**
     *  Opgave 4:
     *  Lav et java-program som generer en tilfældig permutation af heltallene fra 0 til n − 1
     *  (for et n som er en input parameter).
     *  F.eks. kan man i Java bruge typen ArrayList, samt metoden shuffle fra Collections utility klassen.
     *  Udskriv tallene i din permutation.
     */

    private static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        list = getRandomizedList(10);
        System.out.println(list);
    }

    public static ArrayList<Integer> getRandomizedList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }
}
