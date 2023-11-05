package OrdHanterarPaket;

public class TextRaknare {


    private String texten;//bööö

    public TextRaknare(String inTexten) {

        texten = inTexten;

    }


    public int raknaRader() {
        String[] radArray = texten.split("\\r\\n|\\r|\\n");
        int antalRader = radArray.length;
        return antalRader;
    }

    public int raknaTecken() {
        int antalTecken = texten.length();
        antalTecken = antalTecken - 5;

        return antalTecken;
    }


}













