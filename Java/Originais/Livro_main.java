import java.util.ArrayList;

import javax.sound.midi.Soundbank;

import java.nio.Buffer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Livro_main  {
    
    private static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)throws IOException {
        ArrayList <Livro> ListaLivro = new ArrayList<Livro>();

        System.out.println("Digite:"+"\n"
        +"1: Se você deseja inserir um valor"+"\n"
        +"2: Se você deseja remover um valor"+"\n"
        +"3: Se você deseja alterar um valor"+"\n"
        +"4: Se você deseja visualizar em partes"+"\n"
        +"5: Se você deseja visualizar um valor"+"\n"
        +"0: Se você deseja para o programa"+"\n");
        int Valor_entrada = Integer.parseInt(bf.readLine());

        switch (Valor_entrada) {
            case 1: inserção(ListaLivro); break;
            case 2: remoção(ListaLivro); break;
            case 3: alteração(ListaLivro); break;
            case 4: visualização(ListaLivro); break;
            case 5: visualizaçãototal(ListaLivro); break;
            case 0: break;
            default: main(args);
        }
    }

    public static void inserção(ArrayList <Livro> ListaLivro)throws IOException{
        System.out.println("Digite o Autor:");
        String autor = bf.readLine();
        System.out.println("Digie o Nome do Livro:");
        String Nome_Livro = bf.readLine();
        System.out.println("Digite o Id do Lviro:");
        int id_livro = Integer.parseInt(bf.readLine());
        System.out.println("Digite o Número da Prateleira");
        int num_prat = Integer.parseInt(bf.readLine());

        Livro x = new Livro(autor, Nome_Livro, id_livro, num_prat);
        ListaLivro.add(x);
        
        
        
    }

    public static void remoção(ArrayList <Livro> ListaLivro)throws IOException{
        System.out.println("Digite a posição que deseja deletar:");
        int del = Integer.parseInt(bf.readLine());

        ListaLivro.remove(del);   
    }

    public static void alteração(ArrayList <Livro> ListaLivro)throws IOException{
        System.out.println("Digite a posição que deseja alterar:");
        int del = Integer.parseInt(bf.readLine());

        System.out.println("Digite o novo Autor:");
        String autor = bf.readLine();
        System.out.println("Digie o novo Nome do Livro:");
        String Nome_Livro = bf.readLine();
        System.out.println("Digite o novo Id do Lviro:");
        int id_livro = Integer.parseInt(bf.readLine());
        System.out.println("Digite o novo Número da Prateleira");
        int num_prat = Integer.parseInt(bf.readLine());

        Livro x = new Livro(autor, Nome_Livro, id_livro, num_prat);
        ListaLivro.remove(del);
        ListaLivro.add(del, x);
    }

    public static void visualização(ArrayList <Livro> ListaLivro)throws IOException{
        System.out.println("Digite a posição que deseja visualizar:");
        int vs = Integer.parseInt(bf.readLine());

        System.out.println(ListaLivro.get(vs));
    }

    public static void visualizaçãototal(ArrayList <Livro> ListaLivro)throws IOException{
        ListaLivro.forEach(System.out::println);
    }
    
}
