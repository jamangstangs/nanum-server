package com.nanum.nanumserver.utils.email;

import java.util.Arrays;

public enum EmailDomain {
    GIST("gist.ac.kr"),
    GM_GIST("gm.gist.ac.kr");

    private final String domain;

    EmailDomain(String domain) {
        this.domain = domain;
    }

    public boolean hadDomain(String domain) {
        return this.domain.equals(domain);
    }

    public static boolean has(String domainName) {
        return Arrays.stream(values())
                .anyMatch(it -> it.hadDomain(domainName));
    }
}
