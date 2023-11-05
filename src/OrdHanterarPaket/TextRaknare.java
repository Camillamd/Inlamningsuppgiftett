package OrdHanterarPaket;

public class TextRaknare {


    private String texten;

    public TextRaknare(String inTexten) {

        texten = inTexten;//////hej å hå

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













