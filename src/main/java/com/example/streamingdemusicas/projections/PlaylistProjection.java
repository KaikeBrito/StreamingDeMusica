package com.example.streamingdemusicas.projections;

public interface PlaylistProjection {

    Long getId();

    String getName();
    Long getIdUser();
    Long getMusicId();
    String getMusicName();
}
