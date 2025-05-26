package dto;

import org.springframework.beans.BeanUtils;

import com.zhant.musicaslist.entities.Music;

public class MusicDTO {
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String artist;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public MusicDTO() {}
	
	public MusicDTO(Music entity) {
		BeanUtils.copyProperties(entity, this);//copia tudo da entidade para o DTO, sem ser necessario fazer o this.id = entity.getId() e afins
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
	
}
