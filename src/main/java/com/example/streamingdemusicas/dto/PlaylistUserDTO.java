package com.example.streamingdemusicas.dto;

import com.example.streamingdemusicas.entities.User;
import com.example.streamingdemusicas.projections.PlaylistUserProjection;
import org.jetbrains.annotations.NotNull;

public class PlaylistUserDTO {

    private Long id;
    private String name;
    private Long userId;

    public PlaylistUserDTO(Long id, String name, Long userId) {
        this.id = id;
        this.name = name;
        this.userId = userId;
    }

    public PlaylistUserDTO(PlaylistUserProjection projection) {
        id = projection.getId();
        name = projection.getName();
        userId = projection.getUserId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
