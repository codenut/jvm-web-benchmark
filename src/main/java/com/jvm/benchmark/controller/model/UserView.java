package com.jvm.benchmark.controller.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableUserView.class)
@JsonDeserialize(as = ImmutableUserView.class)
public interface UserView {
    String username();
}
