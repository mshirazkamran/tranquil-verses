package Ayah;

import java.io.File;

import Utils.DataUtils;

public final class AyahForSad extends Ayah {
    
    private String emoji;    
    private static final String filepath = "./src/Utils/AyahStorage/AyahForSad.txt";


    public AyahForSad (String text, String translation, String location) {
        super(text, translation, location);
        this.emoji = DataUtils.getRandomEmoji();
    }

    @Override
    public String toString() {
        return super.toString() + 
            String.format("emoji: <html> %s </html>%n", this.emoji);
    }

    // TODO: add a method that reads from the filepath and parses
    // it then sends it to the progam builder


    
    // public static void main(String[] args) {
	// 	File file = new File(filepath);
	// 	System.out.println(file.exists());
	// }
}
