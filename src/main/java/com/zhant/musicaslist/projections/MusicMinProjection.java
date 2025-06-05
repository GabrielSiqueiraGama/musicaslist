package com.zhant.musicaslist.projections;

public interface MusicMinProjection {
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	String getPosition();
	String getArtist();
}
