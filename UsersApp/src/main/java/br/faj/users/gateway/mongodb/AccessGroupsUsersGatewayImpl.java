package br.faj.users.gateway.mongodb;

import br.faj.users.domain.AccessGroupsUsers;
import br.faj.users.domain.AccessGroupsUsersMapper;
import br.faj.users.gateway.AccessGroupsUsersGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AccessGroupsUsersGatewayImpl implements AccessGroupsUsersGateway {

    private final AccessGroupsUsersRepository accessGroupsUsersRepository;
    private final AccessGroupsUsersMapper accessGroupsUsersMapper;

    @Autowired
    public AccessGroupsUsersGatewayImpl(AccessGroupsUsersRepository accessGroupsUsersRepository, AccessGroupsUsersMapper accessGroupsUsersMapper) {
        this.accessGroupsUsersRepository = accessGroupsUsersRepository;
        this.accessGroupsUsersMapper = accessGroupsUsersMapper;
    }

    @Override
    public List<AccessGroupsUsers> findAll() {
        return accessGroupsUsersRepository.findAll().stream().map(accessGroupsUsersMapper::mapParaDomain).collect(Collectors.toList());
    }

    @Override
    public AccessGroupsUsers save(AccessGroupsUsers accessGroupsUsersSave) {
        return accessGroupsUsersMapper.mapParaDomain(accessGroupsUsersRepository.save(accessGroupsUsersMapper.mapParaEntity(accessGroupsUsersSave)));
    }
}
