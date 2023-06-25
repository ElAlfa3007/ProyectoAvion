package Negocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hora {
    String hora;
    String minuto;
    String segnudo;

    public boolean verificarHora(String hora) {
        Pattern pat = Pattern.compile("([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d");
        Matcher mat = pat.matcher(hora);
        return mat.matches()? true:false;
    }
}
