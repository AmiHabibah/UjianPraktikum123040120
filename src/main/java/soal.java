/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SB 604-16
 */
public class soal {
    public int pangkat(int bil, int pangkat){
        int hasil=0;
        int n=1;
        while(n<=pangkat){
            n++;
            hasil*=bil;
        }
        return  hasil;
    }
    
    public int faktorial(int bil){
        int hasil=1;
        for (int i = 1; i < bil; i++) {
            hasil *=i;
        }
        return hasil;
    }
    
    public int perkalian(int bilA, int bilB){
    return bilA*bilB;
}
   
    
    public static void main(String[] args) {
        soal s=new soal();
        s.perkalian(5, 5);
    }
}