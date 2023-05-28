package com.website.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.website.board.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	 // 필요한 추가적인 메서드 선언 가능
}
