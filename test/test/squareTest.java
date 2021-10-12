/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import squareR.squareRoot;

/**
 *
 * @author pupil
 */
public class squareTest {
     private static squareRoot obj;
    @Before
    public void RunT(){
        obj = new squareRoot();
    }
    public squareTest(){
    }
    
    @Test
    public void squareTest1(){
        //double arvutus = obj.discriminant(1,-2,1);
        Assert.assertArrayEquals("одно решение,",
                                new double[]{1}, //одно решение 
                              arvutus(1, -2, 1), 0.001);
    }
//        if (d1<0){
//            System.out.println("отрицательный дискриминант");
//        }else if(d1==0){
//           
//        }
//
//    
}

