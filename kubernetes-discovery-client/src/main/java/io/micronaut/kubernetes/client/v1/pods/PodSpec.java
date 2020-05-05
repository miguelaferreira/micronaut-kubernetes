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

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(final String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public String getServiceAccountName() {
        return serviceAccountName;
    }

    public void setServiceAccountName(final String serviceAccountName) {
        this.serviceAccountName = serviceAccountName;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(final List<Container> containers) {
        this.containers = containers;
    }

    public List<Container> getInitcontainers() {
        return initcontainers;
    }

    public void setInitcontainers(final List<Container> initcontainers) {
        this.initcontainers = initcontainers;
    }

    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<Volume> volumes) {
        this.volumes = volumes;
    }

    public List<LocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(final List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }
}
