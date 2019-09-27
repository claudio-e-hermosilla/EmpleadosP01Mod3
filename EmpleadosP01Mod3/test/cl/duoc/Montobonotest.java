package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class Montobonotest {

    public Montobonotest() {
    }
    
   @Test
    public void TestMontoBono() {
        System.out.println("BonoMonto");
        Empleado emp = new Empleado("11111111", "Joaquina", 36, 3);
        int esperado = 0;
        int obtenido = emp.montoBono();
        Assert.assertEquals(esperado, obtenido);
    }
}