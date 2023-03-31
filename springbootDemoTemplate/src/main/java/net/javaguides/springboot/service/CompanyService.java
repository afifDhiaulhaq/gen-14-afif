package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.javaguides.springboot.entity.Company;
import net.javaguides.springboot.repo.CompanyRepo;

@Service
public class CompanyService {

	@Autowired
	CompanyRepo repo;

	public List<Company> getCompanyList() {
		return repo.findAll();
	}

	public Company getCompanyById(Long id) {
		return repo.findById(id).get();
	}

	public void saveOrUpdateCompany(Company company) {
		repo.save(company);
	}

	public void deleteCompany(Long id) {
		repo.deleteById(id);
	}


}
