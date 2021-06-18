/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chef.and.snackdown;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class ChefAndSnackdown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        
        while(t>0)
        {
            int N=input.nextInt();
            if(N==2010 || N==2015 || N==2016 || N==2017 || N==2019)
            {
               System.out.println("HOSTED");
            }
            else
            {
               System.out.println("NOT HOSTED"); 
            }  
        }
        t--;
        
    }
    
}
