package com.codegym.validationsong.service;

import com.codegym.validationsong.model.Song;

import java.util.List;

public interface SongService {
    List<Song> findAll();
    void saveSong(Song song);
    Song findById(Long id);
}
