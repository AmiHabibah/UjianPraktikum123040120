
import org.junit.Test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SB 604-16
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class MainTest {
    private static soal s;
   
    @Test
     public void test1(){
       
      assertSame("Harusnya ", 6, s.faktorial(3));
    }
    
    public void test2(){
       
     assertSame("Harusnya hasilnya 2", s.faktorial(2));
    }
    
    @Test
    public void test3(){
       
      assertNotNull("Harusnya Bilangan Tidak boleh Nol", s.pangkat(0, 5));
    }
    
     @Test
    public void test4(){
       
     assertSame("Seharusnya 4", s.pangkat(2, 2));
    }
    
     @Test
    public void test5(){
       
     assertSame("Seharusnya 20", s.perkalian(5, 4));
    }
     
      public void test6(){
       
     assertSame("Seharusnya 25", s.perkalian(5, 5));
    }
    
     
   
    
}
