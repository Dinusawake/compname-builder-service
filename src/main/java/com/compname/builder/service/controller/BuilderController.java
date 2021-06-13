package com.compname.builder.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compname.builder.service.dao.BuilderDao;
import com.compname.builder.service.entity.BuilderEntity;




@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Buildercontroller")
public class BuilderController {

	@GetMapping("/ping")
	public String Greeting()
	{
		return "pong";
	}

	@Autowired
	BuilderDao builderRepository;
	
	@GetMapping("/showbuilders")
	public List<BuilderEntity> getbuilder() 
	{
		return (List<BuilderEntity>) builderRepository.findAll();
	}
		
	@PostMapping("/savebuilder")
	public String insertbuilder(@RequestBody BuilderEntity builders) {
		builderRepository.save(builders);
		return "One builder saved successfully!";

	}
	@PostMapping("/savebuilders")
	public String insertbuilder(@RequestBody List<BuilderEntity> builders) {
		builderRepository.saveAll(builders);
		return "Builder's saved successfully!";

	}
	@PutMapping("/updatebuilder")
	public BuilderEntity updatebuilder(@RequestBody BuilderEntity builders) {
		return builderRepository.save(builders); 
	}
	
	@PutMapping("/updatebuilders")
	public List<BuilderEntity> updatebuilders(@RequestBody List<BuilderEntity> builders) {
		return builderRepository.saveAll(builders); 
	}
	
	@DeleteMapping("/deletebuilder")
	public String delete (@RequestBody BuilderEntity builders) {
		builderRepository.deleteById(builders.getId());
		return "Record deleted successfully !" ;
	}


}