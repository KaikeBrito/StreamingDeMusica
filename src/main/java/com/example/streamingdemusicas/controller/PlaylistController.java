package com.example.streamingdemusicas.controller;

import com.example.streamingdemusicas.dto.PlaylistDTO;
import com.example.streamingdemusicas.dto.PlaylistUserDTO;
import com.example.streamingdemusicas.entities.Playlist;
import com.example.streamingdemusicas.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/playlist")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @GetMapping
    public List<Playlist> findAll(){
        return playlistService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Playlist> findByUserId(@PathVariable Long id){
        return playlistService.findByUserId(id);
    }

    @GetMapping(value = "/{musicId}/music")
    public List<PlaylistDTO> findPlaylistsByMusicId(@PathVariable Long musicId){
        return playlistService.findPlaylistsByMusicId(musicId);
    }

    @GetMapping(value = "/{userId}/user")
    public List<PlaylistUserDTO> findPlaylistsByUserId(@PathVariable Long userId){
        return playlistService.findPlaylistsByUserId(userId);
    }
}
