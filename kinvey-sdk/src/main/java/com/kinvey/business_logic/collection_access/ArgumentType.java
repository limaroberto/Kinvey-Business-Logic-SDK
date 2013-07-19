package com.kinvey.business_logic.collection_access;

public enum ArgumentType {
    QUERY("query"),
    OPTIONS("options"),
    SORT_ORDER("sort"),
    DOCUMENT("doc"),
    DOCUMENTS("docs"),
    KEY("key"),
    LONGITUDE("x"),
    LATITUDE("y"),
    X("x"),
    Y("y");

    private final String argumentType;

    public String getArgumentType() {
        return argumentType;
    }

    private ArgumentType(String argumentType) {
        this.argumentType = argumentType;
    }
}
