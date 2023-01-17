package com.squarecross.photoalbum.mapper;

import com.squarecross.photoalbum.domain.Album;
import com.squarecross.photoalbum.dto.AlbumDto;
import com.squarecross.photoalbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AlbumMapper {

    @Autowired
    private PhotoRepository photoRepository;

    public static AlbumDto convertToDto(Album album){
        AlbumDto albumDto = new AlbumDto();
        albumDto.setAlbumId(album.getAlbumId());
        albumDto.setAlbumName(album.getAlbumName());
        albumDto.setCreatedAt(album.getCreatedAt());
        return albumDto;
    }

    public static Album convertToModel(AlbumDto albumDto) {
        Album album = new Album();

        album.setAlbumId(albumDto.getAlbumId());
        album.setAlbumName(albumDto.getAlbumName());
        album.setCreatedAt(albumDto.getCreatedAt());
        return album;
    }
}
