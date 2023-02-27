package com.study.refactoring._11_primitive_obsession.replace_conditional_with_polymorphism.variation._02_after;
import java.util.List;

public class ChinaVotageRating extends VoyageRating {
    public ChinaVotageRating(Voyage voyage, List<VoyageHistory> history) {
        super(voyage, history);
    }

    @Override
    protected int captainHistoryRisk() {
        int result = super.captainHistoryRisk()-2;
        return Math.max(result, 0);
    }

    @Override
    protected int voyageProfitFactor() {
        int result = 6;
        if (this.history.size() > 10) result += 1;
        if (this.voyage.length() > 12) result += 1;
        if (this.voyage.length() > 18) result -= 1;

        return result;

    }
}
