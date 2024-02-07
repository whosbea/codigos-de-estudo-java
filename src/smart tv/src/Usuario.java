public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
    
        smartTv.mudarCanal();
        System.out.println("Novo status -> Canal: " + smartTv.canal);
        
        smartTv.ligar();
        System.out.println("Novo status -> Ligada: " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status -> Ligada: " + smartTv.ligada);
    }
}
