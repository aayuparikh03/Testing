package dao;

import org.example.config.AppConfig;
import org.example.model.User;
import org.example.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppConfig.class)
@Sql(scripts = { "/data.sql"}) // Load schema and data
public class UserDaoMySQLTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGetUserNameById() {
        String userName = userDao.getUserNameById(1);
        assertEquals("John Doe", userName);
    }

}
