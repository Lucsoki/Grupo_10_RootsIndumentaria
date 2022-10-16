package com.example.rootsindumentaria.controllers;

import com.example.rootsindumentaria.entities.Admin;
import com.example.rootsindumentaria.services.AdminServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/admins")
public class AdminController extends BaseControllerImpl<Admin, AdminServiceImpl>{
}
