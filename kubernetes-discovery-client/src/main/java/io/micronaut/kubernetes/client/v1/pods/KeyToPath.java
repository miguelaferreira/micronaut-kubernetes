package io.micronaut.kubernetes.client.v1.pods;

import io.micronaut.core.annotation.Introspected;


@Introspected
public class KeyToPath {
    private String key;
    private String path;
    private Integer mode;

    public String getKey() {
        return key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public Integer getMode() {
        return mode;
    }

    public void setMode(final Integer mode) {
        this.mode = mode;
    }
}
