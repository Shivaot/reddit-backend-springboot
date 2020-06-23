package com.shivaot.redditclone.repositories;

import com.shivaot.redditclone.entities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {
}
