package io.micronaut.kubernetes.client.v1.pods;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class SecretEnvSource {
    private String name;
    private boolean optional;
}
