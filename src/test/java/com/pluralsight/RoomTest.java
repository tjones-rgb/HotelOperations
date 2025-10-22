package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//casing
//lowerCamelCase
//UpperCamelCase or PasCalCase
//snake_case
//kebab-case


class RoomTest {

    @org.junit.jupiter.api.Test
    void checkin_should_make_room_dirty_and_occupied() {
        //arrange
        Room roomTest = new Room(100, false,false,120);

        //act
        roomTest.checkIn();

        //assert
        assertTrue(roomTest.isDirty());
        assertTrue(roomTest.isOccupied());

        assertTrue(true);
    }

    @Test
    void getPrice_should_stay_same_as_instantiation() {
        int testPrice = 100;
        //arrange and act
        Room roomTest = new Room(100,true,false,120);

        //assert
        assertTrue(roomTest.getPrice() == testPrice);
    }

    @Test
    void getPrice_should_not_change() {
        int testPrice = 100;
        //arrange and act
        Room roomTest = new Room(0, true,false,120);

        //assert
        assertFalse(roomTest.getPrice() == 101);
    }
}