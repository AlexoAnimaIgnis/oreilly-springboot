package main.comment.proxies;

import main.comment.model.Comment;

/**
 * sends the comment to a specific email address
 */
public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
