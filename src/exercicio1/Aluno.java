package exercicio1;
import javax.swing.JOptionPane;

public class Aluno extends pessoa{
    private String ra ;// "021.888438"
    private int ano;
    private String curso; //"desenvolvimento de sistemas"
    private Double mensalidade; //não lembro quanto é então é um chute
    public String lista[] = new String[5];

   // public Aluno(String nome, String ra, String curso, int ano, Double mensalidade){
    //  this.nome = nome;
    //  this.ra = ra;
    //  this.ano = ano;
    //  this.curso = curso ;
    //  this.mensalidade = mensalidade;
 // }

    public void amarzenamento(String resp, int id){
      lista[id] = resp;
    }
    public void impressao(int id){
      JOptionPane.showMessageDialog(null, lista[id], "aluno", 1);
    }

    public String getRa() {
      return this.ra;
    }
    public void setRa(String value) {
      this.ra = value;
    }

    public int getAno() {
      return this.ano;
    }
    public void setAno(int value) {
      this.ano = value;
    }

    public String getCurso() {
      return this.curso;
    }
    public void setCurso(String value) {
      this.curso = value;
    }

    public Double getMensalidade() {
      return this.mensalidade;
    }
    public void setMensalidade(Double value) {
      this.mensalidade = value;
    }
}
