package com.zhant.musicaslist.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhant.musicaslist.dto.MusicDTO;
import com.zhant.musicaslist.dto.MusicMinDTO;
import com.zhant.musicaslist.entities.Music;
import com.zhant.musicaslist.services.MusicService;

@RestController
@RequestMapping(value = "/musics")
public class MusicController {

	private final MusicService musicService;
	
	public MusicController(MusicService musicService) {
		this.musicService = musicService;
	}
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
