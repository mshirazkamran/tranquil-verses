package Ayah;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import Utils.DataUtils;

public final class AyahForAngry extends Ayah {
    
	private String tip;
	private static final String filepath = "./src/Utils/AyahStorage/AyahForAngry.txt";

	public AyahForAngry (String text, String translation, String location) {
        super(text, translation, location);
        this.tip = DataUtils.getRandomTip();        
    }


    @Override
    public String toString() {
        return super.toString() + 
            "<br>Tip: " + this.tip + "</html>";
    }


    public static ArrayList<AyahForAngry> loadAyahsForAngryFromFile() {

        ArrayList<AyahForAngry> ayahs = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath, StandardCharsets.UTF_8));
            ArrayList<String> data = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                data.add(line);
            }

            for (int i = 0; i < data.size(); i++) {
                String[] pieces = data.get(i).split(",");
                ayahs.add(new AyahForAngry(pieces[0], pieces[1], pieces[2]));   
            }

        } catch (Exception e) {
            System.out.println("Error during reading the file: " + AyahForAngry.class);
        }

        return ayahs;
    }
    

}
