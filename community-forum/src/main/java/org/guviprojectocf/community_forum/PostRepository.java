package org.guviprojectocf.community_forum;

import org.guviprojectocf.community_forum.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
