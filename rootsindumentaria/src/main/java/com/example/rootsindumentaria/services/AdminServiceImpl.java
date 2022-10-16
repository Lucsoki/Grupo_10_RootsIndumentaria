package com.example.rootsindumentaria.services;

import com.example.rootsindumentaria.entities.Admin;
import com.example.rootsindumentaria.repositories.AdminRepository;
import com.example.rootsindumentaria.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin, Long> implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public AdminServiceImpl(BaseRepository<Admin, Long> baseRepository){
        super(baseRepository);
    }
}
