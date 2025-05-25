package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zhant.musicaslist.entities.Music;

public interface MusicRepository extends JpaRepository<Music, Long>{

}
