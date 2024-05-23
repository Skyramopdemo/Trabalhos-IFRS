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


public class mapa {
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        
        HashMap<Integer, String> mapa1 = new HashMap<>();

        
        System.out.println("Escreva o texto: ");
        String texto = bf.readLine().replaceAll(",", " ");     
        
        texto=texto.toLowerCase();
        texto = texto.replaceAll("\"", " ");
        texto = texto.replaceAll("[.]", " ");
        texto = texto.replaceAll(":", " ");

        HashSet<String> list = new HashSet<>();
        list.addAll(Arrays.asList(texto.split(" ")));
        
        List<String> list2 = new ArrayList<>();

        list2.addAll(list);

        Collections.sort(list2);

        
        for (int i = 0; i < list2.size(); i++) {
            if (i > 5000){
                break;
            }
            else{
                System.out.println(list2.get(i));
            }
    

        }
        } 
    
        
    }

       
    

