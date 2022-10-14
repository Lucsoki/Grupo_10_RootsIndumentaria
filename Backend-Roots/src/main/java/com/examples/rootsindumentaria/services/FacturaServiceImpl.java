package com.example.rootsindumentaria.services;

import com.example.rootsindumentaria.entities.Factura;
import com.example.rootsindumentaria.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public  class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements FacturaService {
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository);
    }
}
