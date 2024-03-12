package DAO.GeorgiaLibrary;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import Entity.GeorgiaLibrary.UserEntity;


@Transactional
public interface UserDAO extends JpaRepository<UserEntity, String>{

	@Query(value = "insert into authorities (username,authority) select ?1,authority from authority_list where admin=1",nativeQuery = true)
	@Modifying
	void addAdminAuthorities(String username);
	
}

