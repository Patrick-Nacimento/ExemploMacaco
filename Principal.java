
import javax.swing.JOptionPane;



/**
 *
 * @author Patrick
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa lucas = new Pessoa();
        lucas.nome = "Lucas";
        lucas.idade = 16;
        lucas.peso = 94.0f;
        lucas.altura = 1.94f;
        lucas.sexo = 'm';
        lucas.cpf = "123.555.874-12";
        lucas.sobrenome = "Rodrigo";
        
        Pessoa carlos = new Pessoa();
        carlos.nome = "Carlos";
        carlos.idade = 18;
        carlos.peso = 78;
        carlos.altura = 1.78f;
        carlos.sexo = 'm';
        carlos.cpf = "173.554.894-32";
        carlos.sobrenome = "Augusto"; 
        
        JOptionPane.showMessageDialog(null,
                "Nome: " + lucas.nome
                + "\nSobrenome: " + lucas.sobrenome
                + "\nIdade: " + lucas.idade
                + "\nPeso: " + lucas.peso
                + "\nAltura: " + lucas.altura
                + "\nSexo: " + lucas.sexo
                + "\nCPF: " + lucas.cpf);
        
        JOptionPane.showMessageDialog(null,
                "Nome: " + carlos.nome
                + "\nSobrenome: " + carlos.sobrenome
                + "\nIdade: " + carlos.idade
                + "\nPeso: " + carlos.peso
                + "\nAltura: " + carlos.altura
                + "\nSexo: " + carlos.sexo
                + "\nCPF: " + carlos.cpf);
        
        
       
    }
    
}
