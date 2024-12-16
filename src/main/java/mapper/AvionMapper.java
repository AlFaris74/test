package mapper;

import dao.entities.Avion;
import dtos.AvionDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AvionMapper {
    ModelMapper modelMapper = new ModelMapper();
    public AvionDto fromAvionToAvionDto(Avion avion) { return modelMapper.map(avion, AvionDto.class); }
    public Avion fromAvionDtoToAvion(AvionDto avionDto) {return modelMapper.map(avionDto, Avion.class); }
}
