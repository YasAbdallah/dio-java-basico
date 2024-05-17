public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? "+smartTv.ligado);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Status atual, TV ligada? "+smartTv.ligado);
        smartTv.desligar();
        System.out.println("Status atual, TV ligada? "+smartTv.ligado);

        smartTv.aumentarVolume();
        System.out.println("Status atual, Volume Atual: "+smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Status atual, Volume Atual: "+smartTv.volume);


        smartTv.aumentarcanal();
        smartTv.aumentarcanal();
        System.out.println("Canal Atual: "+smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: "+smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("Canal Atual: "+smartTv.canal);

    }
}
