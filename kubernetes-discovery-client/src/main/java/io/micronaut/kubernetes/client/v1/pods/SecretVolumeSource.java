package io.micronaut.kubernetes.client.v1.pods;

import java.util.List;

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
public class SecretVolumeSource {

    private String secretName;
    private boolean optional;
    private int defaultMode;
    private List<KeyToPath> items;

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(final String secretName) {
        this.secretName = secretName;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(final boolean optional) {
        this.optional = optional;
    }

    public int getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final int defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<KeyToPath> getItems() {
        return items;
    }

    public void setItems(final List<KeyToPath> items) {
        this.items = items;
    }
}
