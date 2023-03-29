package net.javaguides.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;

@RestController
@CrossOrigin(origins = "*")

public class CRUDRestController {
	@Autowired
	CRUDService service;

	@GetMapping("/companyList")
	public ResponseEntity<List<Company>> getCompanyList() {
		return new ResponseEntity<List<Company>>(service.getCompanyList(), HttpStatus.OK);
	}
	@GetMapping("/company/{id}")
	public ResponseEntity<Company> getCompany(@PathVariable Integer id) {
		return new ResponseEntity<Company>(service.getCompanyById(id), HttpStatus.OK);
	}

	@PostMapping("/company/save")
	public ResponseEntity<Void> saveOrUpdateCompany(@RequestBody Company company) {
		service.saveOrUpdateCompany(company);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/company/delete/{id}")
	public ResponseEntity<Void> deleteCompany(@PathVariable Integer id) {
		service.deleteCompany(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
