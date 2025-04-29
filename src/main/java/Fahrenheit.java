//
public class Fahrenheit extends Temperatura {
    
    public Fahrenheit(double valorGraus) {
        super(valorGraus);
    }
    public double paraCelsius(){
        return (getGraus()-32)*5/9;
    }
    //METODO QUE CORVERTE FAHRENHEIT PARA KELVIN
    public double paraKelvin(){
        return paraCelsius()+273;
    }
    
}
