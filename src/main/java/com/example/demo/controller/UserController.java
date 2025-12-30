// package com.example.demo.controller;

// import com.example.demo.model.User;
// import com.example.demo.service.UserService;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/users")
// public class UserController {

//     private final UserService service;

//     public UserController(UserService service) {
//         this.service = service;
//     }

//     @PostMapping
//     public User create(@RequestBody User u) {
//         return service.save(u);
//     }

//     @GetMapping("/{id}")
//     public User get(@PathVariable Long id) {
//         return service.getById(id);
//     }

//     @GetMapping
//     public List<User> getAll() {
//         return service.getAll();
//     }

//     @PutMapping("/{id}")
//     public User update(@PathVariable Long id, @RequestBody User u) {
//         return service.update(id, u);
//     }

//     @DeleteMapping("/{id}")
//     public String delete(@PathVariable Long id) {
//         service.delete(id);
//         return "Deleted successfully";
//     }
// }