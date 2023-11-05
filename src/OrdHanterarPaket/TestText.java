package OrdHanterarPaket;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestText {


    @Test
    public void testRaknaRaderEnRad() {
        String inText = "Nu är det snart jul";
        TextRaknare textRaknareEtt = new TextRaknare(inText);
        int expected = 1;
        int actual = textRaknareEtt.raknaRader();

        assertEquals(expected, actual);
    }
    @Test
    public void testRaknaTreRader(){
        String inText = "Nu är\ndet snart\njul";
        TextRaknare textRaknareEtt = new TextRaknare(inText);

        int expected =3;
        int actual = textRaknareEtt.raknaRader();
                assertEquals(expected,actual);

    }
    @Test
    public void testRaknaTecken() {
        String taInTecken = "Boom!1stop";
        TextRaknare textRaknareEtt = new TextRaknare(taInTecken);
        int expected = taInTecken.length() - 5;
        int actual = textRaknareEtt.raknaTecken();
        assertEquals(expected, actual);

    }


}














































