package com.shivaot.redditclone.repositories;

import com.shivaot.redditclone.entities.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubredditRepository extends JpaRepository<Subreddit,Long> {
}
