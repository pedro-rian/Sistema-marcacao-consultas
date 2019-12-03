
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloDeTabela extends AbstractTableModel{
    
    private List<dadosDaTabela> dados = new ArrayList<>();
    private String[] colunas = {"CPF","Especialidade","Dia","Turno"};

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
                return dados.get(linha).getCPF();
            case 1:
                return dados.get(linha).getEspec();
            case 2:
                return dados.get(linha).getDia();
            case 3:
                return dados.get(linha).getTurno();
        }
        
        return null;
        
    }
     public void addRow(dadosDaTabela d){
        this.dados.add(d);
        this.fireTableDataChanged();
    }
    
}
