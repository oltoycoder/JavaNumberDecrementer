/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopweek3;

/**
 *
 * @author toyin
 */
public class WorkshopWeek3 {
   static final int MINIMUM = -10;
   static final int MAXIMUM = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int total = 0;
        int NumberArray[] = new int[10];
        int size = NumberArray.length;
        for (int i = MINIMUM; i < MAXIMUM; i++) {
            x = i;
            total = myFunc(x);
            System.out.println(total);
        }
    }
    
    public static int myFunc(int x) {
        x = x + 5;
        return x;
    }
    
}
