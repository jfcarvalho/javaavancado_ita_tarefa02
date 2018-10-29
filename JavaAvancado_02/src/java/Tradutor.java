import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nessk
 */
public class Tradutor {
    
    public Tradutor()
    {
        
    }
    
    public String traduzirPalavra(String aTraduzir)
    {   
     try {
         
        FileReader arq = new FileReader("C:\\Users\\nessk\\git\\javaavancado_ita_tarefa02\\JavaAvancado_02\\traducoes.txt");
        
        BufferedReader lerArq = new BufferedReader(arq);
        String linha = lerArq.readLine(); 
        while (linha != null) {   
          linha = lerArq.readLine();
          if(linha != null) {
            String [] palavras = linha.split("/");
            if(palavras[0].equals(aTraduzir))
            {
                return palavras[1];
            }
          }
        }

        arq.close();
        
        
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
        }
       return aTraduzir;     
    }    
}
