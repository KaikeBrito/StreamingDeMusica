package com.example.streamingdemusicas.repositories;

import com.example.streamingdemusicas.entities.Playlist;
import com.example.streamingdemusicas.projections.PlaylistUserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

    @Query(value = """
    SELECT p.id AS id,
           p.name AS name,
           p.user_id AS userId
    FROM tb_playlist p
    WHERE p.user_id = :userId
    """, nativeQuery = true)
    List<PlaylistUserProjection> findPlaylistsByUserId(@Param("userId") Long userId);
}
