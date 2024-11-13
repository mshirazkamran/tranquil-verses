package Ayah;

import java.io.File;

public class AyahForAngry extends Ayah {
    
	private String tip;
	private static final String filepath = "./src/Utils/AyahStorage/AyahForAngry.txt";

	public AyahForAngry (String text, String translation, String location) {
        super(text, translation, location);
        //TODO: add tip from data utils
    }


    @Override
    public String toString() {
        return super.toString() + 
        String.format("tip: %s%n", this.tip);
    }

    // TODO: add a method that reads from the filepath and parses
    // it then sends it to the progam builder


	
	// public static void main(String[] args) {
	// 	File file = new File(filepath);
	// 	System.out.println(file.exists());
	// }



}
