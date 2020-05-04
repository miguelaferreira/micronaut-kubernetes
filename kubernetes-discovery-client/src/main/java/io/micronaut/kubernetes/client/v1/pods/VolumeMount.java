package io.micronaut.kubernetes.client.v1.pods;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class VolumeMount {
    private String name;
    private String mountPath;
}
