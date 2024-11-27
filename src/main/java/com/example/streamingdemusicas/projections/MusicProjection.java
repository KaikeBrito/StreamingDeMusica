package com.example.streamingdemusicas.projections;

public interface MusicProjection {

    Long getId();            // ID da música
    String getName();        // Nome da música
    String getArtist();      // Nome do artista
    Long getPlaylistId();    // ID da playlist
    String getPlaylistName();// Nome da playlist
}
