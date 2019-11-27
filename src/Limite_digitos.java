

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Limite_digitos extends PlainDocument{
    private int quantMax;
    public Limite_digitos(int maxLen){
        super();
        if(maxLen<=0)
            throw new IllegalArgumentException("Especifique a quantidade");
        quantMax = maxLen;
    }
@Override
public void insertString(int offset, String str, AttributeSet attr)
throws BadLocationException{
    if(str == null || getLength()==quantMax)
        return;
    int totalquantia = (getLength()+ str.length());
    if (totalquantia <= quantMax){
        super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
        return;
    }
    String nova = str.substring(0, getLength() -quantMax);
    super.insertString(offset, nova,  attr);
}
}
