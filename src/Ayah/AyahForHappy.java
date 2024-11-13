package Ayah;

public class AyahForHappy extends Ayah {
    
    private String quranicFact;
    private static final String filepath = "";

    public AyahForHappy (String text, String translation, String location) {
        super(text, translation, location);
        //TODO: add quranic fact from data utils
    }


    @Override
    public String toString() {
        return super.toString() + 
            String.format("Quranic Fact: %s%n", this.quranicFact);
    }


}
