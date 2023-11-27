package Model;

/**
 *
 * @author Usuario
 */
public class EmpresaModel {
    
    private int id;
    private String rasao;
    private String fantasia;
    private String cnpj;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getRasao(){
        return rasao;
    }
    
    public void setRasao(String rasao){
        this.rasao = rasao;
    }
    
    public String getFantasia(){
        return fantasia;
    }
    
    public void setFantasia(String fantasia){
        this.fantasia = fantasia;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
}