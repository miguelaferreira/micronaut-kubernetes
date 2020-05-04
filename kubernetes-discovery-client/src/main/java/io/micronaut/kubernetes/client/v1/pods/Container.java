package io.micronaut.kubernetes.client.v1.pods;

import java.util.List;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Container {

    private String name;
    private List<String> args;
    private List<String> command;
    private List<EnvVar> env;
    private List<EnvFromSource> envFrom;
    private String image;
    private String imagePullPolicy;
    private List<VolumeMount> volumeMounts;
}
