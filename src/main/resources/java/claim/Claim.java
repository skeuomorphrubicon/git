package claim;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity 
@ConfigurationProperties
public class Claim {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    @ManyToOne
    @Column(nullable = false)
    private User claimant;
    
    @Column(nullable = false)
    private String address;
    
    @Column(Optional = true)
    private User staff;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Enum status;
    
    @Column(nullable = false)
    private LocalDate created; // LocalDate localDate = LocalDate.now();
    
    @Column(Optional = true)
    private LocalDate assigned;
    
    @Column(Optional = true)
    private String summary;
    
    @Column(Optional = true)
    private String comment;
    
    protected Claim() {
    	
    }
    
    public void Claim(String title, User claimant, String address, String summary) {
    	this.title = title;
    	this.claimant = claimant;
    	this.address = address;
    	this.staff = null;
    	this.status = 'pending';
    	this.created = LocalDate.now();
    	this.assigned = null;
    	this.summary = summary;
    	this.comment = null;
    }
    
    public Long getId() {
    	return this.id;
    }
    
    public void setId(Long id) {
    	this.id = id;
    }
    
    public String getTitle() {
    	return this.title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public User getClaimant() {
    	return this.claimant;
    }
    
    public void setClaimant(User claimant) {
    	this.claimant = claimant;
    }
    
    public String getAddress() {
    	return this.address;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
    public User getStaff() {
    	return this.staff;
    }
    
    public void setStaff(User staff) {
    	this.staff = staff;
    }
    
    public Enum getStatus() {
    	return this.status;
    }
    
    public void setStatus(Enum status) {
    	this.status = status;
    }
    
    public LocalDate getCreated() {
    	return this.created;
    }
    
    public void setCreated(LocalDate created) {
    	this.created = created;
    }
    
    public LocalDate getAssigned() {
    	return this.assigned;
    }
    
    public void setAssigned(LocalDate assigned) {
    	this.assigned = assigned;
    }
    
    public String getSummary() {
    	return this.summary;
    }
    
    public void setSummary(String summary) {
    	this.summary = summary;
    }
    
    public String getComment() {
    	return this.comment;
    }
    
    public void setComment(String comment) {
    	this.comment = comment;
    }
    
}