package Ayah;

public final class AyahForNeutral extends Ayah {
    
    private String hadith;
    private static final String filepath = "";

    public AyahForNeutral (String text, String translation, String location) {
        super(text, translation, location);
        //TODO: add hadith from data utils
    }

    @Override
    public String toString() {
        return super.toString() + 
            String.format("hadith: %s%n", this.hadith);
    }
}
