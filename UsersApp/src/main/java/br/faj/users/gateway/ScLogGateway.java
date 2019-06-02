package br.faj.users.gateway;

import br.faj.users.domain.ScLog;
import br.faj.users.domain.UsersAccess;
import br.faj.users.domain.AccessApplication;
import java.util.List;

public interface ScLogGateway {

    ScLog getById(Integer id);
    ScLog findByIdDatetime(String dateTime);
    ScLog findByEvent(String event);
    ScLog findByDatatext(String dataText);
    ScLog findByUsersaccess(List<UsersAccess> usersAccesses);
    ScLog findByAccessapplication(List<AccessApplication> accessApplications);
    List<ScLog> findAll();

}
