package com.example.demo.App;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    private Map<Integer, User> userDb = new HashMap<>();

    @GetMapping
    public List<User> getAllUsers() {
        return new ArrayList<>(userDb.values());
    }

    @PostMapping
    public String createUser(@RequestBody User user) {
        userDb.putIfAbsent(user.getId(), user);
        return "user created";
    }

    @PutMapping
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        if (!userDb.containsKey(user.getId()))
            return ResponseEntity.notFound().build();
        userDb.put(user.getId(), user);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        if(!userDb.containsKey(id))
            return ResponseEntity.notFound().build();
        userDb.remove(id);
        return ResponseEntity.noContent().build();
    }
}