package io.ensueno.structural_patterns.bridge;

public class ApnsApp extends DefaultApp {

    public ApnsApp(boolean isType, String appKey) {
        super(true, appKey);
    }

    @Override
    public void send() {

    }

    @Override
    public DefaultApp build() {
        return null;
    }
}
