package Ayah;

import java.io.File;

public final class AyahForNeutral extends Ayah {
    
    private String hadith;
    private static final String filepath = "./src/Utils/AyahStorage/AyahForNeutral.txt";

    public AyahForNeutral (String text, String translation, String location) {
        super(text, translation, location);
        //TODO: add hadith from data utils
    }

    @Override
    public String toString() {
        return super.toString() + 
            String.format("hadith: %s%n", this.hadith);
    }

    // TODO: add a method that reads from the filepath and parses
    // it then sends it to the progam builder


    
    // public static void main(String[] args) {
	// 	File file = new File(filepath);
	// 	System.out.println(file.exists());
	// }

}
