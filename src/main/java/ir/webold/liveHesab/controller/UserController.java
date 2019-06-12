package ir.webold.liveHesab.controller;

import ir.webold.liveHesab.base.BaseController;
import ir.webold.liveHesab.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<User,UUID>{

}
