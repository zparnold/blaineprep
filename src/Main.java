import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Resource ft = new Firetruck();
        Resource ft2 = new Firetruck(55);
        Resource bh = new Bullhorn();
        Collection<Resource> cr = new ArrayList<>();
        cr.add(ft);
        cr.add(ft2);
        cr.add(bh);

        for (int i = 0; i < cr.size(); i++){
            System.out.println(((ArrayList<Resource>) cr).get(i).performTask());
        }

    }
}
