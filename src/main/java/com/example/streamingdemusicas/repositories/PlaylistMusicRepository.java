package com.example.streamingdemusicas.repositories;

import com.example.streamingdemusicas.dto.PlaylistDTO;
import com.example.streamingdemusicas.entities.BelongingPK;
import com.example.streamingdemusicas.entities.Music;
import com.example.streamingdemusicas.entities.Playlist;
import com.example.streamingdemusicas.entities.PlaylistMusic;
import com.example.streamingdemusicas.projections.MusicProjection;
import com.example.streamingdemusicas.projections.PlaylistProjection;
import com.example.streamingdemusicas.projections.PlaylistUserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaylistMusicRepository extends JpaRepository<PlaylistMusic, BelongingPK> {

    @Query(value = """
    SELECT p.id AS id,
           p.name AS name,
           p.user_id AS idUser,
           m.id AS musicId,
           m.name AS musicName
    FROM tb_playlist p
    JOIN tb_playlist_music pm ON pm.playlist_id = p.id
    JOIN tb_music m ON pm.music_id = m.id
    WHERE pm.music_id = :musicId
    """, nativeQuery = true)
    List<PlaylistProjection> findPlaylistsByMusicId(@Param("musicId") Long musicId);

    @Query(value = """
    SELECT m.id AS id,
           m.name AS name,
           m.artist AS artist,
           p.id AS playlistId,
           p.name AS playlistName
    FROM tb_music m
    JOIN tb_playlist_music pm ON m.id = pm.music_id
    JOIN tb_playlist p ON pm.playlist_id = p.id
    WHERE pm.playlist_id = :playlistId
    """, nativeQuery = true)
    List<MusicProjection> findMusicByPlaylistId(@Param("playlistId") Long playlistId);


}
