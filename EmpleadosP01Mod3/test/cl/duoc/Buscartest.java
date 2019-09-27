package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class Buscartest {
       public Buscartest() {
    }

    @Test
    public void TestBuscar() {
        System.out.println("Buscar");
        String rut = "11111111";
        Empleado emp = new Empleado("11111111", "Joaquina", 36, 3);
        BussEmpleado instance = new BussEmpleado();
        Empleado obtenido = instance.Buscar(rut);
        Assert.assertEquals(emp.getRut(), obtenido.getRut());
    }
}