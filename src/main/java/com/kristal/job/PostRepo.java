package com.kristal.job;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kristal.job.model.Post;

public interface PostRepo  extends MongoRepository<Post,String> {
    
    
} 