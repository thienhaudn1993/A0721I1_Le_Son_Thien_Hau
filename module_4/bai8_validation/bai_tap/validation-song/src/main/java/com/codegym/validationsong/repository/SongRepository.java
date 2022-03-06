package com.codegym.validationsong.repository;

import com.codegym.validationsong.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends JpaRepository<Song,Long> {
}
