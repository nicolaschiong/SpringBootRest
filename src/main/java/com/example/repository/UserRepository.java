package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Nick on 3/14/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
