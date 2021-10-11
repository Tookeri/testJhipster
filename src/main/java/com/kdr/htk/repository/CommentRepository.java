package com.kdr.htk.repository;

import com.kdr.htk.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the {@link Comment} entity.
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {}
