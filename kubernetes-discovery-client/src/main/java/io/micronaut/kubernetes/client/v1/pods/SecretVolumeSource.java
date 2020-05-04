package io.micronaut.kubernetes.client.v1.pods;

import java.util.List;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class SecretVolumeSource {

    private String secretName;
    private boolean optional;
    private int defaultMode;
    private List<KeyToPath> items;

}
