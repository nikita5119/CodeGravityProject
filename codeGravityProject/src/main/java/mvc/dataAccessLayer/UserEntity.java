package mvc.dataAccessLayer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
	@Table(name="Employee")
	public class UserEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "employee_id")
	    Long employeeId;
			
		@Column(name="first_name", nullable=false) 
		String firstName;
		
		@Column(name="last_name", nullable=false)
		String lastName;
		
		

	    @Column(name = "dob", nullable=false)
	     Date dateOfBirth;
	    
	    @Column(name = "last_4_ssn", nullable=false, length =4, unique=true)
	    String last4Ssn;
	    
	    public UserEntity() {
	    }

	    public UserEntity(String firstName, String lastName, Date dateOfBirth, String last4Ssn) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dateOfBirth = dateOfBirth;
	        this.last4Ssn = last4Ssn;
	    }

	    

	    public Long getEmployeeId() {
			return employeeId;
		}



		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}



		public String getFirstName() {
			return firstName;
		}



		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}



		public String getLastName() {
			return lastName;
		}



		public void setLastName(String lastName) {
			this.lastName = lastName;
		}



		



		public Date getDateOfBirth() {
			return dateOfBirth;
		}



		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}



		public String getLast4Ssn() {
			return last4Ssn;
		}



		public void setLast4Ssn(String last4Ssn) {
			this.last4Ssn = last4Ssn;
		}



		
}

