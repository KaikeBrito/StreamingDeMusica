package com.example.streamingdemusicas.projections;

import com.example.streamingdemusicas.entities.User;

public interface PlaylistUserProjection {

    Long getId();

    String getName();

    Long getUserId();
}
