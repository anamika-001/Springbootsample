package springbootsamplehrr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootsamplehrr.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
