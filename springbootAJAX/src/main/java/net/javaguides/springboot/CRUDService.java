package net.javaguides.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRUDService {
	@Autowired
	CRUDRepo repo;
	
	public List<Company> getCompanyList() {
		return repo.findAll();
	}

	public Company getCompanyById(Integer id) {
		return repo.findById(id).get();
	}

	public void saveOrUpdateCompany(Company company) {
		repo.save(company);
	}
	
	public void deleteCompany(Integer id) {
		repo.deleteById(id);
	}
}
