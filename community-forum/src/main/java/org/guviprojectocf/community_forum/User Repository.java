package org.guviprojectocf.community_forum;

import org.guviprojectocf.community_forum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}