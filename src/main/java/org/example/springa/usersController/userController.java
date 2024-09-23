package org.example.springa.usersController;

import org.example.springa.DBC.useDAO;
import org.example.springa.users.user;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class userController {

    @GetMapping("/user")
    public List<user> fetchAllUse() throws SQLException {
        useDAO rs = new useDAO();
        return rs.getuse();
    }
    @PostMapping("/postUser")
    public void createUser(@RequestBody user user) throws SQLException {
        useDAO rs = new useDAO();
        rs.setUser(user);
    }

//    @GetMapping("/user")
//    public  List<user> showAllUse(){
//
//    }
}
