package classes;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Inicializar {
    
    boolean verficArquivos = true;
    
    public void Pasta() {
        //Criar as Pastas raiz
        new File (System.getProperty("user.home") + "\\PI Chamados").mkdir();
        new File (System.getProperty("user.home") + "\\PI Chamados\\novo").mkdir();
        new File (System.getProperty("user.home") + "\\PI Chamados\\registros").mkdir();
        new File (System.getProperty("user.home") + "\\PI Chamados\\temp").mkdir();
        new File (System.getProperty("user.home") + "\\PI Chamados\\temp\\users").mkdir();
        new File (System.getProperty("user.home") + "\\PI Chamados\\temp\\config").mkdir();
        new File (System.getProperty("user.home") + "\\PI Chamados\\temp\\backup").mkdir();
    }
    
    public boolean Arquivos(){
        //Criar os arquivos de usuario
        try {
            File arquivo5 = new File("C:\\PI Chamados\\log.");
            arquivo5.createNewFile();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro 0001");
            verficArquivos = false;
        }
        
        
        
        return verficArquivos;
    }
    
}
