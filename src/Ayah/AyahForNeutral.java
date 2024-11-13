package Ayah;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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

    public static ArrayList<AyahForNeutral> loadAyahsForNeutralFromFile() {

        ArrayList<AyahForNeutral> ayahs = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            List<String> data = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                data.add(line);
            }

            for (int i = 0; i < data.size(); i++) {
                String[] pieces = data.get(i).split(",");
                ayahs.add(new AyahForNeutral(pieces[0], pieces[1], pieces[2]));   
                System.out.println(ayahs.get(i));
            }

        } catch (Exception e) {
            System.out.println("Error during reading the file: " + filepath);
        }

        return ayahs;
    }
        


    public static void main(String[] args) {

        
    }


    
    // public static void main(String[] args) {
	// 	File file = new File(filepath);
	// 	System.out.println(file.exists());
	// }

}
