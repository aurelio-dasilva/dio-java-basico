public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv() {
        ligada = true;
        System.out.println("Tv ligada? " + ligada);
    }

    public void desligarTv() {
        ligada = false;
        System.out.println("Tv ligada? " + ligada);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume atual: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume atual: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("canal atual: " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("canal atual: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("canal atual: " + canal);
    }
}
