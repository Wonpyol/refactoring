package com.study.refactoring._13_loop.replace_loop_with_pipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AuthorAfter {

    private String company;

    private String twitterHandle;

    public AuthorAfter(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<AuthorAfter> authors, String company) {
        return authors.stream()
                .filter(a -> a.company.equals(company))
                .map(a -> a.twitterHandle).filter(Objects::nonNull)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
