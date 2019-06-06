package br.faj.users.gateway.mongodb;

import br.faj.users.domain.AccessGroupApplication;
import br.faj.users.domain.AccessGroupApplicationMapper;
import br.faj.users.gateway.AccessGroupApplicationGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AccessGroupApplicationGatewayImpl implements AccessGroupApplicationGateway{

    private final AccessGroupApplicationRepository accessGroupApplicationRepository;
    private final AccessGroupApplicationMapper accessGroupApplicationMapper;

    @Autowired
    public AccessGroupApplicationGatewayImpl(AccessGroupApplicationRepository accessGroupApplicationRepository, AccessGroupApplicationMapper accessGroupApplicationMapper) {
        this.accessGroupApplicationRepository = accessGroupApplicationRepository;
        this.accessGroupApplicationMapper = accessGroupApplicationMapper;

}

    @Override
    public AccessGroupApplication findByInclude(String include) {
        return accessGroupApplicationMapper.mapParaDomain(accessGroupApplicationRepository.findByInclude(include));
    }

    @Override
    public AccessGroupApplication findByAlter(String alter) {
        return accessGroupApplicationMapper.mapParaDomain(accessGroupApplicationRepository.findByAlter(alter));
    }

    @Override
    public AccessGroupApplication findByDelete(String delete) {
        return accessGroupApplicationMapper.mapParaDomain(accessGroupApplicationRepository.findByDelete(delete));
    }

    @Override
    public List<AccessGroupApplication> findAll() {
        return accessGroupApplicationRepository.findAll().stream().map(accessGroupApplicationMapper::mapParaDomain).collect(Collectors.toList());
    }

    @Override
    public AccessGroupApplication Save(AccessGroupApplication accessGroupApplicationSave) {
        return accessGroupApplicationMapper.mapParaDomain(accessGroupApplicationRepository.save(accessGroupApplicationMapper.mapParaEntity(accessGroupApplicationSave)));
    }
}