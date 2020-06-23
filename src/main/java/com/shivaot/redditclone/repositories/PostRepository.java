package com.shivaot.redditclone.repositories;

import com.shivaot.redditclone.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
