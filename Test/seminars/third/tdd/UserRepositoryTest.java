package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void removeAll() {
        User user1=new User("test","123",false);
        User user2=new User("test1","123",false);
        User user3=new User("test2","123",false);
        User user4=new User("admin","123",true);
        UserRepository userRepository=new UserRepository();
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(user3);
        userRepository.addUser(user4);
        userRepository.removeAll();
        assertEquals(1,userRepository.data.size());
    }
}