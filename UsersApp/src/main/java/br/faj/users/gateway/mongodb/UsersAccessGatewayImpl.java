package br.faj.users.gateway.mongodb;

import br.faj.users.domain.UsersAccess;
import br.faj.users.domain.UsersAccessMapper;
import br.faj.users.gateway.UsersAccessGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsersAccessGatewayImpl implements UsersAccessGateway {

    private final UsersAccessRepository usersAccessRepository;
    private final UsersAccessMapper usersAccessMapper;

    @Autowired
    public UsersAccessGatewayImpl(UsersAccessRepository usersAccessRepository, UsersAccessMapper usersAccessMapper) {
        this.usersAccessRepository = usersAccessRepository;
        this.usersAccessMapper = usersAccessMapper;
    }

    @Override
    public UsersAccess findByLogin(String login) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByLogin(login));
    }

    @Override
    public UsersAccess findByName(String name) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByName(name));
    }

    @Override
    public UsersAccess findByPassword(String password) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByPassword(password));
    }

    @Override
    public UsersAccess findByCpf(Integer cpf) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByCpf(cpf));
    }

    @Override
    public UsersAccess findByEmail(String email) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByEmail(email));
    }

    @Override
    public UsersAccess findByTelphone(Integer telphone) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByTelphone(telphone));
    }

    @Override
    public UsersAccess findByCelphone(Integer celphone) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByCelphone(celphone));
    }

    @Override
    public UsersAccess findByBirthdate(String birthDate) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByBirthdate(birthDate));
    }

    @Override
    public UsersAccess findByAddress1(String address1) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByAddress1(address1));
    }

    @Override
    public UsersAccess findByAddress2(String address2) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.findByAddress2(address2));
    }

    @Override
    public UsersAccess save(UsersAccess usersAccessSave) {
        return usersAccessMapper.mapParaDomain(usersAccessRepository.save(usersAccessMapper.mapParaEntity(usersAccessSave)));
    }
}
