package com.zhant.musicaslist.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhant.musicaslist.dto.MusicListDTO;
import com.zhant.musicaslist.entities.MusicList;
import com.zhant.musicaslist.projections.MusicMinProjection;
import com.zhant.musicaslist.repositories.MusicListRepository;
import com.zhant.musicaslist.repositories.MusicRepository;

@Service
public class MusicListService {
	
	private final MusicListRepository musicListRepository;
	private final MusicRepository musicRepository;
	
	public MusicListService(MusicListRepository musicListRepository, MusicRepository musicRepository) {
		this.musicListRepository = musicListRepository;
		this.musicRepository = musicRepository;
	}
	
	@Transactional(readOnly = true)
	public List<MusicListDTO> findAll(){
		List<MusicList> musicList = musicListRepository.findAll();
		return musicList.stream().map(x -> new MusicListDTO(x)).toList();
	}

	public void move(Long listId, int sourceIndex,int destinationIndex ) {
		List<MusicMinProjection> list = musicRepository.searchByList(listId);	
		
		MusicMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for(int i = min; i <= max; i++) {
			musicListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}
}
