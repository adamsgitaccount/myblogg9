package com.myblogg9.service;

import com.myblogg9.payload.CommentDto;

import java.util.List;

public interface CommentService {
    public CommentDto createComment(long postId, CommentDto commentDto);
    public void deleteCommentById(long postID, long commentId);

    List<CommentDto> getCommentByPostId(long postId);

    CommentDto updateComment(long commentId, CommentDto commentDto);
}
