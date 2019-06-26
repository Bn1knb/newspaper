package com.github.newspaper.service;

import com.github.newspaper.entity.Post;
import com.github.newspaper.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    void post(Post post);

    void approve(Post post);

    void delete(String headline);

    void change(String headline);

    Iterable<Post> getPostsOrderBYDate();

    Iterable<Post> getPostsOrderByComments();

    List<Post> findAllPostsOfUser(User user);

    Post findById(Long id);

    List<Post> findLatest5();
}
