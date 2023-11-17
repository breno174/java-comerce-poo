package questoestrab;

import javax.swing.*;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SistemaJava extends JFrame {
    private String arquivoUm;

    public SistemaJava() {
        this.arquivoUm = "C:\\Users\\alunok10\\Desktop\\TrabalhoPOOsite\\java-comerce-poo\\questoestrab\\arquivostxt\\biblioteca.txt";
    }

    public void ShowGUI() {
        setTitle("Exemplo de Lista GUI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ArrayList<String> elementosLista = lerLinhasDoArquivo(this.arquivoUm);

        try {
            String[] arrayElementos = new String[elementosLista.size()];
            elementosLista.toArray(arrayElementos);
            JList<String> lista = new JList<>(arrayElementos);
            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            for (String linha : elementosLista) {
                textArea.append(linha + "\n");
            }
            JScrollPane painelRolagem = new JScrollPane(textArea);
            add(painelRolagem, BorderLayout.CENTER);
            setLocationRelativeTo(null);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao mostrar GUI: " + e);
        }
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
    
    public void MostrarProdutos() {
    	SwingUtilities.invokeLater(() -> {
            SistemaJava showsistema = new SistemaJava();
            showsistema.ShowGUI();
            showsistema.setVisible(true);
        });
    }
    
    public static void main(String[] args) {
		// tem que começar fazendo o login
    	// tem que fazer um loop para fazer o login, se válido, 
    	// dar as opções do que o usuário quer fazer; 
    	// - mostrar produtos
    	// - criarproduto
    	// - ...
	}
}
