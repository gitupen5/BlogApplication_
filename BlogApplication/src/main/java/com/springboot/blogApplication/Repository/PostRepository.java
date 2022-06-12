package com.springboot.blogApplication.Repository;

import com.springboot.blogApplication.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

//Don't need to add @Repository and @Transaction annotation cuz it has been taken care inside JPA Repository.
public interface PostRepository extends JpaRepository<Post, Long> {

}


