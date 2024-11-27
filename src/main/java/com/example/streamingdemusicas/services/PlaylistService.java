package com.example.streamingdemusicas.services;

import com.example.streamingdemusicas.dto.PlaylistDTO;
import com.example.streamingdemusicas.dto.PlaylistUserDTO;
import com.example.streamingdemusicas.entities.Playlist;
import com.example.streamingdemusicas.projections.PlaylistProjection;
import com.example.streamingdemusicas.projections.PlaylistUserProjection;
import com.example.streamingdemusicas.repositories.PlaylistMusicRepository;
import com.example.streamingdemusicas.repositories.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;
    @Autowired
    private PlaylistMusicRepository playlistMusicRepository;

    @Transactional(readOnly = true)
    public List<Playlist> findAll() {
        return playlistRepository.findAll();
    }
    @Transactional(readOnly = true)
    public Optional<Playlist> findByUserId(Long id){
        return playlistRepository.findById(id);
    }

    @Transactional(readOnly = true)
    public List<PlaylistDTO> findPlaylistsByMusicId(Long musicId){
        List<PlaylistProjection> result = playlistMusicRepository.findPlaylistsByMusicId(musicId);
        return result.stream().map(PlaylistDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public List<PlaylistUserDTO> findPlaylistsByUserId(Long userId){
        List<PlaylistUserProjection> result = playlistRepository.findPlaylistsByUserId(userId);
        return result.stream().map(PlaylistUserDTO::new).toList();
    }


}
