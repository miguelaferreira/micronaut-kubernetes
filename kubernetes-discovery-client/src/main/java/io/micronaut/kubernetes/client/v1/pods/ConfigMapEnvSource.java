package io.micronaut.kubernetes.client.v1.pods;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class ConfigMapEnvSource {
    private String name;
    private boolean optional;
}
