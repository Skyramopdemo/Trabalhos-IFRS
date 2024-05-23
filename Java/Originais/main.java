import java.nio.Buffer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException{
        Jogador j1 = cadastrar();
        Jogador j2 = cadastrar();
        Jogador j3 = cadastrar();
        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j3);
        
    }

    public static Jogador cadastrar()  throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Jogador j1 = new Jogador();

        System.out.println("Id:");
        j1.id = Integer.parseInt(bf.readLine());
        System.out.println("Apelido:");
        j1.apelido = bf.readLine();
        System.out.println("Cartões Amarelos:");
        j1.cartoes = Integer.parseInt(bf.readLine());
        System.out.println("Cartões Vermelhos:");
        j1.cartoes = Integer.parseInt(bf.readLine());
        System.out.println("Nome:");
        j1.nome = bf.readLine();
        System.out.println("Ano de nascimento:");
        j1.datanascimento.ano = Integer.parseInt(bf.readLine());
        System.out.println("Dia de Nascimento:");
        j1.datanascimento.dia = Integer.parseInt(bf.readLine());
        System.out.println("Mes de Nascimento:");
        j1.datanascimento.mes = Integer.parseInt(bf.readLine());
        System.out.println("Numero:");
        j1.numero = Integer.parseInt(bf.readLine());
        System.out.println("Suspenso:");
        j1.suspenso = Boolean.parseBoolean(bf.readLine());
        System.out.println("Posicao:");
        j1.posicao = bf.readLine();
        System.out.println("Qualidade:");
        j1.qualidade = Integer.parseInt(bf.readLine());

        return j1;
    }
}
