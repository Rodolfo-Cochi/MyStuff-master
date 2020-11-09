package Code;

import Code.Continua;
import java.util.Scanner;

public class Cript {
    public static void criptografar() {
        try (Scanner scanner = new Scanner(System.in)) {

            // senha a ser criptografada
            System.out.println("Digite sua senha: ");
            String senha = scanner.nextLine();
            String[] letras = new String[20];
            String senhac = "";

            // Criptografia
            int i = 1;
            
            letras[i] = senha.substring(i - 1, i);
            System.out.println(letras[i]);
            while (Code.Continua.continua(i, senha)) {

                letras[i] = senha.substring(i - 1, i);

                if (letras[i].equals("q")) {
                    letras[i] = "w";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("w")) {
                    letras[i] = "e";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("e")) {
                    letras[i] = "r";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("r")) {
                    letras[i] = "t";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("t")) {
                    letras[i] = "y";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("y")) {
                    letras[i] = "u";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("u")) {
                    letras[i] = "i";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("i")) {
                    letras[i] = "o";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("p")) {
                    letras[i] = "a";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("a")) {
                    letras[i] = "s";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("s")) {
                    letras[i] = "d";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("d")) {
                    letras[i] = "f";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("f")) {
                    letras[i] = "g";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("g")) {
                    letras[i] = "h";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("h")) {
                    letras[i] = "j";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("j")) {
                    letras[i] = "k";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("k")) {
                    letras[i] = "l";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("l")) {
                    letras[i] = "z";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("z")) {
                    letras[i] = "x";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("x")) {
                    letras[i] = "c";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("c")) {
                    letras[i] = "v";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("v")) {
                    letras[i] = "b";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("b")) {
                    letras[i] = "n";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                } else if (letras[i].equals("n")) {
                    letras[i] = "m";
                    senhac += letras[i];
                    i++;
                    Code.Continua.continua(i, senha);
                }
                System.out.println(senhac);
            }
        }
    }
}
