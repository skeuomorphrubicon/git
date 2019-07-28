package claim;

import javax.persistence.*;
import java.io.Serializable;

@Entity // This tells Hibernate to make a table out of this class
public class User implements Serializable{
	
    @Id
    @GeneratedValue
    private Long id;
    
    @Column(nullable = false)
    private Enum role;

    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String address;
    
    @OneToMany(mapped By = "claimant", cascade = CascadeType.ALL, orphanRemoval = false)
    private ArrayList<Claim> claims = new ArrayList<>();
    
    protected User() {
    	
    }
    
    public User(Enum role, String name, String email, String address) {
    	this.role = role;
    	this.name = name;
    	this.email = email;
    	this.address = address;
    }
    

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Enum getRole() {
		return this.role;
	}
	
	public void setRole(Enum role) {
		this.role = role;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}


}