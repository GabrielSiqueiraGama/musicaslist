package com.zhant.musicaslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zhant.musicaslist.entities.Music;
import com.zhant.musicaslist.projections.MusicMinProjection;

public interface MusicRepository extends JpaRepository<Music, Long>{
	@Query(nativeQuery = true, value = """
	SELECT tb_music.id, tb_music.title, tb_music.artist, tb_music.music_year AS musicYear, tb_music.img_url AS imgUrl, tb_music.short_description AS shortDescription, tb_belonging.position
	FROM  tb_music
	INNER JOIN  tb_belonging  ON tb_music.id = tb_belonging.music_id
	WHERE  tb_belonging.list_id = :listId
	ORDER BY  tb_belonging.position;""")
	
	List<MusicMinProjection> searchByList(Long listId);
}
