package com.kristal.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kristal.job.PostRepo;
import com.kristal.job.model.Post;

@RestController
public class PostController {

    // It will creata auto object and map it
    @Autowired
    PostRepo repo;

    @RequestMapping(path = "/")
    public String redirect() {
        return "Server Working";
    }

    @GetMapping(path = "/posts")
    public List<Post> getAllPost() {
        return repo.findAll();

    }

    @SuppressWarnings("null")
    @PostMapping(path = "/post")
    public Post addPost(@RequestBody Post post) {
        return repo.save(post);

    }

}
