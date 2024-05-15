package mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.dataAccessLayer.UserEntity;
import mvc.dataAccessLayer.UserRepository;
import java.util.List;
@Service
public class BusinessLogic {
	@Autowired
	UserRepository ur;
	
	public List<UserEntity> getAllUsers() {
        return ur.findAll();
    }
	
	public UserEntity getUserById(Long id) {
        return ur.findById(id).orElse(null);
    }
	
	
	 public UserEntity addUser(UserEntity user) {
	        return ur.save(user);
	    }

	    public void deleteUser(Long id) {
	        ur.deleteById(id);
	    }

	    public UserEntity updateUser(Long id, UserEntity updatedUser) {
	        UserEntity user = ur.findById(id).orElse(null);
	        user.setFirstName(updatedUser.getFirstName());
	        user.setLastName(updatedUser.getLastName());
	        user.setDateOfBirth(updatedUser.getDateOfBirth());
	        user.setLast4Ssn(updatedUser.getLast4Ssn());
	        return ur.save(user);
	    }
}
