package com.example.streamingdemusicas.controller;

import com.example.streamingdemusicas.dto.MusicDTO;
import com.example.streamingdemusicas.entities.Music;
import com.example.streamingdemusicas.services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping
    public List<Music> findAll(){
        return musicService.findAll();
    }
    @GetMapping(value = "/{playlistId}/playlist")
    public List<MusicDTO> findMusicByPlaylistId(@PathVariable Long playlistId){
        return musicService.findMusicByPlaylistId(playlistId);
    }
}
