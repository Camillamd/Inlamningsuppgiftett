package OrdHanterarPaket;
import java.util.Scanner;


public class TextHanterarMain {

    public static void main(String[] args) {


        String taImotText = lasInText();
        TextRaknare textRaknareEtt = new TextRaknare(taImotText);


        int antalInmatadeRader = textRaknareEtt.raknaRader();
        System.out.println("Antal rader:" + antalInmatadeRader);

        int inmatadeAntalTecken = textRaknareEtt.raknaTecken();
        System.out.println("Antal tecken är: " + inmatadeAntalTecken);


    }


    private static String lasInText() {
        Scanner konsollasare = new Scanner(System.in);
        String helaTexten = "";

        System.out.println("Skriv in din önskade text. För att avsluta skriver du stop ");

        boolean finnsStop = false;
        while (finnsStop == false) {
            String inText = konsollasare.nextLine() + "\n";
            helaTexten = helaTexten + inText;

            finnsStop = inText.contains("stop");
        }
        return helaTexten;
    }


}












