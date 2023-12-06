/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package DentaSoft.Dominio;

import AccessLifeV2.Dominio.Dentista;
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
//public class DentistaTest {
//    
//    public DentistaTest() {
//    }
//    
//   // --------- REGLA1 VERIFICAR DNI ----------
//    @Test
//    public void test1VerificarDNI() {     
//         System.out.println("------ PRUEBA VERIFICAR DNI 1 -------");
//        Dentista dentista = new Dentista();
//        dentista.setNombres("DIEGO DIAZ POZO");
//        System.out.println("DENTISTA 1: " + dentista.getNombres());
//        dentista.setDni("12345678");
//        System.out.println("DNI 1: " + dentista.getDni());
//        System.out.println("MENSAJE: EL DNI DEL ONDONTOLOGO ES CORRECTO");
//        boolean expResult = true;
//        boolean result = dentista.verificarDNI();
//        assertEquals(expResult, result);
//        System.out.println("===============================================");
//    }
//    
//    // --------- REGLA2 VERIFICAR DNI ----------
//    @Test
//    public void test2VerificarDNI() {
//        System.out.println("------ PRUEBA VERIFICAR DNI 2 -------");
//        Dentista dentista = new Dentista();
//        dentista.setNombres("ANDRÉ DIAZ POZO");
//        System.out.println("DENTISTA 2: " + dentista.getNombres());
//        dentista.setDni("1234567");
//        System.out.println("DNI 2: " + dentista.getDni());
//        System.out.println("MENSAJE: EL DNI DEL ODONTOLOGO ES INCORRECTO");
//        boolean expResult = false;
//        boolean result = dentista.verificarDNI();
//        assertEquals(expResult, result);
//    }
////------------------------------------------------------------------------------------------//
//    
//    // --------- REGLA CANTIDAD CITAS 1 ----------
//    @Test
//    public void test3CalcularCantidadDeCitas() {
//        System.out.println("------ PRUEBA CANTIDAD DE CITAS 1 -------");
//        Dentista dentista = new Dentista();
//        dentista.setNombres("DIEGO DIAZ POZO");
//        System.out.println("DENTISTA 1: " + dentista.getNombres());
//        dentista.setCantidadcitas(8);
//        System.out.println("MENSAJE: SUPERO EL RANGO DE ATENCION DE CITAS POR DIA");
//        boolean expResult = false;
//        boolean result = dentista.calcularCantidadDeCitas();
//        assertEquals(expResult, result);
//        System.out.println("===============================================");
//    }
//    
//    // --------- REGLA CANTIDAD CITAS 2 ----------
//    @Test
//    public void test4CalcularCantidadDeCitas() {
//        System.out.println("------ PRUEBA CANTIDAD DE CITAS 2 -------");        
//        Dentista dentista = new Dentista();
//        dentista.setNombres("ANDRÉ DIAZ POZO");
//        System.out.println("DENTISTA 2: " + dentista.getNombres());
//        dentista.setCantidadcitas(4);        
//        System.out.println("MENSAJE: ESTA EN EL RANGO DE ATENCION DE CITAS POR DIA");
//        boolean expResult = true;
//        boolean result = dentista.calcularCantidadDeCitas();
//        assertEquals(expResult, result);
//    }
//    
////------------------------------------------------------------------------------------------//
//    
//    // --------- REGLA TIEMPO DE TOLERANCIA 1 ----------
//    @Test
//    public void test5CalcularTiempoDeTolerancia() {
//        System.out.println("------ PRUEBA TOLERANCIA 1 -------");
//        Dentista dentista = new Dentista();
//        dentista.setTiempotolerancia(25);
//        System.out.println("TIEMPO DE ESPERA: " + dentista.getTiempotolerancia());
//        System.out.println("MENSAJE: SU CITA YA NO ESTA DISPONIBLE");
//        boolean expResult = false;
//        boolean result = dentista.calcularTiempoDeTolerancia();
//        assertEquals(expResult, result);
//        System.out.println("===============================================");
//    }
//    
//    // --------- REGLA TIEMPO DE TOLERANCIA 2 ----------
//    @Test
//    public void test6CalcularTiempoDeTolerancia() {
//        System.out.println("------ PRUEBA TOLERANCIA 2 -------");
//        Dentista dentista = new Dentista();
//        dentista.setTiempotolerancia(10);
//        System.out.println("TIEMPO DE ESPERA: " + dentista.getTiempotolerancia());
//        System.out.println("MENSAJE: SU CITA AUN ESTA DISPONIBLE");
//        boolean expResult = true;
//        boolean result = dentista.calcularTiempoDeTolerancia();
//        assertEquals(expResult, result);
//    }
//    
//}
