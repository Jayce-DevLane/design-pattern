package io.ensueno.structural_patterns.bridge;

public abstract class DefaultApp implements App {

    private final boolean isType;

    private final String appKey;

    public DefaultApp(boolean isType, String appKey) {
        this.isType = isType;
        this.appKey = appKey;
    }

}
