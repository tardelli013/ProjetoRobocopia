package robocopia.repository;

import org.springframework.data.repository.CrudRepository;

import robocopia.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByEmail(String email);
}
