package io.micronaut.kubernetes.client.v1.pods;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Volume {

    private String name;
    private SecretVolumeSource secret;

}
