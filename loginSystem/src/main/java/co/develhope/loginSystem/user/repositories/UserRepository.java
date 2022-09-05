package co.develhope.loginSystem.user.repositories;

import co.develhope.loginSystem.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    User getByActivationCode(String activationCode);

    User findByPasswordResetCode(String resetPasswordCode);
}
