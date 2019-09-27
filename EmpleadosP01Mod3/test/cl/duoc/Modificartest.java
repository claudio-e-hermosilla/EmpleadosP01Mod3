package cl.duoc;

import org.junit.Assert;
import org.junit.Test;

public class Modificartest {
       public Modificartest() {
    }
    
    @Test
    public void TestModificar(){
       System.out.println("Modificar");
      Empleado emp = new Empleado("195831971", "Claudio", 22, 3);
       BussEmpleado instance = new BussEmpleado();
       instance.Crear(emp);
       boolean esperando = true;
       emp = new Empleado("195831971", "Claudio", 22, 10);
       boolean obtenido=instance.Modificar(emp);
       Assert.assertEquals(esperando, obtenido);
    }
}