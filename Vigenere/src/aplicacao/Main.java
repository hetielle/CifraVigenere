package aplicacao;

import util.Criptografia;

public class Main {

	public static void main(String[] args) {
		String chave = "BQWJB";
		String frase =  "RKWWEPJEEFSVEWBMYVJEPKIJNFJWWBPEHQFQQNJFMQYXNPQHROIQZNDIUCJEBEHQFDEIXPQEJCPEULJSUYZJQBHWBVBFNXYJCWLPOGQRTUQ";
		
		System.out.println("Mensagem descriptografada: " + Criptografia.decifrar(chave, frase));
	}
}
