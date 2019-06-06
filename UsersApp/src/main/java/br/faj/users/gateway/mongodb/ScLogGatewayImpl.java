package br.faj.users.gateway.mongodb;

import br.faj.users.domain.ScLog;
import br.faj.users.domain.ScLogMapper;
import br.faj.users.gateway.ScLogGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ScLogGatewayImpl implements ScLogGateway {

    private final ScLogRepository scLogRepository;
    private final ScLogMapper scLogMapper;

    @Autowired
    public ScLogGatewayImpl(ScLogRepository scLogRepository, ScLogMapper scLogMapper) {
        this.scLogRepository = scLogRepository;
        this.scLogMapper = scLogMapper;
    }

    @Override
    public ScLog findById(Integer id) {
        return scLogMapper.mapParaDomain(scLogRepository.findById(id));
    }

    @Override
    public ScLog findByIdDatetime(String dateTime) {
        return scLogMapper.mapParaDomain(scLogRepository.findByIdDatetime(dateTime));
    }

    @Override
    public ScLog findByEvent(String event) {
        return scLogMapper.mapParaDomain(scLogRepository.findByEvent(event));
    }

    @Override
    public ScLog findByDatatext(String dataText) {
        return scLogMapper.mapParaDomain(scLogRepository.findByDatatext(dataText));
    }

    @Override
    public List<ScLog> findAll() {
        return scLogRepository.findAll().stream().map(scLogMapper::mapParaDomain).collect(Collectors.toList());
    }

    @Override
    public ScLog save(ScLog scLogSave) {
        return scLogMapper.mapParaDomain(scLogRepository.save(scLogMapper.mapParaEntity(scLogSave)));
    }
}
