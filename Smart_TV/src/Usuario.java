public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada ? "+ smartTv.ligado);
        System.out.println("Canal atual: "+ smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada ? "+ smartTv.ligado);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada ? "+ smartTv.ligado);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: "+ smartTv.volume);

       smartTv.mudarCanal(13);
       System.out.println("Canal atual: "+ smartTv.canal);

       
    }
}
