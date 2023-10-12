/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.trantri.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author trant
 */
public class MathUtilityTest {
    
    //TEST CASE TEMPLATE/STRUCTURE:
    //ID | DESC | STEPS/PROCEDURES | EXPECTED RESULT | STATUS (PASSED/FAILED)
    
    //TEST CASE #1: Verify the getFactorial() function with n = 0
    //STEPS/PROCEDURES:
    //  1. Given n = 0
    //  2. Call/Invoke = getFactorial(int n)
    //Expected Result
    //          The method getFactorial(n = 0) must return 1
    //                          as The result of 0! == 1
    //Status PASSED | FAILED ĐOÁN XEM KHI CHẠY APP/HÀM/METHOD
    
   @Test   //dính dáng thuật ngữ framework
   public void verifyFactorialGivenRightArgument0returnsOk(){
       assertEquals(1, MathUtility.getFactorial(0));
   }
    
   
   //TEST CASE #2...... n = 1
   @Test   //dính dáng thuật ngữ framework
   public void verifyFactorialGivenRightArgument1returnsOk(){
       assertEquals(1, MathUtility.getFactorial(1));
   }
   
   //TEST CASE #3...... n = 6
   @Test   //dính dáng thuật ngữ framework
   public void verifyFactorialGivenRightArgument6returnsOk(){
       assertEquals(720, MathUtility.getFactorial(6));
   }
}
