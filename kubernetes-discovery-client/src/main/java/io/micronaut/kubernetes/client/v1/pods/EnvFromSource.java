package io.micronaut.kubernetes.client.v1.pods;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class EnvFromSource {
    private ConfigMapEnvSource configMapRef;
    private SecretEnvSource secretRef;
}
