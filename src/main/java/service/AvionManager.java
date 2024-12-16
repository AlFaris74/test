package service;

import dao.entities.Avion;
import dao.repositories.AvionRepos;
import dtos.AvionDto;
import lombok.AllArgsConstructor;
import mapper.AvionMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AvionManager implements AvionService{
    private AvionRepos avionRepos;
    private AvionMapper avionMapper;

    @Override
    public AvionDto save(AvionDto avionDto) {
        Avion avion = avionMapper.fromAvionDtoToAvion(avionDto);
        avion = avionRepos.save(avion);
        avionDto = avionMapper.fromAvionToAvionDto(avion);
        return avionDto;
    }

    public

}
