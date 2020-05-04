package io.micronaut.kubernetes.client.v1.pods;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class EnvVar {
    private String name;
    private String value;
}
