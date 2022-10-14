package com.example.rootsindumentaria.services;

import org.springframework.stereotype.Service;

@Service
public  class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements FacturaService {
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository);
    }
}
