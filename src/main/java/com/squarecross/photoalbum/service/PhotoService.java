package com.squarecross.photoalbum.service;

import com.squarecross.photoalbum.domain.Photo;
import com.squarecross.photoalbum.dto.PhotoDto;
import com.squarecross.photoalbum.mapper.PhotoMapper;
import com.squarecross.photoalbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepository;

    public PhotoDto getPhoto(Long photoId) {
        Optional<Photo> res = photoRepository.findById(photoId);
        if(res.isEmpty()){
            throw new EntityNotFoundException(String.format("파일 아이디 %d 를 찾을 수 없습니다", photoId));
        }
        return PhotoMapper.convertToDto(res.get());
    }
}
