package georgiaLibrary.georgia.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import georgiaLibrary.georgia.entity.UserEntity;

@Transactional
public interface UserRepository extends JpaRepository<UserEntity, String>{

	@Query(value = "insert into authorities (username,authority) select ?1,authority from authority_list where admin=1",nativeQuery = true)
	@Modifying
	void addAdminAuthorities(String username);
	
}
