
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class tableModel_test extends AbstractTableModel{

    private List<dadosTabela> dados = new ArrayList<>();
    private String[] colunas = {"Produto","Preço","Quantidade"};

    @Override
    public String getColumnName(int column) {
        return colunas[column]; 
    }
    
    @Override
    public int getRowCount() {
         return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getNomeProduto();
            case 1:
                return dados.get(linha).getPreco();
            case 2:
                return dados.get(linha).getQtd();
        }
        
        return null;
        
    }
    
    public void addRow(dadosTabela d){
        this.dados.add(d);
        this.fireTableDataChanged();
    }
    
}
