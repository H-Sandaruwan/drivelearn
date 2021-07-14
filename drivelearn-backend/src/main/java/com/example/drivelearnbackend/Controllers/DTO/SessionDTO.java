package com.example.drivelearnbackend.Controllers.DTO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class SessionDTO {
    private int sessionId;
    private String trainerUsername;
    private LocalDate date;
    private int status;
    private int numOfStudent;
    private String route;
    private String startTime;
    private String endTime;

    private int managerId;
    private int trainerId;

    public SessionDTO() {
    }


    public SessionDTO(int sessionId, String trainerUsername, LocalDate date, int status, int numOfStudent, String route, String startTime, String endTime) {
        this.sessionId = sessionId;
        this.trainerUsername = trainerUsername;
        this.date = date;
        this.status = status;
        this.numOfStudent = numOfStudent;
        this.route = route;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getSessionId() {
        return sessionId;
    }


    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public String getTrainerUsername() {
        return trainerUsername;
    }

    public void setTrainerUsername(String trainerUsername) {
        this.trainerUsername = trainerUsername;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
