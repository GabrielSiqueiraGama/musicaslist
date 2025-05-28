package com.zhant.musicaslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhant.musicaslist.dto.MusicListDTO;
import com.zhant.musicaslist.entities.MusicList;
import com.zhant.musicaslist.repositories.MusicListRepository;

@Service
public class MusicListService {

	@Autowired
	private MusicListRepository musicListRepository;
	
	@Transactional(readOnly = true)
	public List<MusicListDTO> findAll(){
		List<MusicList> musicList = musicListRepository.findAll();
		return musicList.stream().map(x -> new MusicListDTO(x)).toList();
	}

}
