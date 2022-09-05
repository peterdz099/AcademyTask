import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for(int i=0; i< args.length; i++){
            builder.append(args[i].toLowerCase());
        }


        String argument = builder.toString();
        Map<String,Integer> letters = new HashMap<String,Integer>();
        int a =0;
        for(int i=0; i < argument.length(); i++){
            String letter = String.valueOf(argument.charAt(i));
            if(letters.containsKey(letter)){
                letters.put(letter, letters.get(letter) + 1111);
            }else{
                letters.put(letter, 1);
            }
        }
        TreeMap<String, Integer> sorted = new TreeMap<>();

        sorted.putAll(letters);

        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }
}
