/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DentaSoft.Dominio;

import AccessLifeV2.Dominio.Cita;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author estdi
 */
public class CitaTest {
    
    public CitaTest() {
    }
    
    @Test
    public void testTipoServicio() {
        System.out.println("---------- PRUEBA TIPO SERVICIO ----------");
        Cita cita = new Cita();
        int codigo = 5;
        System.out.println("INGRESE SU CODIGO: " + codigo);
        String expResult = "PROTESIS COMPLETA";
        System.out.println("SERVICIO: " + expResult);
        String result = cita.TipoServicio(codigo);
        assertEquals(expResult, result);
    }

    
    
    @Test
    public void testPrecioServicio() {
        System.out.println("---------- PRUEBA PRECIO SERVICIO ----------");
        Cita cita = new Cita();
        int codigo = 5;
        System.out.println("INGRESE CODIGO: " + codigo);
        cita.TipoServicio(codigo);
        System.out.println("SERVICIO: " + cita.TipoServicio(codigo));
        double expResult = 2500;
        System.out.println("PRECIO: " + expResult);
        double result = cita.PrecioServicio();
        assertEquals(expResult, result, 0);
        System.out.println("===============================================");
    }

    
    
    @Test
    public void testDescuento() {
        System.out.println("---------- PRUEBA DESCUENTO ----------");
        Cita cita = new Cita();
         int codigo = 5;
        System.out.println("INGRESE CODIGO: " + codigo);
        cita.TipoServicio(codigo);
        System.out.println("SERVICIO: " + cita.TipoServicio(codigo));
        cita.PrecioServicio();
        System.out.println("PRECIO: " + cita.PrecioServicio());
        double expResult = 625;
        System.out.println("DESCUENTO: " + expResult);
        double result = cita.Descuento();
        assertEquals(expResult, result, 0);
        System.out.println("===============================================");
    }
    
}
