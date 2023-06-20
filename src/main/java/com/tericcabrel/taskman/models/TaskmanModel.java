package com.tericcabrel.taskman.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TaskmanModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Cấp cho id kiểu Generation là auto (kiểu tự động tăng)
    private Long id;
    private String taskManName;
    private int year;
    private Double price;
    private String url;

    public TaskmanModel() {}

    public TaskmanModel(String taskManName, int year, Double price, String url) {
        this.taskManName = taskManName;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskManName() {
        return taskManName;
    }

    public void setTaskManName(String taskManName) {
        this.taskManName = taskManName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TaskmanModel{" +
                "id=" + id +
                ", taskManName='" + taskManName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}
