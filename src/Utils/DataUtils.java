package Utils;

import java.util.List;
import java.util.Random;

public class DataUtils {
    
    private static final List<String> emojis
         = List.of("😊","❤️","💕","🙌","💖","❣️","💟");

    private static final List<String> hadith
        = List.of(
            "Beware of suspicion for it is the most untruthful type of speech"
        );

    private static final List<String> quranicFacts
        = List.of(
            "25 Prophets are mentioned in the Holy Quran"
        );

    private static final List<String> tips
        = List.of(
            "Practice Silence"
        );

    public static String getRandomEmoji() {
        Random rand = new Random();
        int randInt = rand.nextInt(emojis.size());
        return emojis.get(randInt);
    }
    
    public static String getRandomHadith() {
        Random rand = new Random();
        int randInt = rand.nextInt(hadith.size());
        return hadith.get(randInt);
    }

    public static String getRandomQuranicFact() {
        Random rand = new Random();
        int randInt = rand.nextInt(quranicFacts.size());
        return quranicFacts.get(randInt);
    }

    public static String getRandomTip() {
        Random rand = new Random();
        int randInt = rand.nextInt(tips.size());
        return tips.get(randInt);
    }
}
