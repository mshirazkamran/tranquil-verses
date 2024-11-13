package Utils;

import java.util.List;
import java.util.Random;

public class DataUtils {
    
    private static final List<String> emojis
         = List.of("😊","❤️","💕","🙌","💖","❣️","💟");

         
    private static final List<String> hadith
        = List.of(
 
        );


    private static final List<String> quranicFacts
        = List.of(

        );


    private static final List<String> tips
        = List.of(

        );

    


    public static String getRandomEmoji() {

        Random rand = new Random();
        int randInt = rand.nextInt(7);
        return emojis.get(randInt);
    }
    

    // TODO: add method to get random hadith

    // TODO: add method to get random quranic facts

    // TODO: add method to get random tips

}
