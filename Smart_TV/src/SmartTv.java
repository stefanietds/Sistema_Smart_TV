public class SmartTv {

    boolean ligado = false; ///atributos visiveis a todos os metodos
    int canal = 1;
    int volume = 15; 
    
    //métodos
    public void ligar(){
        ligado=true;
    }

    public void desligar(){
        ligado=false;
    }
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando Volume para: "+ volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo Volume para: "+ volume);
    }
 
    public void mudarCanal(int novoCanal){ // novoCanal só é visivel a esse metodo
        canal = novoCanal;
    }
    
    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }
}
