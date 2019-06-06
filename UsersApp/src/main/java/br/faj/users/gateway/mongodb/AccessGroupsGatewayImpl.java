package br.faj.users.gateway.mongodb;

import br.faj.users.domain.AccessGroups;
import br.faj.users.domain.AccessGroupsMapper;
import br.faj.users.gateway.AccessGroupsGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccessGroupsGatewayImpl implements AccessGroupsGateway {

    private final AccessGroupsRepository accessGroupsRepository;
    private final AccessGroupsMapper accessGroupsMapper;

    @Autowired
    public AccessGroupsGatewayImpl(AccessGroupsRepository accessGroupsRepository, AccessGroupsMapper accessGroupsMapper) {
        this.accessGroupsRepository = accessGroupsRepository;
        this.accessGroupsMapper = accessGroupsMapper;
    }

    @Override
    public AccessGroups findById(Integer id) {
        return accessGroupsMapper.mapParaDomain(accessGroupsRepository.findById(id));
    }

    @Override
    public AccessGroups findByDescription(String description) {
        return accessGroupsMapper.mapParaDomain(accessGroupsRepository.findByDescription(description));
    }

    @Override
    public AccessGroups save(AccessGroups accessGroupsSave) {
        return accessGroupsMapper.mapParaDomain(accessGroupsRepository.save(accessGroupsMapper.mapParaEntity(accessGroupsSave)));
    }
}
