package com.zhant.musicaslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.zhant.musicaslist.entities.MusicList;

public interface MusicListRepository extends JpaRepository<MusicList, Long>{

	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND music_id = :musicId")
	void updateBelongingPosition(Long listId, Long musicId, Integer newPossition);
}
