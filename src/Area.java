public class Area {

    public int CalcularArea(int lado) {
        return lado*lado;
    }
    public int CalcularArea(int lado1, int lado2) {
        return lado1*lado2;
    }
    public double CalcularArea(double radio){
        return (Math.PI * radio)* radio;
    }
}
