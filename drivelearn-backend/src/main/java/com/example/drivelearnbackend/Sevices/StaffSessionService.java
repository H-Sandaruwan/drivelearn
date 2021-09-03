package com.example.drivelearnbackend.Sevices;

import com.example.drivelearnbackend.Controllers.DTO.EmployeeDTO;
import com.example.drivelearnbackend.Controllers.DTO.StaffSessionDTO;
import com.example.drivelearnbackend.Controllers.DTO.VehicleDTO;
import com.example.drivelearnbackend.Repositories.BranchRepository;
import com.example.drivelearnbackend.Repositories.EmployeeRepository;
import com.example.drivelearnbackend.Repositories.Entity.Employee;
import com.example.drivelearnbackend.Repositories.Entity.Session;
import com.example.drivelearnbackend.Repositories.Entity.Vehicle;
import com.example.drivelearnbackend.Repositories.SessionRepository;
import com.example.drivelearnbackend.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class StaffSessionService {
    @Autowired
    private SessionRepository sessionRepository;

    @Autowired
    private BranchRepository branchRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    public LinkedList<StaffSessionDTO> getAllSession(int branchId){
        LinkedList<StaffSessionDTO> sessionDTOS=new LinkedList<>();
        for (Session session : sessionRepository.findAllByBranch(branchRepository.findById(branchId).get())) {
            sessionDTOS.add(new StaffSessionDTO(session.getSessionId(), session.getTrainer().getFullName(),session.getDate(),session.getStatus(),session.getNumOfStudent(),session.getStartTime(),session.getStuSessions().size()));
        }
        return sessionDTOS;
    }

    public LinkedList<EmployeeDTO> getAllTrainers(int branchId){
        LinkedList<EmployeeDTO> list=new LinkedList<>();
        for (Employee employee : employeeRepository.findAllByBranchAndRole(branchRepository.findById(branchId).get(), 2)) {
            list.add(new EmployeeDTO(employee.getFullName(),employee.getEmpid()));
        }

        return list;
    }

    public LinkedList<VehicleDTO> getAllVehicles(int branchId){
        LinkedList<VehicleDTO> list=new LinkedList<>();
        for (Vehicle vehicleByBranch : vehicleRepository.findVehicleByBranch(branchRepository.findById(branchId).get())) {
            list.add(new VehicleDTO(vehicleByBranch.getVechicleId(),vehicleByBranch.getRegiNumner()));
        }

        return list;
    }
}