package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.variation._02_after;

import java.util.List;

public class ChinaVoyageRating extends VoyageRating {
    public ChinaVoyageRating(Voyage voyage, List<VoyageHistory> history) {
        super(voyage, history);
    }
}
