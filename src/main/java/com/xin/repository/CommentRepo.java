package com.xin.repository;

import com.xin.model.Comment;
import org.springframework.dao.DataAccessException;

import java.util.Collection;

/**
 * Author: Xin
 * Date: 14-5-5
 * Time: 上午9:49
 */
public interface CommentRepo {

    Long save(Comment comments) throws DataAccessException;

    Comment find(Long id) throws DataAccessException;

    Collection<Comment> findAll() throws DataAccessException;

}
