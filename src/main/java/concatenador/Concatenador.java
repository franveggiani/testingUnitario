package concatenador;

public class Concatenador {

    public static String concatenar(String a, String b){
        String frase = a.concat(b);
        return frase;
    }

    public static String duplicarFrase(String frase){
        String fraseDuplicada = frase.concat(frase);
        return fraseDuplicada;
    }
}
