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

    @Test
    public void testThree(){
        Assert.assertEquals(
                37,
                Challenge.testThree(37,118)
        );
    }

    @Test
    public void testFour(){
        Assert.assertEquals(
                7,
                Challenge.testFour(49)
        );
    }

    @Test
    public void testFive(){
        Assert.assertFalse(Challenge.testFive("How you doin'?", "how you doin'?"));
    }

    @Test
    public void testSix(){
        Assert.assertEquals(
                "IBM Z15 is the platform for mission critical workloads on hybrid cloud.",
                    Challenge.testSix("IBM Z15 is the platform for ", "mission critical workloads on hybrid cloud.")
        );
    }

    @Test
    public void testSeven(){
        Assert.assertEquals(
                1167,
                Challenge.testSeven(-1167)
        );
    }

    @Test
    public void testEight(){
        Assert.assertEquals(
                9,
                Challenge.testEight(99,11)
        );
    }

    @Test
    public void testNine(){
        Assert.assertEquals(
                629,
                Challenge.testNine(17,37)
        );
    }

    @Test
    public void testTen(){
        Assert.assertEquals(
                "Elementary, my dear Watson.",
                Challenge.testTen(" Elementary, my dear Watson.  ")
        );
    }

    @Test
    public void testEleven(){
        Assert.assertEquals(
                1,
                Challenge.testEleven(90)
        );
    }

    @Test
    public void testTwelve(){
        Assert.assertEquals(
                "My momo olwoys soid life wos like o box of chocolotes.",
                Challenge.testTwelve("My mama always said life was like a box of chocolates.", 'a','o')
        );
    }

    @Test
    public void testThirteen(){
        Assert.assertTrue(Challenge.testThirteen("Houston, we have a problem.", "Houston"));
    }

    @Test
    public void testFourteen(){
        Assert.assertEquals(
                "toto, i've a feeling we're not in kansas anymore.",
                Challenge.testFourteen("Toto, I've a feeling we're not in Kansas anymore.")
        );
    }

    @Test
    public void testFifteen(){
        Assert.assertEquals(
                1288,
                Challenge.testFifteen(1674,386)
        );
    }

}
