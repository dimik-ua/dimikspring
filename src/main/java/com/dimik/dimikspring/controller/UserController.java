package com.dimik.dimikspring.controller;

import com.dimik.dimikspring.entity.UserEntity;
import com.dimik.dimikspring.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            if (userRepo.findByUsername(user.getUsername()) != null){
                return ResponseEntity.ok("User with this name already exists!");
            }
            userRepo.save(user);
            return ResponseEntity.ok("User saved successfully!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping
    public ResponseEntity getUsers() {
        try {
            return ResponseEntity.ok("The server is running!");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
