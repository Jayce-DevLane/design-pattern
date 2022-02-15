package io.ensueno.structural_patterns.bridge;

public class FcmApp extends DefaultApp {

    public FcmApp(boolean isType, String appKey) {
        super(false, appKey);
    }

    @Override
    public void send() {

    }

    @Override
    public DefaultApp build() {
        return null;
    }
}
