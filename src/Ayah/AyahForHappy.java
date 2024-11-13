package Ayah;

import java.io.File;

public class AyahForHappy extends Ayah {
    
    private String quranicFact;
    private static final String filepath = "./src/Utils/AyahStorage/AyahForHappy.txt";

    public AyahForHappy (String text, String translation, String location) {
        super(text, translation, location);
        //TODO: add quranic fact from data utils
    }


    @Override
    public String toString() {
        return super.toString() + 
            String.format("Quranic Fact: %s%n", this.quranicFact);
    }


    // TODO: add a method that reads from the filepath and parses
    // it then sends it to the progam builder


    
    // public static void main(String[] args) {
	// 	File file = new File(filepath);
	// 	System.out.println(file.exists());
	// }
}
