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


    // used html tages here because java GUI needs these tags to 
    // display the newlines, note that <br> === \n
    @Override
    public String toString() {
        return "<html>" + text + "<br>translation: " + translation 
        + "<br>location: " + location;
    }

    
    

    
}
