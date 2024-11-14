package Ayah;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

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
            "<br>emoji: " + this.emoji + "</html>";
    }

   

    public static ArrayList<AyahForSad> loadAyahsForSadFromFile() {

        ArrayList<AyahForSad> ayahs = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath, StandardCharsets.UTF_8));
            ArrayList<String> data = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                data.add(line);
            }

            for (int i = 0; i < data.size(); i++) {
                String[] pieces = data.get(i).split(",");
                ayahs.add(new AyahForSad(pieces[0], pieces[1], pieces[2]));   
            }

        } catch (Exception e) {
            System.out.println("Error during reading the file: " + filepath);
        }

        return ayahs;
    }

}
