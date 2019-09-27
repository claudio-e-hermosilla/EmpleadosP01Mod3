package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class Creartest {
     public Creartest() {}
     @Test
    public void testAgregar(){
       System.out.println("Agregar");
       Empleado emp = new Empleado("195831971", "Claudio", 22, 3);
       BussEmpleado instance = new BussEmpleado();
       boolean esperando = false;
       boolean obtenido=instance.Crear(emp);
       Assert.assertEquals(esperando, obtenido);
    }
}