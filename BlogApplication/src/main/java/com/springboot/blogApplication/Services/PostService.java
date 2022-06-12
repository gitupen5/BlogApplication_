package com.springboot.blogApplication.Services;

import com.springboot.blogApplication.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
