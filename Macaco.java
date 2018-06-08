
/**
 *
 * @author Patrick
 */
public class Macaco {
    
   public String nomeCientifico, corPelo, apelido, reino, filo, classe, ordem, familia, especie;
   public byte idade; 
   public float altura, peso;
   public char genero;
   
   @Override
   public String toString(){
       return "NomeCientifico: " + nomeCientifico
                + "\nCor Pelo: " + corPelo
                + "\nIdade: " + idade
                + "\nPeso: " + peso
                + "\nAltura: " + altura
                + "\nGênero : " + genero
                + "\nApelido: " + apelido
                + "\nReino: " + reino
                + "\nFilo: " + filo);
               
   }
   
    
}
