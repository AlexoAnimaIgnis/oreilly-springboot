package main.comment.repositories;

import main.comment.model.Comment;

/**
 * Stores the commen in the database. CommentService uses this responsibility to implement
 * the publish use case
 */
public interface CommentRepository {
    void storeComment(Comment comment);
}
