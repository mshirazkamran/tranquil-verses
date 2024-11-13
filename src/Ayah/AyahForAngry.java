package Ayah;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

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


    public static ArrayList<AyahForAngry> loadAyahsForAngryFromFile() {

        ArrayList<AyahForAngry> ayahs = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            List<String> data = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                data.add(line);
            }

            for (int i = 0; i < data.size(); i++) {
                String[] pieces = data.get(i).split(",");
                ayahs.add(new AyahForAngry(pieces[0], pieces[1], pieces[2]));   
                System.out.println(ayahs.get(i));
            }

        } catch (Exception e) {
            System.out.println("Error during reading the file: " + AyahForAngry.class);
        }

        return ayahs;
    }
    

}
