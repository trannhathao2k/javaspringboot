package com.tericcabrel.taskman.controllers;

import com.tericcabrel.taskman.models.TaskmanModel;
import com.tericcabrel.taskman.repositories.TaskmanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
//Báo cho Java Spring class này là Controller
@RequestMapping(path = "api/v1/Products")
//Gửi request cho từng controller
public class TaskmanController {

    @Autowired
    private TaskmanRepository repository;

    @GetMapping("") //request được gửi dưới dạng method GET
    List<TaskmanModel> getAllProducts() {
//        return List.of(new TaskmanModel(1L, "Mac Book Pro 16 inch", 2023, 2400.0, ""));
        return repository.findAll();
    }

    @GetMapping("/{id}")
    Optional<TaskmanModel> findById(@PathVariable Long id) {
        //Optional: giá trị trả về có thể NULL
        return repository.findById(id);
    }
}
