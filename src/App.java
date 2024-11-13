import Ayah.Ayah;
import ProgramBuilder.ProgramBuilder;

public class App {

    public static void main(String[] args)  {
       
        ProgramBuilder.runProgram(new Ayah(null, null, null));

        // String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        // System.out.println("Available Fonts:");
        // for (String font : fonts) {
        //     System.out.println(font);
        // }
    }
}
