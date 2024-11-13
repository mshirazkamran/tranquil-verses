package Ayah;

import java.util.Random;

import Utils.DataUtils;

public final class AyahForSad extends Ayah {
    
    private String emoji;    
    private static final String filepath = "";


    public AyahForSad (String text, String translation, String location) {
        super(text, translation, location);
        Random rand = new Random();
        int randInt = rand.nextInt(7);
        this.emoji = DataUtils.getRandomEmoji();
    }

    @Override
    public String toString() {
        return super.toString() + 
            String.format("emoji: <html> %s </html>%n", this.emoji);
    }
}
