package Ayah;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import Utils.DataUtils;

public final class AyahForHappy extends Ayah {
    
    private String quranicFact;
    private static final String filepath = "./src/Utils/AyahStorage/AyahForHappy.txt";

    public AyahForHappy (String text, String translation, String location) {
        super(text, translation, location);
        this.quranicFact = DataUtils.getRandomQuranicFact();
    }


    @Override
    public String toString() {
        return super.toString() + 
            String.format("Quranic Fact: %s%n", this.quranicFact);
    }


    public static ArrayList<AyahForHappy> loadAyahsForHappyfromFile() {

        ArrayList<AyahForHappy> ayahs = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath, StandardCharsets.UTF_8));
            List<String> data = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                data.add(line);
            }

            for (int i = 0; i < data.size(); i++) {
                String[] pieces = data.get(i).split(",");
                ayahs.add(new AyahForHappy(pieces[0], pieces[1], pieces[2]));   
                System.out.println(ayahs.get(i));
            }

        } catch (Exception e) {
            System.out.println("Error during reading the file: " + filepath);
        }

        return ayahs;
    }
    
}
