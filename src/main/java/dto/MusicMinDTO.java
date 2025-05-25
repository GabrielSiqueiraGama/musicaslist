package dto;

import com.zhant.musicaslist.entities.Music;

public class MusicMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String artist;
	private String imgUrl;
	private String shortDescription;
	
	public MusicMinDTO() {
	}

	public MusicMinDTO(Music entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		artist = entity.getArtist();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getArtist() {
		return artist;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
}
