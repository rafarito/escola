package exercicio1;
import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        //Aluno al = new Aluno("Rafael Matos", "021.888438", "Desenvolvimento de Sistemas", 2023, 323.5);
        int id = 0, con = 0;
        Aluno al = new Aluno();
        String impressao = "";
        do{
            impressao = "";

            al.setNome(JOptionPane.showInputDialog(null, "digite um nome", "Nome", 3));
            al.setCurso(JOptionPane.showInputDialog(null, "digite um curso", "Curso", 3));
            al.setMensalidade(Double.parseDouble(JOptionPane.showInputDialog(null, "digite uma mensalidade", "Mensalidade", 3)));
            al.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "digite um ano", "Ano", 3)));
            al.setRa(JOptionPane.showInputDialog(null, "digite seu RA", "Ra", 3));
            al.setCPF(JOptionPane.showInputDialog(null, "digite seu CPF","CPF",3));
            al.setRG(JOptionPane.showInputDialog(null, "digite seu RG","RG",3));
            al.setDtNasc(JOptionPane.showInputDialog(null, "digite sua data de nascimento","Nascimento",3));

            impressao += "nome: "+ al.getNome() + "\n";
            impressao += "CPF: "+ al.getCPF() + "\n";
            impressao += "RG: "+ al.getRG() + "\n";
            impressao += "Nascimento: "+ al.getDtNasc() + "\n";
            impressao += "Curso: "+ al.getCurso() + "\n";
            impressao += "RA: "+ al.getRa() + "\n";
            impressao += "Mensalidade: R$"+ al.getMensalidade() + "\n";
            impressao += "Ano: "+ al.getAno() + "\n";

            al.amarzenamento(impressao, id);
            id++;
            if(id >= 5){
                break;
            }
            con = JOptionPane.showConfirmDialog(null, "deseja continuar?", "continuar", JOptionPane.YES_NO_OPTION);
        }while(con==0);
        con = 0;
        con = JOptionPane.showConfirmDialog(null, "deseja imprimir algum aluno?", "imptimir", JOptionPane.YES_NO_OPTION);
        if(con == 0){
            al.impressao(Integer.parseInt(JOptionPane.showInputDialog(null, "digite o id do aluno a ser consultado", "id",2)));
        }

    }
}
