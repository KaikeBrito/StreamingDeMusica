package com.example.streamingdemusicas.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    @ManyToOne
    @JoinColumn(name = "music_id")
    private Music music;

    public BelongingPK() {

    }

    public BelongingPK(Playlist playlist, Music music) {
        this.playlist = playlist;
        this.music = music;
    }

    public Playlist getPlaylists() {
        return playlist;
    }

    public void setPlaylists(Playlist playlist) {
        this.playlist = playlist;
    }

    public Music getMusics() {
        return music;
    }

    public void setMusics(Music music) {
        this.music = music;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPK that)) return false;
        return Objects.equals(getPlaylists(), that.getPlaylists()) && Objects.equals(getMusics(), that.getMusics());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPlaylists(), getMusics());
    }
}
