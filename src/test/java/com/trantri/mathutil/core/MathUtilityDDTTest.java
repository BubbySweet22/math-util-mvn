/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.trantri.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author trant
 */
public class MathUtilityDDTTest {
    
   // tách bộ data kiểm thử ra khỏi câu lệnh so sánh
    //lĩ thuật này gọi là DDT = data driven testing
    //kiểm thử hàm, app mà tách riêng bộ data ra 1 chỗ để dễ kiếm
    //soát sự thiếu đủ của các test case, các test data
    //
    //
    public static Object[] initData(){
        //int[] a = (phần tử của mảng 1 chiều cách nhau )
        
        Object[][] testData = {{0, 1},
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {5, 120}
                              };
        return testData;
                
    }
    
    @ParameterizedTest
    @MethodSource("initData")
    public void VerifyFactorialGivenRightArgumentReturnsOk(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
