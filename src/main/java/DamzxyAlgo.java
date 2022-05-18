
public class DamzxyAlgo {
    int multiplier = 98;


    public String code (String str){
        StringBuilder b = new StringBuilder();

        for (char c : str.toCharArray()){
            System.out.println(c + " === " + (int) c );
            b.append((int) c);
        }

        return b.toString();
    }
}
