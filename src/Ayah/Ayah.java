package Ayah;

public class Ayah {
    
    private final String text;
    private String translation;
    private final String location; // location of ayah

    
    protected Ayah(String text, String translation, String location) {
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
