package com.study.refactoring._18_middle_man.replace_superclass_with_delegate._02_after;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Scroll {
    private LocalDate dateLastCleaned;
    private CategoryItem categoryItem;

    public Scroll(Integer id, String title, List<String> tags, LocalDate dateLastCleaned) {
        this.categoryItem = new CategoryItem(id, title, tags);
        this.dateLastCleaned = dateLastCleaned;
    }
    public long daysSinceLastCleaning(LocalDate targetDate) {
        return this.dateLastCleaned.until(targetDate, ChronoUnit.DAYS);
    }
}
