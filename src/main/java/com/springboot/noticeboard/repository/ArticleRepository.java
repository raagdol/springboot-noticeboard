package com.springboot.noticeboard.repository;

import com.springboot.noticeboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}