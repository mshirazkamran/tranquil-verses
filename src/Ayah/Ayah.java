package Ayah;

public class Ayah {
    
    private String text;
    private String translation;
    private String location; // location of ayah

    public Ayah(String text, String translation, String location) {
        this.text = text;
        this.translation = translation;
        this.location = location;
    }


    @Override
    public String toString() {
        return "Ayah: " + text 
        + ",\ntranslation: " + translation 
        + ",\nlocation: " + location + "\n";
    }

    
    

    
}
