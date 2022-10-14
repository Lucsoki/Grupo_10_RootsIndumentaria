package com.example.rootsindumentaria.services;

import com.example.rootsindumentaria.entities.DetalleFactura;
import com.example.rootsindumentaria.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public  class DetalleFacturaServiceImpl extends BaseServiceImpl<DetalleFactura,Long> implements DetalleFacturaService{
    public DetalleFacturaServiceImpl(BaseRepository<DetalleFactura, Long> baseRepository) {
        super(baseRepository);
    }
}
