package com.example.drivelearnbackend.Repositories;

import com.example.drivelearnbackend.Repositories.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
