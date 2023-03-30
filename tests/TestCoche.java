import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero_Borja_Vidal(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumenta_Borja_Vidal(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar_Borja_Vidal(30);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuye_Borja_Vidal(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Borja_Vidal(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_Borja_Vidal(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar_Borja_Vidal(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
