package com.CN.FitFusion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CN.FitFusion.exception.DietNotFoundException;
import com.CN.FitFusion.model.Diet;
import com.CN.FitFusion.repository.DietRepository;

@Service
public class DietService {
    
    @Autowired
    private DietRepository dietRepository;

    public List<Diet> getAllDiets(){
        return dietRepository.findAll();
    }

    public Diet getDietById(Long id){
        return dietRepository.findById(id)
            .orElseThrow(() -> new DietNotFoundException("diet not found"));
    }
}
