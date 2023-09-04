import javax.swing.JOptionPane;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    int numCanal = canal;

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(){
        int numCanal = Integer.parseInt(JOptionPane.showInputDialog("Qual canal?"));
        canal = numCanal;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}