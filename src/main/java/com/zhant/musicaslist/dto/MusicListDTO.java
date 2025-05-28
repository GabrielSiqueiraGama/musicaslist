package com.zhant.musicaslist.dto;

import org.springframework.beans.BeanUtils;

import com.zhant.musicaslist.entities.MusicList;

public class MusicListDTO {

	Long id;
	String name;
	
	public MusicListDTO() {}
	
	public MusicListDTO(MusicList entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
