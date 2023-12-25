package util;

public class Criptografia {

	public static String decifrar(String chave, String frase) {
        String fraseFinal = "";

        String fraseChave = "";

        while(fraseChave.length() < frase.length()){

            for (int i = 0; i < chave.length(); i++) {

                fraseChave += chave.charAt(i);
                if(fraseChave.length() == frase.length()){
                    break;
                }

            }
        }

        for(int i = 0; i < frase.length(); i++){
            String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int letraDecifradaInt;

            int diferenca = frase.charAt(i) - fraseChave.charAt(i);

            if(diferenca < 0){
                letraDecifradaInt = 26 + diferenca;
            }
            else {
                letraDecifradaInt = diferenca;
            }

            char letraDecifrada = alfabeto.charAt(letraDecifradaInt);

            fraseFinal += letraDecifrada;
        }

        return fraseFinal;
    }
}
