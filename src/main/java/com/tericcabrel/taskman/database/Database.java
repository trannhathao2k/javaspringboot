package com.tericcabrel.taskman.database;

import com.tericcabrel.taskman.models.TaskmanModel;
import com.tericcabrel.taskman.repositories.TaskmanRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Class mà có Configuration bên trong sẽ chứa các method là Bean method
        //  Bean method sẽ được gọi ngay khi ứng dụng chạy
public class Database {

    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    //Logger để thay cho system.out.println

    @Bean
    CommandLineRunner initDatabase(TaskmanRepository taskmanRepository) {
        //Dùng để tạo ra một số dữ liệu ban đầu

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                TaskmanModel productA = new TaskmanModel("Macbook", 2023, 2400.0, "");
                TaskmanModel productB = new TaskmanModel("Dell", 2023, 850.0, "");

                //Luư 2 đối tượng vào database
                //Hàm save sẽ ấn 2 bản ghi vào database
                logger.info("Insert data: " + taskmanRepository.save(productA));
                logger.info("Insert data: " + taskmanRepository.save(productB));
            }
        };
    }
}
