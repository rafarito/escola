package exercicio1;
import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        //Aluno al = new Aluno("Rafael Matos", "021.888438", "Desenvolvimento de Sistemas", 2023, 323.5);
        //minha pica
        Aluno al = new Aluno();
        String r = "";

        al.setNome(JOptionPane.showInputDialog(null, "digite um nome", "Nome", 3));
        al.setCurso(JOptionPane.showInputDialog(null, "digite um curso", "Curso", 3));
        al.setMensalidade(Double.parseDouble(JOptionPane.showInputDialog(null, "digite uma mensalidade", "Mensalidade", 3)));
        al.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "digite um ano", "Ano", 3)));
        al.setRa(JOptionPane.showInputDialog(null, "digite seu RA", "Ra", 3));
        al.setCPF(JOptionPane.showInputDialog(null, "digite seu CPF","CPF",3));
        al.setRG(JOptionPane.showInputDialog(null, "digite seu RG","RG",3));
        al.setDtNasc(JOptionPane.showInputDialog(null, "digite sua data de nascimento","Nascimento",3));

        System.out.println(al.getAno());
        System.out.println(al.getCurso());
        System.out.println(al.getMensalidade());
        System.out.println(al.getNome());
        System.out.println(al.getRa());

        r += "nome: "+ al.getNome() + "\n";
        r += "CPF: "+ al.getCPF() + "\n";
        r += "RG: "+ al.getRG() + "\n";
        r += "Nascimento: "+ al.getDtNasc() + "\n";
        r += "Curso: "+ al.getCurso() + "\n";
        r += "RA: "+ al.getRa() + "\n";
        r += "Mensalidade: R$"+ al.getMensalidade() + "\n";
        r += "Ano: "+ al.getAno() + "\n";

        JOptionPane.showMessageDialog(null, r, "Aluno", 1);

    }
}
