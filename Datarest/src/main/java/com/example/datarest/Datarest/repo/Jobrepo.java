package com.example.datarest.Datarest.repo;


import com.example.datarest.Datarest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Jobrepo extends JpaRepository<JobPost,Integer> {


}