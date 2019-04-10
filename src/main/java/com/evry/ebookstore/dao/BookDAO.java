package com.evry.ebookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evry.ebookstore.model.BookEntity;

/**
 * 
 * @author deepak.ja
 *
 */

public interface BookDAO extends JpaRepository<BookEntity, Long>{
	
	
}
