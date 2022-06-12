package com.springboot.blogApplication.Services.impl;

import com.springboot.blogApplication.Entity.Post;
import com.springboot.blogApplication.Repository.PostRepository;
import com.springboot.blogApplication.Services.PostService;
import com.springboot.blogApplication.payload.PostDto;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;


    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        //Convert Dto to entity
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        postDto.setContent(postDto.getContent());

        Post newPost = postRepository.save(post);

        //Convert entity to dto
        PostDto postResponse = new PostDto();
        postResponse.setId(newPost.getId());
        postResponse.setTitle(newPost.getTitle());
        postResponse.setDescription(newPost.getDescription());
        postResponse.setContent(newPost.getContent());

        return postResponse;
    }
}
