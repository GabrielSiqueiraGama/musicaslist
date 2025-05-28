package com.zhant.musicaslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhant.musicaslist.entities.MusicList;

public interface MusicListRepository extends JpaRepository<MusicList, Long>{

}
