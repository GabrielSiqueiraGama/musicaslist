package com.zhant.musicaslist.projections;

public interface MusicMinProjection {
	Long getId();
	String getTitle();
	Integer getMusicYear();
	String getImgUrl();
	String getShortDescription();
	String getPosition();
	String getArtist();
}
