package com.zhant.musicaslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn(name="music_id")
	private Music music;
	@ManyToOne
	@JoinColumn(name="list_id")
	private MusicList list;
	
	public BelongingPK() {}

	public BelongingPK(Music music, MusicList list) {
		this.music = music;
		this.list = list;
	}

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	public MusicList getList() {
		return list;
	}

	public void setList(MusicList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(list, music);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(list, other.list) && Objects.equals(music, other.music);
	}
	
	
}
