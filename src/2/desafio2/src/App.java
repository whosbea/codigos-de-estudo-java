import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int sims = 0;
        int pergunta1 = JOptionPane.showOptionDialog(null, "Telefonou para vitima?", "Pergunta 1", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Sim", "Não"}, "Sim");
        if (pergunta1 == 0) {
            sims++;
        }
        else {
            sims = sims;
        }
        int pergunta2 = JOptionPane.showOptionDialog(null, "Esteve no local?", "Pergunta 2", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Sim", "Não"}, "Sim");
        if (pergunta2 == 0){
            sims++;
        }
        else{
            sims = sims;
        }
        int pergunta3 = JOptionPane.showOptionDialog(null, "Mora perto?", "Pergunta 3", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Sim", "Não"}, "Sim");
        if (pergunta3 == 0){
            sims++;
        }
        else{
            sims = sims;
        }
        int pergunta4 = JOptionPane.showOptionDialog(null, "Devia para a vitima?", "Pergunta 4", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Sim", "Não"}, "Sim");
        if (pergunta4 == 0){
            sims++;
        }
        else{
            sims = sims;
        }
        int pergunta5 = JOptionPane.showOptionDialog(null, "Ja trabalhou com a vitima?", "Pergunta 5", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"Sim", "Não"}, "Sim");
        if (pergunta5 == 0){
            sims++;
        } 
        else{
            sims = sims;
        }

        if (sims <= 1){
            JOptionPane.showMessageDialog(null, "Você é inocente.", "Inocente", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (sims == 2){
            JOptionPane.showMessageDialog(null, "Você é um suspeito.", "Suspeita", JOptionPane.WARNING_MESSAGE);
        }
        else if (sims == 3 || sims == 4){
            JOptionPane.showMessageDialog(null, "Você é cúmplice.", "Cúmplice", JOptionPane.WARNING_MESSAGE);
        }
        else if (sims == 5){
            JOptionPane.showMessageDialog(null, "Você é o ASSASSINO :OOOOOOO.", ">:(", JOptionPane.WARNING_MESSAGE);
        }
    }
}
