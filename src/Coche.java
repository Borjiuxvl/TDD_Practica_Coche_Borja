public class Coche {
    public int velocidad;

    public void acelerar_Borja_Vidal(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Borja_Vidal(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad <0) velocidad = 0;
    }
}
