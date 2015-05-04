
import javax.naming.spi.DirStateFactory.Result;
import org.junit.After;
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
import org.junit.Before;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;
public class MainTest {
    private static soal s;
   
    @Before
    public void awalTest(){
        s= new soal();
        System.out.println("Mengawali testing");
    }
    @Test
     public void test1(){
       //TestFaktorial1
      assertSame("Harusnya ", 6, s.faktorial(3));
    }
    
    public void test2(){
        //TestFaktorial2
     assertSame("Harusnya hasilnya ",2, s.faktorial(2));
    }
    
    @Test
    public void test3(){
       
      assertNotNull("Harusnya Bilangan Tidak boleh Null", s.pangkat(0, 5));
    }
    
     @Test
    public void test4(){
       
     assertSame("Seharusnya",4, s.pangkat(2, 2));
    }
    
     @Test
    public void test5(){
       
     assertSame("Seharusnya",20, s.perkalian(5, 4));
    }
     
     @Test
      public void test6(){
       
     assertSame("Seharusnya",25, s.perkalian(5, 5));
    }
    
     @After
     public void nakhirTest(){
         System.out.println("Mengakhiri Testing");
     }
   
     public static void main(String[] args) {
        org.junit.runner.Result result= JUnitCore.runClasses(MainTest.class);
        
         for (Failure failure : result.getFailures()) {
             System.out.println(failure.toString());
             System.out.println("Tidak Sukses");
         }
         
         System.out.println(result.wasSuccessful());
    }
    
}
