import java.util.ArrayList;

public class Main{
    public static void main(String[] args)
    {
        
        WordChecker w = new WordChecker();
        ArrayList<String> words = new ArrayList<String>();
        words.add("to");
        words.add("too");
        words.add("stool");
        words.add("tools");
        System.out.println(words);
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
        
        ArrayList<String> skibidi = new ArrayList<String>();
        skibidi.add("an");
        skibidi.add("band");
        skibidi.add("band");
        skibidi.add("abandon");
        System.out.println(skibidi);
        WordChecker j = new WordChecker(skibidi);
        System.out.println(j.isWordChain());
        
    }
}
