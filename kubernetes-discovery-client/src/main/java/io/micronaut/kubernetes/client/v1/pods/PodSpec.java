package io.micronaut.kubernetes.client.v1.pods;

import java.util.List;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.kubernetes.client.v1.LocalObjectReference;

/**
 * Pod status information.
 *
 * @author Miguel Ferreira
 * @since 1.0.5
 */
@Introspected
public class PodSpec {

    private String restartPolicy;
    private String serviceAccountName;
    private List<Container> containers;
    private List<Container> initcontainers;
    private List<Volume> volumes;
    private List<LocalObjectReference> imagePullSecrets;
}
