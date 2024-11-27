package com.example.streamingdemusicas.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_playlist_music")
public class PlaylistMusic {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public PlaylistMusic() {

    }

    public PlaylistMusic(Playlist playlist, Music music, Integer position) {
        id.setPlaylists(playlist);
        id.setMusics(music);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlaylistMusic that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getPosition(), that.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPosition());
    }
}
