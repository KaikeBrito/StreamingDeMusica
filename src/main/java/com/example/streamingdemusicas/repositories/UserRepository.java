package com.example.streamingdemusicas.repositories;

import com.example.streamingdemusicas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

}
