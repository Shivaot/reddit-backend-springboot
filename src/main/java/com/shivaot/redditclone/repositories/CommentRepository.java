package com.shivaot.redditclone.repositories;

import com.shivaot.redditclone.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
