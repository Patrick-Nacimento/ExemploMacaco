
import javax.swing.JOptionPane;



/**
 *
 * @author Alunos
 */
public class PrincipalMacaco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Macaco chipa = new Macaco();
        chipa.nomeCientifico = "Pan troglodytes";
        chipa.idade = 12;
        chipa.peso = 30;
        chipa.altura = 0.75f;
        chipa.genero = 'm';
        chipa.corPelo = "negra ";
        chipa.apelido = "Chipanzé";
        chipa.reino = "Animalia";
        chipa.filo = "Chordata";
        chipa.classe = "Mammalia";
        chipa.ordem = "	Primates";
        chipa.familia = " Hominidae";
        chipa.especie = "Pan troglodytes";
        
        Macaco prego = new Macaco();
        prego.nomeCientifico = "Sapajus";
        prego.idade = 15;
        prego.peso = 3;
        prego.altura = 0.48f;
        prego.genero = 'f';
        prego.corPelo = "negra ";
        prego.apelido = "Prega";
        prego.reino = "Animalia";
        prego.filo = "Chordata";
        prego.classe = "Mammalia";
        prego.ordem = "	Primates";
        prego.familia = " Cebidae";
        prego.especie = "Simia apella";
        
        Macaco aranha = new Macaco();
        aranha.nomeCientifico = "coatá";
        aranha.idade = 10;
        aranha.peso = 11;
        aranha.altura = 0.88f;
        aranha.genero = 'm';
        aranha.corPelo = "negra ";
        aranha.apelido = "Arrarinha";
        aranha.reino = "Animalia";
        aranha.filo = "Chordata";
        aranha.classe = "Mammalia";
        aranha.ordem = "Primates";
        aranha.familia = "Atelidae";
        aranha.especie = "Simia paniscus";
        
        Macaco bugi = new Macaco();
        bugi.nomeCientifico = "Alouatta";
        bugi.idade = 8;
        bugi.peso = 12;
        bugi.altura = 0.95f;
        bugi.genero = 'f';
        bugi.corPelo = "castanho";
        bugi.apelido = "Bugio";
        bugi.reino = "Animalia";
        bugi.filo = "Chordata";
        bugi.classe = "Mammalia";
        bugi.ordem = "Primates";
        bugi.familia = "Atelidae";
        bugi.especie = "Simia belzebul";
        
        Macaco tucano = new Macaco();
        tucano.nomeCientifico = "Nasalis larvatus";
        tucano.idade = 16;
        tucano.peso = 23;
        tucano.altura = 0.80f;
        tucano.genero = 'm';
        tucano.corPelo = "negra";
        tucano.apelido = "Narigudo";
        tucano.reino = "Animalia";
        tucano.filo = "Chordata";
        tucano.classe = "Mammalia";
        tucano.ordem = "Primates";
        tucano.familia = "Cercopithecidae";
        tucano.especie = "Pan troglodytes";
        
        JOptionPane.showMessageDialog(null, chipa);
    }
                
    
    
}
