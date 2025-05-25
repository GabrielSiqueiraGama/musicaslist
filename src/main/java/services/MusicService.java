package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhant.musicaslist.entities.Music;

import repositories.MusicRepository;

@Service
public class MusicService {

	@Autowired
	private MusicRepository musicRepository;
	
	
	public List<Music> findAll(){
		var allMusics = musicRepository.findAll();
		return allMusics;
	}
}
