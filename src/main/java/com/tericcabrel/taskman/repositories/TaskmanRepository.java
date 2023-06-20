package com.tericcabrel.taskman.repositories;

import com.tericcabrel.taskman.models.TaskmanModel;
import org.springframework.data.jpa.repository.JpaRepository;

//Chứa các hàm lấy data về
public interface TaskmanRepository extends JpaRepository<TaskmanModel, Long> {
    //TaskmanModel: kiểu của thực thể đang sử dụng
    //Long: kiểu như primary key trường khóa chính (ví dụ như ID)

}
