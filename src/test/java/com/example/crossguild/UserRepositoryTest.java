package com.example.crossguild;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.crossguild.model.User;
import com.example.crossguild.repo.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(value = false)
public class UserRepositoryTest {
    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setUserName("vantanhly");
        user.setPassword("lyvantanh");
        user.setFirstName("Tanh");
        user.setLastName("Ly Van");
        user.setRole("1");

        User saveUser = repo.save(user);
        User exitUser = entityManager.find(User.class, saveUser.getId());
        assertThat(exitUser.getLastName());
    }
}
