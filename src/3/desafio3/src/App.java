import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       String nome = JOptionPane.showInputDialog("Qual seu nome ?");
       String sexo = JOptionPane.showInputDialog("Qual seu sexo ? F para feminino e M para masculino");
       String estadoCivil =  JOptionPane.showInputDialog("Qual seu estado civil ? SOLTEIRO(A), CASADO(A), NAMORANDO(A)");
       String tempoCasada;
    if (sexo.equals("F") && estadoCivil.equals("CASADA")){
        tempoCasada = JOptionPane.showInputDialog("Quanto tempo você está casada?");
       }
    }
}
