package com.myblogg9.service;

import com.myblogg9.payload.PostDto;
import com.myblogg9.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto savePost(PostDto postDto);

    void deletePostById(long id);

    PostDto getPostById(Long id);

    PostDto updatePost(Long id, PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}

