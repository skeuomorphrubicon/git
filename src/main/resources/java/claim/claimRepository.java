package claim;

import org.springframework.data.repository.CrudRepository;

import claim.Claim;

public interface claimRepository extends CrudRepository<Claim, Integer> {
	
}