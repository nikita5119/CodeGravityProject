package mvc.controller.ui;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mvc.dataAccessLayer.UserEntity;
import mvc.service.BusinessLogic;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class UIcontroller {
	
	@Autowired
	BusinessLogic bl;

	@GetMapping("/allEmployee")
    public List<UserEntity> getAllEmployees() {
        return bl.getAllUsers();
    }
	
	@GetMapping("/getEmployeeById/{id}")
    public UserEntity getEmployeeById(@PathVariable Long id) {
        return bl.getUserById(id);
    }
	
	@PostMapping("/addEmployee")
    public UserEntity addEmployee(@RequestBody UserEntity employee) {
        return bl.addUser(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        bl.deleteUser(id);
    }

    @PutMapping("/updateEmployee/{id}")
    public UserEntity updateEmployee(@PathVariable Long id, @RequestBody UserEntity updatedEmployee) {
        return bl.updateUser(id, updatedEmployee);
    }

}
