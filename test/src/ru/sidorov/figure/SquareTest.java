package ru.sidorov.test5.figure; 
import org.junit.Test; 
import static org.junit.Assert.*; 
import ru.sidorov.test5.figure.*; 
public class SquareTest { 
   @Test 
    public void testDiag() { 
       System.out.println("Проверка метода getDiag()"); 
       Square s = new Square(4); 
       assertEquals(5.65685, s.getDiag(),0.0001);    } 
   @Test 
    public void testPer() { 
       System.out.println("Проверка метода per()"); 
       Square s = new Square(7); 
       assertEquals(28, s.per(),0.00001); 
   } 
   @Test 
    public void testArea() { 
       System.out.println("Проверка метода area()"); 
       Square s = new Square(11); 
       assertEquals(121, s.area(),0.00001); 
   } }