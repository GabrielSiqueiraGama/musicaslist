package com.zhant.musicaslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhant.musicaslist.dto.MusicDTO;
import com.zhant.musicaslist.dto.MusicMinDTO;
import com.zhant.musicaslist.entities.Music;
import com.zhant.musicaslist.projections.MusicMinProjection;
import com.zhant.musicaslist.repositories.MusicRepository;

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
	public List<MusicMinDTO> findByList(Long listId){
		List<MusicMinProjection> result = musicRepository.searchByList(listId);
		return result.stream().map(x -> new MusicMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public MusicDTO findById(Long id) {
		Music musicId = musicRepository.findById(id).get();
		MusicDTO dto = new MusicDTO(musicId);
		return dto;
	}
	
	
}
