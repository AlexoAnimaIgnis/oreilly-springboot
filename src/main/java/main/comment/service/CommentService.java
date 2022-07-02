package main.comment.service;

import main.comment.model.Comment;
import main.comment.proxies.CommentNotificationProxy;
import main.comment.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Object responsible for implementing the publish commment use case
 */
@Service
public class CommentService {
    /**
     * define the dependencies of the class
     */
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;


    /**
     * constructor args parameters
     * @param commentRepository
     * @param commentNotificationProxy
     */
    public CommentService(CommentRepository commentRepository,
                          @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
