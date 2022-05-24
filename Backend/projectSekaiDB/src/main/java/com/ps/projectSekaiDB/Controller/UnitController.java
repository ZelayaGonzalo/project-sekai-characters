package com.ps.projectSekaiDB.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ps.projectSekaiDB.Model.Unit;
import com.ps.projectSekaiDB.Repository.UnitRepository;

@RestController
public class UnitController {
	
	@Autowired
	UnitRepository unitRepository;
	
	@GetMapping("/getUnits")
	public List<Unit> getUnits(){
		return unitRepository.findAll();
	}
	@CrossOrigin
	@GetMapping("/getUnit")
	public Optional<Unit> getUnit(@RequestParam Long id){
		Optional<Unit> unit = unitRepository.findById(id);
		return unit;
	}
}
