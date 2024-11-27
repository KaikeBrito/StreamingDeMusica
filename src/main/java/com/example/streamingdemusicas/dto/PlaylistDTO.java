package com.example.streamingdemusicas.dto;

import com.example.streamingdemusicas.projections.PlaylistProjection;
import com.example.streamingdemusicas.projections.PlaylistUserProjection;

public class PlaylistDTO {

    private Long id;
    private String name;
    private Long userId;
    private Long musicId;
    private String musicName;

    public PlaylistDTO() {
    }

    public PlaylistDTO(Long id, String name, Long userId, Long musicId, String musicName) {
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.musicId = musicId;
        this.musicName = musicName;
    }

    public PlaylistDTO(PlaylistProjection projection) {
        id = projection.getId();
        name = projection.getName();
        userId = projection.getIdUser();
        musicId = projection.getMusicId();
        musicName = projection.getMusicName();
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

    public Long getMusicId() {
        return musicId;
    }

    public void setMusicId(Long musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }
}
