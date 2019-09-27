package cl.duoc;
import org.junit.Assert;
import org.junit.Test;

public class Eliminartest {
    public Eliminartest() {}
    @Test
    public void TestEliminar() {
        System.out.println("Eliminar");
        String codigo = "9999999";
        Empleado emp = new Empleado("9999999", "Ester", 42, 5);
        BussEmpleado instance = new BussEmpleado();
        instance.Crear(emp);
        boolean esperando = true;
        boolean obtenido = instance.Eliminar(codigo);
        Assert.assertEquals(esperando, obtenido);
    }
}