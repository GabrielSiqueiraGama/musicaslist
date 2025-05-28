package com.zhant.musicaslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhant.musicaslist.dto.MusicListDTO;
import com.zhant.musicaslist.services.MusicListService;

@RestController
@RequestMapping(value = "/lists")
public class MusicListController {

	@Autowired
	private MusicListService musicListService;
	
	@GetMapping
	public List<MusicListDTO> findAll(){
		List<MusicListDTO> allMusics = musicListService.findAll(); 
		return allMusics;
	}
}
