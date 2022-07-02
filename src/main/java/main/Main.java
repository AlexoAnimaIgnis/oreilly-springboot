package main;

import main.comment.model.Comment;
import main.comment.proxies.EmailCommentNotificationProxy;
import main.comment.repositories.DBCommentRepository;
import main.comment.service.CommentService;

public class Main {
    public static void main (String[] args) {

        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Alex");
        comment.setText("Demo comment");
        commentService.publishComment(comment);
    }
}
