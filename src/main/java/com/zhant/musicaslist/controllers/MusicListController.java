package com.zhant.musicaslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhant.musicaslist.dto.MusicListDTO;
import com.zhant.musicaslist.dto.MusicMinDTO;
import com.zhant.musicaslist.services.MusicListService;
import com.zhant.musicaslist.services.MusicService;

@RestController
@RequestMapping(value = "/lists")
public class MusicListController {

	@Autowired
	private MusicListService musicListService;
	@Autowired
	private MusicService musicService;
	
	@GetMapping
	public List<MusicListDTO> findAll(){
		List<MusicListDTO> allMusics = musicListService.findAll(); 
		return allMusics;
	}
	
	@GetMapping(value = "/{listId}/musics")
	public List<MusicMinDTO> findByList(@PathVariable Long listId){
		List<MusicMinDTO> result = musicService.findByList(listId);
		return result;
	}
}
