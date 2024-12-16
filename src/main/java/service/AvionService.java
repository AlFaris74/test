package service;

import dao.entities.Avion;
import dtos.AvionDto;

import java.util.List;

public interface AvionService {

    public AvionDto save(AvionDto a);

    public boolean delete(Long id);

    public List<AvionDto> getAvionByModel(String model);
    public List<AvionDto> getAvionByModelAndPrice(String model , double price);
    public List<AvionDto> getAvionById(Long id);
}
