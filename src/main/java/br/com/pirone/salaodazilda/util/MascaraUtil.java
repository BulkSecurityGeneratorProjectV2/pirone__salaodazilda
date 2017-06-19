package br.com.pirone.salaodazilda.util;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class MascaraUtil {
	
    public static String formatarString(String texto, String mascara) throws ParseException {
        MaskFormatter mf = new MaskFormatter(mascara);
        mf.setValueContainsLiteralCharacters(false);
        return mf.valueToString(texto);
    }

}
