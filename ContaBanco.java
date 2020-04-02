package aula;
public class ContaBanco{

    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status; 

    public void abrirConta(){

    }

    public void fecharConta(){

    }
    public void depositar(){
    }
    public void sacar(){
    }
    public void pagarMensal(){
    }

    public ContaBanco(){
        this.saldo=0;
        this.status = false;
    }

    public void setNumConta(int n)
    {
        this.numConta = n;
    }

    public int getNumConta(int n)
    {
        return this.numConta;
    }
    public int getNumDono(int n)
    {
        return this.dono;
    }
}