package com.codegym.validationsong.service;

import com.codegym.validationsong.model.Song;
import com.codegym.validationsong.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongServiceImpl implements SongService {
    @Autowired
    SongRepository songRepository;
    @Override
    public List<Song> findAll() {
        return songRepository.findAll();
    }

    @Override
    public void saveSong(Song song) {
        songRepository.save(song);
    }

    @Override
    public Song findById(Long id) {
        return songRepository.findById(id).orElse(null);
    }
}
