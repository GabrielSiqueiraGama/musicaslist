package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhant.musicaslist.entities.Music;

import dto.MusicDTO;
import repositories.MusicRepository;

@Service
public class MusicService {

	@Autowired
	private MusicRepository musicRepository;
	
	@Transactional(readOnly = true)
	public List<Music> findAll(){
		var allMusics = musicRepository.findAll();
		return allMusics;
	}
	
	@Transactional(readOnly = true)
	public MusicDTO findById(Long id) {
		Music musicId = musicRepository.findById(id).get();
		MusicDTO dto = new MusicDTO(musicId);
		return dto;
	}
}
