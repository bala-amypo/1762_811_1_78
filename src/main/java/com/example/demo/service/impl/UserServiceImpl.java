// package com.example.demo.service.impl;

// import com.example.demo.model.User;
// import com.example.demo.repository.UserRepository;
// import com.example.demo.service.UserService;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class UserServiceImpl implements UserService {

//     private final UserRepository repo;

//     public UserServiceImpl(UserRepository repo) {
//         this.repo = repo;
//     }

//     public User save(User user) {
//         return repo.save(user);
//     }

//     public User getById(Long id) {
//         return repo.findById(id).orElseThrow();
//     }

//     public List<User> getAll() {
//         return repo.findAll();
//     }

//     public User update(Long id, User u) {
//         User e = getById(id);
//         e.setFullName(u.getFullName());
//         e.setEmail(u.getEmail());
//         e.setPassword(u.getPassword());
//         e.setRole(u.getRole());
//         return repo.save(e);
//     }

//     public void delete(Long id) {
//         repo.deleteById(id);
//     }
// }
