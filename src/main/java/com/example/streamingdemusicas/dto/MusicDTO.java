package com.example.streamingdemusicas.dto;

import com.example.streamingdemusicas.projections.MusicProjection;
import com.example.streamingdemusicas.projections.PlaylistProjection;

public class MusicDTO {
    private Long id;
    private String name;
    private String artist;
    private Long playlistId;
    private String playlistName;

    public MusicDTO() {
    }

    public MusicDTO(Long id, String name, String artist, Long playlistId, String playlistName) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.playlistId = playlistId;
        this.playlistName = playlistName;
    }

    public MusicDTO(MusicProjection projection) {
        id = projection.getId();
        name = projection.getName();
        artist = projection.getArtist();
        playlistId = projection.getPlaylistId();
        playlistName = projection.getPlaylistName();
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Long getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(Long playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }
}

