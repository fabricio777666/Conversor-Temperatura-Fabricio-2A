
public class Kelvin extends Temperatura{
    
    public Kelvin(double valorGraus) {
        super(valorGraus);
    }
    public double paraCelsius(){
        return getGraus()-273;
    }
    public double paraFahrenheit(){
        return (paraCelsius()*9/5+32);
    }
    
}
