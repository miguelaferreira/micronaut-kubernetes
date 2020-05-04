package io.micronaut.kubernetes.client.v1.pods;

import io.micronaut.core.annotation.Introspected;

/**
 * LocalObjectReference.
 *
 * @see <a href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.16/#localobjectreference-v1-core">LocalObjectReference v1 core</a>
 *
 * @author <Miguel Ferreira>
 * @since 9.9.9
 */
@Introspected
public class EnvFromSource {
    private ConfigMapEnvSource configMapRef;
    private SecretEnvSource secretRef;
}
