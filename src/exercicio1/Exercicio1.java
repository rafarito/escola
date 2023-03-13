package exercicio1;
import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        //Aluno al = new Aluno("Rafael Matos", "021.888438", "Desenvolvimento de Sistemas", 2023, 323.5);
        int id = 0, con = 0;
        Aluno al = new Aluno();
        String impressao = "";
        String lista[] = new String[5];
        do{
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

            lista[id] = impressao; //passe essa operação para a classe aluno
            con = JOptionPane.showConfirmDialog(null, "deseja continuar", "continuar", 3);
            id++;
        }while((id<5)&&(con==0));

        
        //desenvolva um metodo de impressão na classe aluno com base no id
        JOptionPane.showMessageDialog(null, impressao, "Aluno", 1);

    }
}
