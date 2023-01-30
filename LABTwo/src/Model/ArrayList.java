/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author Ma2017
 */
public class ArrayList {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        for (int i = 0; i < arr.length; i++){
            if (i%2 == 0){
                arr[i] = arr[i]*2;
            }else{
                arr[i] = arr[i]*3;
            }
           
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
