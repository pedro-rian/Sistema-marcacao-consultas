
import java.util.ArrayList;

public class bancoDeDados {
    //Dados dos pacientes
    public ArrayList<String> CPFs;
    public ArrayList<String> senhaPaciente = new ArrayList<String>();
    public ArrayList<String> nomePaciente = new ArrayList<String>();
    
    //Dados dos médicos
    public ArrayList<String> usuario = new ArrayList<String>();
    public ArrayList<String> senhaMedico = new ArrayList<String>();
    public ArrayList<String> nomeMedico = new ArrayList<String>();
    public ArrayList<String> especialidades = new ArrayList<String>();
    
    //Dados dos administradores
    public ArrayList<String> adm = new ArrayList<String>();
    public ArrayList<String> nomeAdm = new ArrayList<String>();
    public ArrayList<String> senhaAdm = new ArrayList<String>();

    public bancoDeDados() {
    
    adm.add("admin");
    senhaAdm.add("admin");
    adm.add("admin2");
    senhaAdm.add("admin2");
    CPFs = new ArrayList<String>();
    
    }
    
    public void addCPF(String x){
        CPFs.add(x);
    }
    
    
    public void addSenha(String y){
        senhaPaciente.add(y);
    }
    
   public void addNome(String z){
        nomePaciente.add(z);
    }
}
