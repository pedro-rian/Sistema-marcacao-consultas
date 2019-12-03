
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class modeloConsulta extends AbstractTableModel{
    private List<dadosConsulta> cons = new ArrayList<>();
    private String[] col = {"Paciente","Dia","Turno"};
    
    @Override
    public String getColumnName(int column) {
        return col[column]; 
    }
    
    @Override
    public int getRowCount() {
        return cons.size();
    }

    @Override
    public int getColumnCount() {
        return col.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return cons.get(linha).getPaciente();
            case 1:
                return cons.get(linha).getDia();
            case 2:
                return cons.get(linha).getTurno();
        }
        return null;
    }
    
    public void addLinha(dadosConsulta p){
        this.cons.add(p);
        this.fireTableDataChanged();
    }
    
}
