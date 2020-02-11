package com.ibm.zoschallenge;

import org.junit.Assert;
import org.junit.Test;

public class ChallengeTest {

    @Test
    public void testOne() {
        Assert.assertEquals(
            "HOW QUICK CAN YOU CODE",
            Challenge.testOne("how quick can you code")
        );
    }

    @Test
    public void testTwo(){
        Assert.assertEquals(
                435,
                Challenge.testTwo(23,435)
        );
    }

}
