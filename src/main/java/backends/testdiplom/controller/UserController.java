package backends.testdiplom.controller;

import backends.testdiplom.dto.CreateUserDto;
import backends.testdiplom.dto.NewPasswordDto;
import backends.testdiplom.dto.ResponseWrapperDto;
import backends.testdiplom.dto.UserDto;
import backends.testdiplom.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(value = "http://localhost:3000")
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<CreateUserDto> addUser(@RequestBody CreateUserDto createUser) {
        if (createUser.getEmail() == null || createUser.getPassword() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        CreateUserDto createUserDto = userService.addUser(createUser);
        return ResponseEntity.ok(createUserDto);
    }

    @GetMapping("/me")
    public ResponseEntity<ResponseWrapperDto<UserDto>> getUsers() {
        ResponseWrapperDto<UserDto> result = userService.getUsers();
        return ResponseEntity.ok(result);
    }

    @PatchMapping("/me")
    public ResponseEntity<UserDto> updateUser(@RequestBody UserDto user) {
        UserDto result = userService.updateUser(user);
        if (result == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping("/set_password")
    public ResponseEntity<NewPasswordDto> setPassword(@RequestBody NewPasswordDto password) {
        NewPasswordDto result = userService.setPassword(password);
        if (result == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Integer id) {
        UserDto result = userService.getUser(id);
        if (result == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(result);
    }




}
