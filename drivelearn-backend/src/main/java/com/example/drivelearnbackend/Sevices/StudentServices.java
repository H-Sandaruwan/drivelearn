package com.example.drivelearnbackend.Sevices;

import com.example.drivelearnbackend.Controllers.DTO.StudentDTO;
import com.example.drivelearnbackend.Repositories.BranchRepository;
import com.example.drivelearnbackend.Repositories.Entity.*;
import com.example.drivelearnbackend.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class StudentServices {
    @Autowired
    BranchRepository branchRepository;

    @Autowired
    private StudentRepository repository;

    public Student addStudent(StudentDTO dto){
        System.out.println("before the branch search");


        List<Feedback> feedbacks=new ArrayList<>();
        Branch branch=branchRepository.findBranchByBranchName(dto.getBranch());
        List<StuSession> stuSessionList=new ArrayList<>();
        List<Cource> courceList=new ArrayList<>();
        List<Payment> paymentList=new ArrayList<>();
        List<VechileType> vechileTypes=new ArrayList<>();
//        Calendar DOB = Calendar.getInstance();
        Date DOB=new Date(Integer.parseInt(dto.getYear()),Integer.parseInt(dto.getMonth())-1,Integer.parseInt(dto.getDay()));


        repository.save(new Student(new Date(), dto.getNid(), dto.getAddress(),DOB, dto.getUsername(), dto.getPassword(), dto.getContact(), feedbacks,branch,stuSessionList,courceList,paymentList,vechileTypes));
        System.out.println(branch.getBranchName());
        return null;
    }

    public void addStudent(){
        repository.save(new Student());
    }
    public void test(){
        System.out.println("we are in the service of the test now");
    }
}
