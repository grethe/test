/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Grethe
 */
public class Beregn {
    
    public int dummyMethod(int tall){
        int tmp = 0;
        for(int i=0; i<tall; i++){
            tmp += tall + i;
        }
        return tmp;
    }
    
  public int dummyMethod2(String tall){
      return Integer.parseInt(tall);
  }
}
