
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Limite_caracteres extends PlainDocument{
   private int quantMax;
   public Limite_caracteres(int maxLen){
       super();
       if (maxLen<=0)
           throw new IllegalArgumentException("Especifique a quantidade");
        quantMax = maxLen;   
   }
   
@Override
public void insertString(int offset2, String str2, AttributeSet attr2)
throws BadLocationException{
    if (str2 == null || getLength()==quantMax)
            return;
    int totalquantia = (getLength() + str2.length());
    if (totalquantia <= quantMax){
        super.insertString(offset2, str2.replaceAll("[^a-z|^A-Z|^ |^ç|^Ç|^á|^é|^í|^ó|^ú|^Á|^É|^Í|^Ó|^Ú|^â|^ê|^ô|^Â|^Ê|^Ô|^ã|^õ|^Ã|^Õ]", ""), attr2);
        return;
    }
        String nova = str2.substring(0, getLength() -quantMax);
        super.insertString(offset2, nova,  attr2);
                
      }

}
