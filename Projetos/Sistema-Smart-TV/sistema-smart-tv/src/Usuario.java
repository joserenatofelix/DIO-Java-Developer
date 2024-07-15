public class Usuario {
    public static void main(String[] args) throws Exception {

        SmarTv smarTv = new SmarTv();

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();

        System.out.println("Canal Atual : " + smarTv.canal);

        smarTv.mudarCanal(13);
        System.out.println("Canal Atual : " + smarTv.canal);
        
        System.out.println("Volume Atual : " + smarTv.volume);

        System.out.println("TV Ligada ? " + smarTv.ligada);
        
        System.out.println("Volume Atual : " + smarTv.volume);
        
        smarTv.ligar();
        System.out.println("Novo StatusTV -> TV Ligada ? " + smarTv.ligada);

        smarTv.deligar();
        System.out.println("Novo StatusTV -> TV Ligada ? " + smarTv.ligada);


    }
}
