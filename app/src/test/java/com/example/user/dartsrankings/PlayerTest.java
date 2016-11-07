package com.example.user.dartsrankings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 07/11/2016.
 */

public class PlayerTest {
    Player player1;
    Player player2;

    @Before
    public void before() {
        player1 = new Player("Phil", "The Power", 1);
    }

    @Test
    public void testCanGetName() {
        assertEquals("Phil", player1.getName());
    }

    @Test
    public void testCanGetNickname() {
        assertEquals("The Power", player1.getNickname());
    }

    @Test
    public void testCanGetRankings() {
        assertEquals(1, player1.ranking());
    }

    @Test
    public void testCanSetName() {
        player1.setName("Jerry");
        assertEquals("Jerry", player1.getName());
    }

    @Test
    public void testCanSetNickname() {
        player1.setNickname("The Pudding");
        assertEquals("The Pudding", player1.getNickname());
    }

    @Test
    public void testCanSetRanking() {
        player1.setRanking(3);
        assertEquals(3, player1.ranking());
    }

    @Test
    public void testCanReturnPlayerAsString() {
        assertEquals("Name: Phil, Nickname: The Power, Ranking: 1.", player1.toString());
    }
}