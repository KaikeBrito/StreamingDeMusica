package com.example.streamingdemusicas.services;

import com.example.streamingdemusicas.dto.MusicDTO;
import com.example.streamingdemusicas.dto.PlaylistDTO;
import com.example.streamingdemusicas.entities.Music;
import com.example.streamingdemusicas.projections.MusicProjection;
import com.example.streamingdemusicas.projections.PlaylistProjection;
import com.example.streamingdemusicas.repositories.MusicRepository;
import com.example.streamingdemusicas.repositories.PlaylistMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    @Autowired
    private PlaylistMusicRepository playlistMusicRepository;

    @Transactional(readOnly = true)
    public List<Music> findAll(){
        return musicRepository.findAll();
    }
    @Transactional(readOnly = true)
    public List<MusicDTO> findMusicByPlaylistId(Long playlistId){
        List<MusicProjection> result = playlistMusicRepository.findMusicByPlaylistId(playlistId);
        return result.stream().map(MusicDTO::new).toList();    }
}
