import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ProgramaPrincipal {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Funcionario a = new Funcionario();

        a.dados= new DadosPessoais();
        a.dados.nome = bf.readLine();
        a.dados.endereço = new Endereço();
        a.dados.endereço.rua = bf.readLine();
        a.dados.endereço.bairro = bf.readLine();
        a.dados.endereço.numero = Integer.parseInt(bf.readLine());
        a.dados.endereço.cidade = bf.readLine();
        a.dados.endereço.estado = bf.readLine();
        a.dados.endereço.pais = bf.readLine();
        a.dados.endereço.cep = Integer.parseInt(bf.readLine());
        a.dados.nacionalidade = bf.readLine();
        a.cargo = bf.readLine();
        a.turno = bf.readLine();


        Livro b = new Livro();
        b.nome_Livro = bf.readLine();
        b.cod_Livro = Integer.parseInt(bf.readLine());
        b.midia_livro = bf.readLine();
        b.idioma_livro= bf.readLine();
        b.autor = new Autor();
        b.autor.dados= new DadosPessoais();
        b.autor.dados.nome= bf.readLine();
        b.autor.dados.endereço = new Endereço();
        b.autor.dados.endereço.rua = bf.readLine();
        b.autor.dados.endereço.bairro = bf.readLine();
        b.autor.dados.endereço.numero = Integer.parseInt(bf.readLine());
        b.autor.dados.endereço.cidade = bf.readLine();
        b.autor.dados.endereço.estado = bf.readLine();
        b.autor.dados.endereço.pais = bf.readLine();
        b.autor.dados.endereço.cep = Integer.parseInt(bf.readLine());
        b.autor.dados.nacionalidade= bf.readLine();
        b.editora_livro= bf.readLine();
        b.ano_edição = Integer.parseInt(bf.readLine());

        System.out.println(a);
        System.out.println(b);
    }
}
