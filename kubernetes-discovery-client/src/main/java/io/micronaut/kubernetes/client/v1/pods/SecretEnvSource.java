package io.micronaut.kubernetes.client.v1.pods;

import io.micronaut.core.annotation.Introspected;

/*
 * TODO
 */
@Introspected
public class SecretEnvSource {
    private String name;
    private boolean optional;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(final boolean optional) {
        this.optional = optional;
    }
}
