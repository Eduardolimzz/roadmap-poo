public class CarroInteligente extends Carro{

    public CarroInteligente(int velocidade){
        super(velocidade);
    }

    public void estacionarAutomatico(){
        System.out.println("Estacionando automaticamente!");
        this.velocidade = 0;
    }
}
