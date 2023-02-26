package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.variation._02_after;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VoyageRatingTest {

    @Test
    void china() {
        Voyage voyage = new Voyage("china", 10);
        List<VoyageHistory> historys = List.of(
                new VoyageHistory("east-inides", 2),
                new VoyageHistory("west-inides", 2),
                new VoyageHistory("china", 2),
                new VoyageHistory("korea", 2)
        );

        VoyageRating voyageRating = RatingFactory.createRating(voyage, historys);
        assertEquals('A', voyageRating.value());
    }

    @Test
    void westIndies() {
        Voyage voyage = new Voyage("west-inides", 10);
        List<VoyageHistory> historys = List.of(
                new VoyageHistory("east-inides", 2),
                new VoyageHistory("west-inides", 2),
                new VoyageHistory("china", 2),
                new VoyageHistory("korea", 2)
        );
        VoyageRating voyageRating = RatingFactory.createRating(voyage, historys);
        assertEquals('B', voyageRating.value());
    }




}