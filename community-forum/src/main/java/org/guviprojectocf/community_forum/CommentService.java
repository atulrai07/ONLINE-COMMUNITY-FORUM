package org.guviprojectocf.community_forum.service;

import org.guviprojectocf.community_forum.model.Comment;
import org.guviprojectocf.community_forum.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    // Get all comments
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    // Create a new comment
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    // Get comments for a specific post
    public List<Comment> getCommentsByPostId(Long postId) {
        return commentRepository.findAll().stream()
                .filter(comment -> comment.getPost().getId().equals(postId))
                .toList();
    }

    // Delete a comment by ID
    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);
    }
}