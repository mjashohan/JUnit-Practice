package com.shohan.junitpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    //Absence of failure is success
    //Test Condition or Assert
    private MyMath math = new MyMath();
    @Test
    void calculateSum_ThreeMemberArray() {
        assertEquals(6, math.claculateSum(new int[]{1, 2, 3}));
    }

    @Test
    void calucalteSum_NoMemberArray() {
        assertEquals(0, math.claculateSum(new int[]{}));
    }
}