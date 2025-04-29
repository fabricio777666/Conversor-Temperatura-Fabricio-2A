//CASSE FILHA
public class Celsius extends Temperatura {
    //CONSTRUTOR
    public Celsius(double valorGraus){
        super(valorGraus);
    }
    //CRIANDO O METODO PARA CONVERTER
    public double paraFahrenheit(){
        return(getGraus()*9/5)+32;
    }
    //CRIANDO O METODO DE CELSIUS PARA KELVIN
    public double paraKelvin(){
        return getGraus()+253;
    }
    
}
