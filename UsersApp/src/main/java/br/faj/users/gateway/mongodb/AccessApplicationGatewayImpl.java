package br.faj.users.gateway.mongodb;

import br.faj.users.domain.AccessApplication;
import br.faj.users.domain.AccessApplicationMapper;
import br.faj.users.gateway.AccessApplicationGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccessApplicationGatewayImpl implements AccessApplicationGateway{

    private final AccessApplicationRepository accessApplicationRepository;
    private final AccessApplicationMapper accessApplicationMapper;

    @Autowired
    public AccessApplicationGatewayImpl(AccessApplicationRepository accessApplicationRepository, AccessApplicationMapper accessApplicationMapper) {
        this.accessApplicationRepository = accessApplicationRepository;
        this.accessApplicationMapper = accessApplicationMapper;
    }

    @Override
    public AccessApplication findByNameapplication(String nameApplication) {
        return accessApplicationMapper.mapParaDomain(accessApplicationRepository.findByNameapplication(nameApplication));
    }

    @Override
    public AccessApplication findByType(String type) {
        return accessApplicationMapper.mapParaDomain(accessApplicationRepository.findByType(type));
    }

    @Override
    public AccessApplication save(AccessApplication accessApplicationSave) {
        return accessApplicationMapper.mapParaDomain(accessApplicationRepository.save(accessApplicationMapper.mapParaEntity(accessApplicationSave)));
    }
}