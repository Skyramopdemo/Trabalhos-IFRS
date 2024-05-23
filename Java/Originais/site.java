import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.nio.Buffer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class site {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        
        HashMap<String, String> paises = new HashMap<>();

        paises.put("brasil", "Feliz Natal!");
        paises.put("alemanha", "Frohliche Weihnachten!");
        paises.put("austria", "Frohe Weihacht!");
        paises.put("coreia", "Chuk Sung Tan!");
        paises.put("grecia", "Kala Christougena!");
        paises.put("estados-unidos", "Merry Christmas!");
        paises.put("inglaterra", "Merry Christmas!");
        paises.put("austria", "Merry Christmas!");
        paises.put("portugal", "Feliz Natal!");
        paises.put("suecia", "God Jul!");
        paises.put("turquia", "Mutlu Noeller!");
        paises.put("argentina", "Feliz Navidad!");
        paises.put("chile", "Feliz Navidad!");
        paises.put("mexico", "Feliz Navidad!");
        paises.put("antardida", "Merry Christmas!");
        paises.put("canada", "Merry Christmas!");
        paises.put("irlanda", "Nollaig Shona Dhuit!");
        paises.put("belgica", "Zalig Kerstfesst!");
        paises.put("italia", "Buon Natale!");
        paises.put("libia", "Buon Natale!");
        paises.put("siria", "Milad Mubarak!");
        paises.put("marrocos", "Milad Mubarak!");
        paises.put("japao", "Merii Kurisumasu!");

        System.out.println("paises disponiveis"+paises.keySet());

        System.out.println("Escreva o pais: ");
        String texto = bf.readLine();     
        texto=texto.toLowerCase();

        System.out.println(paises.get(texto));
    }
}
