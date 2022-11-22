package zw.co.sammacmedia.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.sammacmedia.ems.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
