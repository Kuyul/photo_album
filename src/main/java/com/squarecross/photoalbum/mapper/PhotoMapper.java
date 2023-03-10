package com.squarecross.photoalbum.mapper;

import com.squarecross.photoalbum.Constants;
import com.squarecross.photoalbum.domain.Photo;
import com.squarecross.photoalbum.dto.PhotoDto;

public class PhotoMapper {
    public static PhotoDto convertToDto(Photo photo){
        PhotoDto photoDto = new PhotoDto();
        photoDto.setPhotoId(photo.getPhotoId());
        photoDto.setOriginalUrl(Constants.PATH_PREFIX + photo.getOriginalUrl());
        photoDto.setFileSize(photo.getFileSize());
        photoDto.setThumbUrl(Constants.PATH_PREFIX + photo.getThumbUrl());
        photoDto.setAlbumId(photo.getAlbum().getAlbumId());
        photoDto.setUploadedAt(photo.getUploadedAt());
        photoDto.setFileName(photo.getFileName());
        return photoDto;
    }
}
