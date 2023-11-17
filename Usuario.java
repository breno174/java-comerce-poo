package questoestrab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Usuario extends Pessoa {
	private String arquivoUm;
	
	public Usuario(String name) {
		super(name);
		this.arquivoUm = "C:\\Users\\alunok10\\Desktop\\TrabalhoPOOsite\\java-comerce-poo\\questoestrab\\arquivostxt\\usuarios.txt";
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		ArrayList<String> linhas = this.lerLinhasDoArquivo(this.arquivoUm);
		System.out.println(linhas);
		for (String linhasString : linhas) {
			String[] partes = linhasString.split(";");
			if (username.equals(partes[0])) {
				return password.equals(partes[1]);
			}
		}
		return false;
	}
	
	private ArrayList<String> lerLinhasDoArquivo(String caminhoArquivo) {
        ArrayList<String> linhas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linhas;
    }
	
	public static void main(String[] args) {
		Usuario user = new Usuario("afonso");
		if (user.login("afonso", "1234")) {
			System.out.println("login bem feito");
		}
		else {
			System.out.println("login deu errado");
		}
	}
}
