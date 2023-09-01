import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));

        if (idade >= 5 && idade <= 7){
            JOptionPane.showMessageDialog(null, "Você é Infantil A!", null, JOptionPane.INFORMATION_MESSAGE);
         }
            else if (idade >= 8 && idade <= 10){
                JOptionPane.showMessageDialog(null, "Você é Infantil B!", null, JOptionPane.INFORMATION_MESSAGE);
            }
            else if (idade >= 11 && idade <= 13){
                JOptionPane.showMessageDialog(null, "Você é Juvenil A!", null, JOptionPane.INFORMATION_MESSAGE);
            }
            else if (idade >= 14 && idade <= 17){
                JOptionPane.showMessageDialog(null, "Você é Juvenil B!", null, JOptionPane.INFORMATION_MESSAGE);
            }
        else {
            JOptionPane.showMessageDialog(null, "Você é Senior!", null, JOptionPane.INFORMATION_MESSAGE);
            }
    }
}
