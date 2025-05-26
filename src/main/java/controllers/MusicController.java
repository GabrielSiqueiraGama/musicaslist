package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhant.musicaslist.entities.Music;

import dto.MusicDTO;
import dto.MusicMinDTO;
import services.MusicService;

@RestController
@RequestMapping(value = "/musics")
public class MusicController {

	@Autowired
	private MusicService musicService;
	
	@GetMapping
	public List<MusicMinDTO> findAll(){
		List<Music> allMusics = musicService.findAll();
		List<MusicMinDTO> allmusicsDTO = allMusics.stream().map(x -> new MusicMinDTO(x)).toList();
		return allmusicsDTO;
	}
	
	@GetMapping(value = "/{id}")
	public MusicDTO findById(@PathVariable Long id){
		MusicDTO music = musicService.findById(id);
		return music;
	}
}
