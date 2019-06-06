package br.faj.users.gateway;

import br.faj.users.domain.ScLog;
import java.util.List;

public interface ScLogGateway {

    ScLog findById(Integer id);
    ScLog findByIdDatetime(String dateTime);
    ScLog findByEvent(String event);
    ScLog findByDatatext(String dataText);
    List<ScLog> findAll();

    ScLog save (ScLog scLogSave);

}
